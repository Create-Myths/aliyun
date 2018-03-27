package com.qf.dao;

import com.qf.pojo.YunInetdata;
import com.qf.pojo.YunInetdataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YunInetdataMapper {
    long countByExample(YunInetdataExample example);

    int deleteByExample(YunInetdataExample example);

    int deleteByPrimaryKey(Long dataid);

    int insert(YunInetdata record);

    int insertSelective(YunInetdata record);

    List<YunInetdata> selectByExample(YunInetdataExample example);

    YunInetdata selectByPrimaryKey(Long dataid);

    int updateByExampleSelective(@Param("record") YunInetdata record, @Param("example") YunInetdataExample example);

    int updateByExample(@Param("record") YunInetdata record, @Param("example") YunInetdataExample example);

    int updateByPrimaryKeySelective(YunInetdata record);

    int updateByPrimaryKey(YunInetdata record);
}