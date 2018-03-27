package com.qf.dao;

import com.qf.pojo.YunDbtype;
import com.qf.pojo.YunDbtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YunDbtypeMapper {
    long countByExample(YunDbtypeExample example);

    int deleteByExample(YunDbtypeExample example);

    int deleteByPrimaryKey(Long dbtypeid);

    int insert(YunDbtype record);

    int insertSelective(YunDbtype record);

    List<YunDbtype> selectByExample(YunDbtypeExample example);

    YunDbtype selectByPrimaryKey(Long dbtypeid);

    int updateByExampleSelective(@Param("record") YunDbtype record, @Param("example") YunDbtypeExample example);

    int updateByExample(@Param("record") YunDbtype record, @Param("example") YunDbtypeExample example);

    int updateByPrimaryKeySelective(YunDbtype record);

    int updateByPrimaryKey(YunDbtype record);
}