package com.qf.dao;

import com.qf.pojo.UUserRoleExample;
import com.qf.pojo.UUserRoleKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UUserRoleMapper {
    long countByExample(UUserRoleExample example);

    int deleteByExample(UUserRoleExample example);

    int deleteByPrimaryKey(UUserRoleKey key);

    int insert(UUserRoleKey record);

    int insertSelective(UUserRoleKey record);

    List<UUserRoleKey> selectByExample(UUserRoleExample example);

    int updateByExampleSelective(@Param("record") UUserRoleKey record, @Param("example") UUserRoleExample example);

    int updateByExample(@Param("record") UUserRoleKey record, @Param("example") UUserRoleExample example);
}