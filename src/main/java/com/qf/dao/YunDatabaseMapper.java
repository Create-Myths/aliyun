package com.qf.dao;

import com.qf.pojo.YunDatabase;
import com.qf.pojo.YunDatabaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YunDatabaseMapper {
    long countByExample(YunDatabaseExample example);

    int deleteByExample(YunDatabaseExample example);

    int deleteByPrimaryKey(Long dbid);

    int insert(YunDatabase record);

    int insertSelective(YunDatabase record);

    List<YunDatabase> selectByExample(YunDatabaseExample example);

    YunDatabase selectByPrimaryKey(Long dbid);

    int updateByExampleSelective(@Param("record") YunDatabase record, @Param("example") YunDatabaseExample example);

    int updateByExample(@Param("record") YunDatabase record, @Param("example") YunDatabaseExample example);

    int updateByPrimaryKeySelective(YunDatabase record);

    int updateByPrimaryKey(YunDatabase record);
}