package com.qf.dao;

import com.qf.pojo.YunLoadbalancing;
import com.qf.pojo.YunLoadbalancingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YunLoadbalancingMapper {
    long countByExample(YunLoadbalancingExample example);

    int deleteByExample(YunLoadbalancingExample example);

    int deleteByPrimaryKey(Long loadid);

    int insert(YunLoadbalancing record);

    int insertSelective(YunLoadbalancing record);

    List<YunLoadbalancing> selectByExample(YunLoadbalancingExample example);

    YunLoadbalancing selectByPrimaryKey(Long loadid);

    int updateByExampleSelective(@Param("record") YunLoadbalancing record, @Param("example") YunLoadbalancingExample example);

    int updateByExample(@Param("record") YunLoadbalancing record, @Param("example") YunLoadbalancingExample example);

    int updateByPrimaryKeySelective(YunLoadbalancing record);

    int updateByPrimaryKey(YunLoadbalancing record);
}