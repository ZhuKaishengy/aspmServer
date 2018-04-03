package com.aisino.db2.dao;

import com.aisino.db2.domain.VerifiedInvoice;
import com.aisino.db2.domain.VerifiedInvoiceExample;
import com.aisino.db2.domain.VerifiedInvoiceKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VerifiedInvoiceMapper {
    long countByExample(VerifiedInvoiceExample example);

    int deleteByExample(VerifiedInvoiceExample example);

    int deleteByPrimaryKey(VerifiedInvoiceKey key);

    int insert(VerifiedInvoice record);

    int insertSelective(VerifiedInvoice record);

    List<VerifiedInvoice> selectByExample(VerifiedInvoiceExample example);

    VerifiedInvoice selectByPrimaryKey(VerifiedInvoiceKey key);

    int updateByExampleSelective(@Param("record") VerifiedInvoice record, @Param("example") VerifiedInvoiceExample example);

    int updateByExample(@Param("record") VerifiedInvoice record, @Param("example") VerifiedInvoiceExample example);

    int updateByPrimaryKeySelective(VerifiedInvoice record);

    int updateByPrimaryKey(VerifiedInvoice record);

    int upVerifiedInvoice(VerifiedInvoiceKey verifiedInvoiceKey);
}