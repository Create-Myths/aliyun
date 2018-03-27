package com.qf.dao;

import com.qf.pojo.YunWorklist;
import com.qf.pojo.YunWorklistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YunWorklistMapper {
    long countByExample(YunWorklistExample example);

    int deleteByExample(YunWorklistExample example);

    int deleteByPrimaryKey(Long workid);

    int insert(YunWorklist record);

    int insertSelective(YunWorklist record);

    List<YunWorklist> selectByExample(YunWorklistExample example);

    YunWorklist selectByPrimaryKey(Long workid);

    int updateByExampleSelective(@Param("record") YunWorklist record, @Param("example") YunWorklistExample example);

    int updateByExample(@Param("record") YunWorklist record, @Param("example") YunWorklistExample example);

    int updateByPrimaryKeySelective(YunWorklist record);

    int updateByPrimaryKey(YunWorklist record);
}