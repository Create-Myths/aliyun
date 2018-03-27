package com.qf.dao;

import com.qf.pojo.YunHost;
import com.qf.pojo.YunHostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YunHostMapper {
    long countByExample(YunHostExample example);

    int deleteByExample(YunHostExample example);

    int deleteByPrimaryKey(Long hid);

    int insert(YunHost record);

    int insertSelective(YunHost record);

    List<YunHost> selectByExample(YunHostExample example);

    YunHost selectByPrimaryKey(Long hid);

    int updateByExampleSelective(@Param("record") YunHost record, @Param("example") YunHostExample example);

    int updateByExample(@Param("record") YunHost record, @Param("example") YunHostExample example);

    int updateByPrimaryKeySelective(YunHost record);

    int updateByPrimaryKey(YunHost record);
}