package com.qf.dao;

import com.qf.pojo.YunDatatype;
import com.qf.pojo.YunDatatypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YunDatatypeMapper {
    long countByExample(YunDatatypeExample example);

    int deleteByExample(YunDatatypeExample example);

    int deleteByPrimaryKey(Long datatypeid);

    int insert(YunDatatype record);

    int insertSelective(YunDatatype record);

    List<YunDatatype> selectByExample(YunDatatypeExample example);

    YunDatatype selectByPrimaryKey(Long datatypeid);

    int updateByExampleSelective(@Param("record") YunDatatype record, @Param("example") YunDatatypeExample example);

    int updateByExample(@Param("record") YunDatatype record, @Param("example") YunDatatypeExample example);

    int updateByPrimaryKeySelective(YunDatatype record);

    int updateByPrimaryKey(YunDatatype record);
}