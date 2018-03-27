package com.qf.dao;

import com.qf.pojo.YunWorktype;
import com.qf.pojo.YunWorktypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YunWorktypeMapper {
    long countByExample(YunWorktypeExample example);

    int deleteByExample(YunWorktypeExample example);

    int deleteByPrimaryKey(Long worktypeid);

    int insert(YunWorktype record);

    int insertSelective(YunWorktype record);

    List<YunWorktype> selectByExample(YunWorktypeExample example);

    YunWorktype selectByPrimaryKey(Long worktypeid);

    int updateByExampleSelective(@Param("record") YunWorktype record, @Param("example") YunWorktypeExample example);

    int updateByExample(@Param("record") YunWorktype record, @Param("example") YunWorktypeExample example);

    int updateByPrimaryKeySelective(YunWorktype record);

    int updateByPrimaryKey(YunWorktype record);
}