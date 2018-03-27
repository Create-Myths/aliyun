package com.qf.dao;

import com.qf.pojo.YunProtect;
import com.qf.pojo.YunProtectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YunProtectMapper {
    long countByExample(YunProtectExample example);

    int deleteByExample(YunProtectExample example);

    int deleteByPrimaryKey(Long protectid);

    int insert(YunProtect record);

    int insertSelective(YunProtect record);

    List<YunProtect> selectByExample(YunProtectExample example);

    YunProtect selectByPrimaryKey(Long protectid);

    int updateByExampleSelective(@Param("record") YunProtect record, @Param("example") YunProtectExample example);

    int updateByExample(@Param("record") YunProtect record, @Param("example") YunProtectExample example);

    int updateByPrimaryKeySelective(YunProtect record);

    int updateByPrimaryKey(YunProtect record);
}