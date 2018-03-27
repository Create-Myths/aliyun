package com.qf.service;

import com.qf.dto.BalancerDTO;
import com.qf.pojo.YunLoadbalancing;

import java.util.List;

public interface BalancerService {
    public List<BalancerDTO> getdnsList();

    public int addBalancer(YunLoadbalancing yunLoadbalancing);

    public int deleteBalancer(Long id);
}
