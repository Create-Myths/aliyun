package com.qf.dao;

import com.qf.pojo.YunMemery;
import com.qf.pojo.YunMemeryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YunMemeryMapper {
    long countByExample(YunMemeryExample example);

    int deleteByExample(YunMemeryExample example);

    int deleteByPrimaryKey(Long mid);

    int insert(YunMemery record);

    int insertSelective(YunMemery record);

    List<YunMemery> selectByExample(YunMemeryExample example);

    YunMemery selectByPrimaryKey(Long mid);

    int updateByExampleSelective(@Param("record") YunMemery record, @Param("example") YunMemeryExample example);

    int updateByExample(@Param("record") YunMemery record, @Param("example") YunMemeryExample example);

    int updateByPrimaryKeySelective(YunMemery record);

    int updateByPrimaryKey(YunMemery record);
}