package com.qf.service;

import com.qf.dto.DnsDTO;
import com.qf.pojo.YunDns;

import java.util.List;

public interface DnsService {

    public List<DnsDTO> getdnsList();

    public int addDns(YunDns yunDns);

    public int deleteDns(Long id);
}
