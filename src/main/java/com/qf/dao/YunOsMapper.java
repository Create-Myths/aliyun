package com.qf.dao;

import com.qf.pojo.YunOs;
import com.qf.pojo.YunOsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YunOsMapper {
    long countByExample(YunOsExample example);

    int deleteByExample(YunOsExample example);

    int deleteByPrimaryKey(Long osid);

    int insert(YunOs record);

    int insertSelective(YunOs record);

    List<YunOs> selectByExample(YunOsExample example);

    YunOs selectByPrimaryKey(Long osid);

    int updateByExampleSelective(@Param("record") YunOs record, @Param("example") YunOsExample example);

    int updateByExample(@Param("record") YunOs record, @Param("example") YunOsExample example);

    int updateByPrimaryKeySelective(YunOs record);

    int updateByPrimaryKey(YunOs record);
}