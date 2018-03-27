package com.qf.dao;

import com.qf.pojo.YunDisk;
import com.qf.pojo.YunDiskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YunDiskMapper {
    long countByExample(YunDiskExample example);

    int deleteByExample(YunDiskExample example);

    int deleteByPrimaryKey(Long did);

    int insert(YunDisk record);

    int insertSelective(YunDisk record);

    List<YunDisk> selectByExample(YunDiskExample example);

    YunDisk selectByPrimaryKey(Long did);

    int updateByExampleSelective(@Param("record") YunDisk record, @Param("example") YunDiskExample example);

    int updateByExample(@Param("record") YunDisk record, @Param("example") YunDiskExample example);

    int updateByPrimaryKeySelective(YunDisk record);

    int updateByPrimaryKey(YunDisk record);
}