package com.aisino.client;

import com.aisino.db2.dao.VerificationCodeMapper;
import com.aisino.db2.domain.VerificationCode;
import com.aisino.db2.domain.VerificationCodeExample;
import com.aisino.db2.service.YzmService;
import com.aisino.utils.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.misc.BASE64Decoder;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by zhukaishengy on 2018/4/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class YzmServiceInvoker {

    @Autowired
    private VerificationCodeMapper verificationCodeMapper;

    @Autowired
    private YzmService yzmService;
    /**
     * 统计信息：
     * 现在数据库中一共992791条记录，其中已输入验证码的有80958个
     */
    @Test
    public void statistics(){
        VerificationCodeExample example = new VerificationCodeExample();
        example.createCriteria().andContentIsNotNull();
        System.out.println(verificationCodeMapper.countByExample(example));
    }

    /**
     * 将现有sqlserver数据库中的所有记录取出，添加上（md5），手动输入过验证码的
     */
    @Test
    public void calculYzmMd5(){
        VerificationCodeExample example = new VerificationCodeExample();
        example.createCriteria().andContentIsNotNull().andContentNotEqualTo("");
        List<VerificationCode> verificationCodes = verificationCodeMapper.selectByExampleWithBLOBs(example);
        for (VerificationCode verificationCode : verificationCodes) {
            String content = verificationCode.getContent();
            String yzmMd5 = yzmService.getYzmMd5(content);
            verificationCode.setMd5(yzmMd5);
            verificationCodeMapper.updateByPrimaryKey(verificationCode);
        }
    }

    /**
     * 测试生成md5码自动化脚本
     */
    @Test
    public void test(){
        VerificationCodeExample example = new VerificationCodeExample();
        example.createCriteria().andIdEqualTo("0000bb355a1cd96ae9566826041cc277");
        List<VerificationCode> verificationCodes = verificationCodeMapper.selectByExampleWithBLOBs(example);
        String content = verificationCodes.get(0).getContent();
        String yzmMd5 = yzmService.getYzmMd5(content);
        verificationCodes.get(0).setMd5(yzmMd5);
        verificationCodeMapper.updateByPrimaryKey(verificationCodes.get(0));
    }

    @Autowired
    private RedisUtil redisUtil;

    /**
     * 测试使用spring-data-redis中的api操作redis
     */
    @Test
    public void testRedisHash(){
        Boolean aBoolean = redisUtil.getRedisTemplate().hasKey("88:578134");
//        String name = redisUtil.get("name");
//        Set keys = redisUtil.getRedisTemplate().opsForHash().keys("88:578134");
//        List<String> values = redisUtil.getRedisTemplate().opsForHash().values("88:578134");
//        System.out.println(keys);
//        System.out.println(values);
        System.out.println(aBoolean);
    }

    @Test
    public void testRedisApi(){
//        Set<String> keys = redisUtil.getRedisTemplate().keys("88:578134");
        Map<String, String> map = redisUtil.hmget("88:578134");
        String imageTip = map.get("04");
        String md5 = map.get("03");
        String image = map.get("02");
        System.out.println("imageTip:"+imageTip);
        System.out.println("md5:"+md5);
        System.out.println("image:"+image);
    }
    @Test
    public void redisApi1() throws IOException {
        //1.遍历从1到1000000，拼接成88:*
        for (int i = 1; i < 1000000; i++) {
            String key = "88:"+String.valueOf(i);
            //2. hgetall key
            Map<String, String> map = redisUtil.hmget(key);
            //3. 获取图片，转为index
            String image = map.get("02");
            String index = yzmService.makeIndex(image);
            //4. 若果index在sqlserver中存在，放过
            VerificationCodeExample example = new VerificationCodeExample();
            VerificationCode verificationCode = verificationCodeMapper.selectByPrimaryKey(index);
            if(verificationCode != null){
                System.out.println(key+":已存在");
            }else{
                //5. 获取其他参数
                String imageTip = map.get("04");
                String md5 = map.get("03");
                //6. 将图片base64解码
                BASE64Decoder base64Decoder = new BASE64Decoder();
                byte[] bytes = base64Decoder.decodeBuffer(image);
                //7. 插入
                VerificationCode record = new VerificationCode(index,"2100",imageTip,(byte)0,md5,bytes);
                verificationCodeMapper.insert(record);
                System.out.println(key+":插入成功！");
//                break;
            }

        }
    }
    @Test
    public void redisApiReverse() throws IOException {
        //1.遍历从1到1000000，拼接成88:*
        for (int i = 1000000; i > 1; i--) {
            String key = "88:"+String.valueOf(i);
            //2. hgetall key
            Map<String, String> map = redisUtil.hmget(key);
            //3. 获取图片，转为index
            String image = map.get("02");
            String index = yzmService.makeIndex(image);
            //4. 若果index在sqlserver中存在，放过
            VerificationCodeExample example = new VerificationCodeExample();
            VerificationCode verificationCode = verificationCodeMapper.selectByPrimaryKey(index);
            if(verificationCode != null){
                System.out.println(key+":已存在");
            }else{
                //5. 获取其他参数
                String imageTip = map.get("04");
                String md5 = map.get("03");
                //6. 将图片base64解码
                BASE64Decoder base64Decoder = new BASE64Decoder();
                byte[] bytes = base64Decoder.decodeBuffer(image);
                //7. 插入
                VerificationCode record = new VerificationCode(index,"2100",imageTip,(byte)0,md5,bytes);
                verificationCodeMapper.insert(record);
                System.out.println(key+":插入成功！");
//                break;
            }

        }
    }

    @Test
    public void testImage() throws IOException {
        String image = "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";
        BASE64Decoder base64Decoder = new BASE64Decoder();
        byte[] bytes = base64Decoder.decodeBuffer(image);
        System.out.println(bytes);
    }

    @Test
    public void updateSqlserver(){
        //1. 取出所有的后插入的数据
        VerificationCodeExample example = new VerificationCodeExample();
        example.createCriteria().andContentIsNull().andMd5IsNotNull().andMd5NotEqualTo("");
        List<VerificationCode> verificationCodes = verificationCodeMapper.selectByExample(example);
        //2. 遍历
        for (VerificationCode verificationCode : verificationCodes) {
            //3. 查出所有md5值相等的有content的数据
            VerificationCodeExample exampleNew = new VerificationCodeExample();
            example.createCriteria().andMd5EqualTo(verificationCode.getMd5()).andContentIsNotNull();
            List<VerificationCode> verificationCodesNew = verificationCodeMapper.selectByExample(exampleNew);
            if(verificationCodesNew.size() == 0 ){
                System.out.println(verificationCode.getId()+":不存在原有的！");
            }else{
                verificationCode.setContent(verificationCodesNew.get(0).getContent());
                verificationCodeMapper.updateByPrimaryKey(verificationCode);
                System.out.println(verificationCode.getId()+":更新content成功！"+verificationCode.getContent());
                break;
            }
        }
    }


}
