package com.qf.service;

import com.qf.dao.UUserMapper;
import com.qf.dao.YunLoadbalancingMapper;
import com.qf.dto.BalancerDTO;
import com.qf.pojo.UUser;
import com.qf.pojo.YunLoadbalancing;
import com.qf.pojo.YunLoadbalancingExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service("balancerService")
public class BalancerServiceImpl implements BalancerService {

    @Autowired
    private YunLoadbalancingMapper yunLoadbalancingMapper;

    @Autowired
    private UUserMapper uUserMapper;


    @Override
    public List<BalancerDTO> getdnsList() {
        List<BalancerDTO> list = new ArrayList<>();
        YunLoadbalancingExample example = new YunLoadbalancingExample();
        List<YunLoadbalancing> yunLoadbalancings = yunLoadbalancingMapper.selectByExample(example);
        for (YunLoadbalancing yunLoadbalancing : yunLoadbalancings) {
            BalancerDTO dto = new BalancerDTO();
            dto.setId(yunLoadbalancing.getLoadid());
            dto.setName(yunLoadbalancing.getLoadname());
            dto.setRegionId(Long.parseLong("1"));
            if (yunLoadbalancing.getUid()!=null) {
                UUser uUser = uUserMapper.selectByPrimaryKey(yunLoadbalancing.getUid());
                dto.setUserId(uUser.getUid());
                dto.setState(uUser.getStatus());
            }
            dto.setBindWidth(yunLoadbalancing.getBandwidth());
            dto.setOut_ip(yunLoadbalancing.getOutip());
            dto.setPort(yunLoadbalancing.getMonitorport());
            dto.setCreate_time(yunLoadbalancing.getCreatetime());
            dto.setPool(yunLoadbalancing.getPool());
            dto.setEnd_time(new Date());

            list.add(dto);
        }
        return list;
    }

    @Override
    public int addBalancer(YunLoadbalancing yunLoadbalancing) {
        int i = yunLoadbalancingMapper.insertSelective(yunLoadbalancing);
        return i;
    }

    @Override
    public int deleteBalancer(Long id) {
        int i = yunLoadbalancingMapper.deleteByPrimaryKey(id);
        return i;
    }
}
