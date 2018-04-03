package com.aisino.db2.dao;

import com.aisino.db2.domain.InvoiceIndex;
import com.aisino.db2.domain.InvoiceIndexExample;
import com.aisino.db2.domain.InvoiceIndexKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvoiceIndexMapper {
    long countByExample(InvoiceIndexExample example);

    int deleteByExample(InvoiceIndexExample example);

    int deleteByPrimaryKey(InvoiceIndexKey key);

    int insert(InvoiceIndex record);

    int insertSelective(InvoiceIndex record);

    List<InvoiceIndex> selectByExample(InvoiceIndexExample example);

    InvoiceIndex selectByPrimaryKey(InvoiceIndexKey key);

    int updateByExampleSelective(@Param("record") InvoiceIndex record, @Param("example") InvoiceIndexExample example);

    int updateByExample(@Param("record") InvoiceIndex record, @Param("example") InvoiceIndexExample example);

    int updateByPrimaryKeySelective(InvoiceIndex record);

    int updateByPrimaryKey(InvoiceIndex record);
}