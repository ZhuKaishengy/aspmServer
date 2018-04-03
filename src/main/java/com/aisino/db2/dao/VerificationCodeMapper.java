package com.aisino.db2.dao;

import com.aisino.db2.domain.VerificationCode;

import java.util.List;

import com.aisino.db2.domain.VerificationCodeExample;
import org.apache.ibatis.annotations.Param;

public interface VerificationCodeMapper {
    long countByExample(VerificationCodeExample example);

    int deleteByExample(VerificationCodeExample example);

    int deleteByPrimaryKey(String id);

    int insert(VerificationCode record);

    int insertSelective(VerificationCode record);

    List<VerificationCode> selectByExampleWithBLOBs(VerificationCodeExample example);

    List<VerificationCode> selectByExample(VerificationCodeExample example);

    VerificationCode selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") VerificationCode record, @Param("example") VerificationCodeExample example);

    int updateByExampleWithBLOBs(@Param("record") VerificationCode record, @Param("example") VerificationCodeExample example);

    int updateByExample(@Param("record") VerificationCode record, @Param("example") VerificationCodeExample example);

    int updateByPrimaryKeySelective(VerificationCode record);

    int updateByPrimaryKeyWithBLOBs(VerificationCode record);

    int updateByPrimaryKey(VerificationCode record);
}