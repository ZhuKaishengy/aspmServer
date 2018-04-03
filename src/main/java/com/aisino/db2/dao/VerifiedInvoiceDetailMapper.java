package com.aisino.db2.dao;

import com.aisino.db2.domain.VerifiedInvoiceDetail;
import com.aisino.db2.domain.VerifiedInvoiceDetailExample;
import com.aisino.db2.domain.VerifiedInvoiceDetailKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VerifiedInvoiceDetailMapper {
    long countByExample(VerifiedInvoiceDetailExample example);

    int deleteByExample(VerifiedInvoiceDetailExample example);

    int deleteByPrimaryKey(VerifiedInvoiceDetailKey key);

    int insert(VerifiedInvoiceDetail record);

    int insertSelective(VerifiedInvoiceDetail record);

    List<VerifiedInvoiceDetail> selectByExample(VerifiedInvoiceDetailExample example);

    VerifiedInvoiceDetail selectByPrimaryKey(VerifiedInvoiceDetailKey key);

    int updateByExampleSelective(@Param("record") VerifiedInvoiceDetail record, @Param("example") VerifiedInvoiceDetailExample example);

    int updateByExample(@Param("record") VerifiedInvoiceDetail record, @Param("example") VerifiedInvoiceDetailExample example);

    int updateByPrimaryKeySelective(VerifiedInvoiceDetail record);

    int updateByPrimaryKey(VerifiedInvoiceDetail record);
}