package com.qf.dao;

import com.qf.pojo.YunHostaccount;
import com.qf.pojo.YunHostaccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YunHostaccountMapper {
    long countByExample(YunHostaccountExample example);

    int deleteByExample(YunHostaccountExample example);

    int deleteByPrimaryKey(Long accountid);

    int insert(YunHostaccount record);

    int insertSelective(YunHostaccount record);

    List<YunHostaccount> selectByExample(YunHostaccountExample example);

    YunHostaccount selectByPrimaryKey(Long accountid);

    int updateByExampleSelective(@Param("record") YunHostaccount record, @Param("example") YunHostaccountExample example);

    int updateByExample(@Param("record") YunHostaccount record, @Param("example") YunHostaccountExample example);

    int updateByPrimaryKeySelective(YunHostaccount record);

    int updateByPrimaryKey(YunHostaccount record);
}