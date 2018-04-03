package com.aisino.controller;

import com.aisino.client.MyClient;
import com.aisino.db1.dao.SysOrgMapper;
import com.aisino.db2.dao.InvoiceIndexMapper;
import com.aisino.db2.dao.VerificationCodeMapper;
import com.aisino.db2.dao.VerifiedInvoiceMapper;
import com.aisino.db2.domain.*;
import com.aisino.db2.service.VerifiedInvoiceService;
import com.aisino.service.QuartzService;
import com.aisino.to.InvoiceRequest;
import com.aisino.to.Message;
import com.aisino.to.Msg;
import com.aisino.vo.CompanyInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

/**
 * Created by zhukaishengy on 2018/3/21.
 */
@RestController
public class MyController {

    @Autowired
    private SysOrgMapper sysOrgMapper;

    @Autowired
    private QuartzService quartzService;

    @GetMapping("/getByTaxCode/{code}")
    public CompanyInfo getByTaxCode(@PathVariable("code") String code){
        return sysOrgMapper.getByTaxCode(code);
    }

    private String TOKEN;

    @GetMapping("/token")
    public Msg getTOKEN(){
        //1.判断当前日期是否过期
        try {
            if(quartzService.validateDate()){
                //2.过期了，重新发送请求，更新过期时间，更新token
                String token = MyClient.getToken();
                if(token != null){
                    // 获取到新token
                    quartzService.setToken("service.token",token);
                    quartzService.updateDeadLine();
                    return Msg.successResult(token);
                }else{
                    // 连接token服务器失败
                    return Msg.failResult();
                }
            }else{
                //3.没过期，直接返回token
                TOKEN = quartzService.getToken("service.token");
                return Msg.successResult(TOKEN);
            }
        } catch (ParseException e) {
            e.printStackTrace();
            return Msg.failResult();
        }
    }

//    @GetMapping("/token/{now}/{flag}")
//    public Msg test(@PathVariable("now") String now , @PathVariable("flag") String flag){
//        //1.判断当前日期是否过期
//        try {
//            if(quartzService.validateDateTest(now)){
//                //2.过期了，重新发送请求，更新过期时间，更新token
//                String token = MyClient.testUpdate(flag);
//                if(token != null){
//                    // 获取到新token
//                    quartzService.setToken("service.token",token);
//                    quartzService.updateDeadLine();
//                    return Msg.successResult(token);
//                }else{
//                    // 连接token服务器失败
//                    return Msg.failResult();
//                }
//            }else{
//                //3.没过期，直接返回token
//                TOKEN = quartzService.getToken("service.token");
//                return Msg.successResult(TOKEN);
//            }
//        } catch (ParseException e) {
//            e.printStackTrace();
//            return Msg.failResult();
//        }
//    }

    protected static Logger logger= LoggerFactory.getLogger(MyController.class);

    @Autowired
    private VerificationCodeMapper verificationCodeMapper;

    @PostMapping("/content")
    public Msg getContent(@RequestBody VerificationCode verificationCode){
        try {
            VerificationCodeExample example = new VerificationCodeExample();
            example.createCriteria().andIdEqualTo(verificationCode.getId());
            List<VerificationCode> list = verificationCodeMapper.selectByExample(example);
            if(list.size() == 0){
                logger.info("请求信息未在数据库中找到，执行插入操作！");
                verificationCodeMapper.insert(verificationCode);
                return Msg.successInsert(verificationCode.getId());
            }else{
                return Msg.successResult(list.get(0).getContent());
            }

        } catch (Exception e){

            e.printStackTrace();
            return Msg.failResult();
        }
    }


    @Autowired
    private VerifiedInvoiceService verifiedInvoiceService;

    @PostMapping("/insertVerifiedInvoice")
    public Msg insertVerifiedInvoice(@RequestBody InvoiceRequest invoiceRequest){
        boolean flag =false;
        try {
            verifiedInvoiceService.insertVerifiedInvoice(invoiceRequest);
            flag = true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        if(flag){
            return Msg.successInsert("");
        }
        return Msg.failInsert("");
    }

    @PostMapping("/getInvoiceRequest")
    public Message getInvoiceRequest(@RequestBody VerifiedInvoice verifiedInvoice){
        boolean flag =false;
        InvoiceRequest invoiceRequest  = null;
        try {
            invoiceRequest = verifiedInvoiceService.getInvoiceRequest(verifiedInvoice);
            flag = true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        if(!flag || invoiceRequest == null){
            return Message.fail();
        }
        return Message.success().add("invoiceRequest",invoiceRequest);
    }
    @Autowired
    private VerifiedInvoiceMapper verifiedInvoiceMapper;

    @PutMapping("/upVerifiedInvoice/{code}/{number}")
    public Msg upVerifiedInvoice(@PathVariable("code") String code,@PathVariable ("number") String number){
        try {
            VerifiedInvoice verifiedInvoice = new VerifiedInvoice();
            verifiedInvoice.setCode(code);
            verifiedInvoice.setNumber(number);
            verifiedInvoice.setIslistadded(new Byte("0"));
            verifiedInvoiceMapper.updateByPrimaryKeySelective(verifiedInvoice);
            return Msg.successResult("更新成功！");
        } catch (Exception e){
            e.printStackTrace();
            return Msg.failResult();
        }
    }

    @Autowired
    private InvoiceIndexMapper invoiceIndexMapper;

    @PostMapping("/insertInvoiceIndex")
    public Msg insertInvoiceIndex(@RequestBody InvoiceIndex invoiceIndex){
        logger.info("传入的数据："+invoiceIndex);
        try {
            invoiceIndexMapper.insertSelective(invoiceIndex);
            return Msg.successInsert("");
        }catch (DuplicateKeyException de){
            de.printStackTrace();
            return Msg.failInsert("主键冲突！");
        }catch (Exception e){
            e.printStackTrace();
            return Msg.failResult();
        }
    }

    @PostMapping("/getInvoiceIndex")
    public Message getInvoiceIndex(@RequestBody InvoiceIndex invoiceIndex){
        try {
            logger.info("传入的数据："+invoiceIndex);
            if(invoiceIndex == null){
                return Message.fail().add("reason","查询条件为空！");
            }else{
                String code = invoiceIndex.getCode();
                String number = invoiceIndex.getNumber();
                if(code != null && number != null){
                    InvoiceIndexExample example = new InvoiceIndexExample();
                    example.createCriteria().andCodeEqualTo(code).andNumberEqualTo(number);
                    List<InvoiceIndex> invoiceIndices = invoiceIndexMapper.selectByExample(example);
                    if(invoiceIndices.size() > 0){
                        return Message.success().add("invoiceIndice",invoiceIndices.get(0));
                    }else{
                        return Message.fail().add("reason","没有查到数据！");
                    }
                }else{
                    return Message.fail().add("reason","查询条件为空！");
                }
            }
        } catch (Exception e){
            e.printStackTrace();
            return Message.fail().add("reason","系统出异常！");
        }
    }


}
