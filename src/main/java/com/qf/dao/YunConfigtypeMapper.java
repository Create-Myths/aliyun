package com.qf.dao;

import com.qf.pojo.YunConfigtype;
import com.qf.pojo.YunConfigtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YunConfigtypeMapper {
    long countByExample(YunConfigtypeExample example);

    int deleteByExample(YunConfigtypeExample example);

    int deleteByPrimaryKey(Long configid);

    int insert(YunConfigtype record);

    int insertSelective(YunConfigtype record);

    List<YunConfigtype> selectByExample(YunConfigtypeExample example);

    YunConfigtype selectByPrimaryKey(Long configid);

    int updateByExampleSelective(@Param("record") YunConfigtype record, @Param("example") YunConfigtypeExample example);

    int updateByExample(@Param("record") YunConfigtype record, @Param("example") YunConfigtypeExample example);

    int updateByPrimaryKeySelective(YunConfigtype record);

    int updateByPrimaryKey(YunConfigtype record);
}