package com.aisino.db2.dao;

import com.aisino.db2.domain.Auth;
import com.aisino.db2.domain.AuthExample;
import java.util.List;

import com.aisino.vo.ProductCompanyResult;
import org.apache.ibatis.annotations.Param;

public interface AuthMapper {
    long countByExample(AuthExample example);

    int deleteByExample(AuthExample example);

    int insert(Auth record);

    int insertSelective(Auth record);

    List<Auth> selectByExample(AuthExample example);

    int updateByExampleSelective(@Param("record") Auth record, @Param("example") AuthExample example);

    int updateByExample(@Param("record") Auth record, @Param("example") AuthExample example);

    List<ProductCompanyResult> getSelectResult(@Param("str") String str);
}