package com.aisino.db2.service;

import com.aisino.db2.dao.VerifiedInvoiceDetailMapper;
import com.aisino.db2.dao.VerifiedInvoiceMapper;
import com.aisino.db2.domain.VerifiedInvoice;
import com.aisino.db2.domain.VerifiedInvoiceDetail;
import com.aisino.db2.domain.VerifiedInvoiceDetailExample;
import com.aisino.db2.domain.VerifiedInvoiceExample;
import com.aisino.to.InvoiceRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zhukaishengy on 2018/3/26.
 */
@Service
public class VerifiedInvoiceService {

    @Autowired
    private VerifiedInvoiceMapper verifiedInvoiceMapper;

    @Autowired
    private VerifiedInvoiceDetailMapper verifiedInvoiceDetailMapper;

//多数据源加入注解时指定事务管理器
    @Transactional(value = "dataSourceTransactionManager2",rollbackFor=Exception.class)
    public void insertVerifiedInvoice(InvoiceRequest invoiceRequest){
        VerifiedInvoice verifiedInvoice = invoiceRequest.getVerifiedInvoice();
        List<VerifiedInvoiceDetail> verifiedInvoiceDetails = invoiceRequest.getVerifiedInvoiceDetails();
        verifiedInvoiceMapper.insertSelective(verifiedInvoice);
        for (VerifiedInvoiceDetail verifiedInvoiceDetail : verifiedInvoiceDetails) {
            verifiedInvoiceDetailMapper.insertSelective(verifiedInvoiceDetail);
        }
    }

    public InvoiceRequest getInvoiceRequest(VerifiedInvoice verifiedInvoice){

        String code = verifiedInvoice.getCode();
        String number = verifiedInvoice.getNumber();

        VerifiedInvoiceExample verifiedInvoiceExample = new VerifiedInvoiceExample();
        verifiedInvoiceExample.createCriteria().andCodeEqualTo(code).andNumberEqualTo(number);
        List<VerifiedInvoice> verifiedInvoices = verifiedInvoiceMapper.selectByExample(verifiedInvoiceExample);

        VerifiedInvoiceDetailExample verifiedInvoiceDetailExample = new VerifiedInvoiceDetailExample();
        verifiedInvoiceDetailExample.createCriteria().andInvoicecodeEqualTo(code).andInvoicenumberEqualTo(number);
        List<VerifiedInvoiceDetail> verifiedInvoiceDetails = verifiedInvoiceDetailMapper.selectByExample(verifiedInvoiceDetailExample);

        return new InvoiceRequest(verifiedInvoices.get(0),verifiedInvoiceDetails);
    }

}
