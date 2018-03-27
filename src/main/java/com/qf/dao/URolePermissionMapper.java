package com.qf.dao;

import com.qf.pojo.URolePermissionExample;
import com.qf.pojo.URolePermissionKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface URolePermissionMapper {
    long countByExample(URolePermissionExample example);

    int deleteByExample(URolePermissionExample example);

    int deleteByPrimaryKey(URolePermissionKey key);

    int insert(URolePermissionKey record);

    int insertSelective(URolePermissionKey record);

    List<URolePermissionKey> selectByExample(URolePermissionExample example);

    int updateByExampleSelective(@Param("record") URolePermissionKey record, @Param("example") URolePermissionExample example);

    int updateByExample(@Param("record") URolePermissionKey record, @Param("example") URolePermissionExample example);
}