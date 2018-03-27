package com.qf.dao;

import com.qf.pojo.YunDns;
import com.qf.pojo.YunDnsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YunDnsMapper {
    long countByExample(YunDnsExample example);

    int deleteByExample(YunDnsExample example);

    int deleteByPrimaryKey(Long dnsid);

    int insert(YunDns record);

    int insertSelective(YunDns record);

    List<YunDns> selectByExample(YunDnsExample example);

    YunDns selectByPrimaryKey(Long dnsid);

    int updateByExampleSelective(@Param("record") YunDns record, @Param("example") YunDnsExample example);

    int updateByExample(@Param("record") YunDns record, @Param("example") YunDnsExample example);

    int updateByPrimaryKeySelective(YunDns record);

    int updateByPrimaryKey(YunDns record);
}