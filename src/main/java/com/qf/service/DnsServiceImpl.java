package com.qf.service;

import com.qf.dao.YunDnsMapper;
import com.qf.dao.YunHostMapper;
import com.qf.dto.DnsDTO;
import com.qf.pojo.YunDns;
import com.qf.pojo.YunDnsExample;
import com.qf.pojo.YunHost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("dnsService")
public class DnsServiceImpl implements DnsService {

    @Autowired
    private YunDnsMapper yunDnsMapper;

    @Autowired
    private YunHostMapper yunHostMapper;


    @Override
    public List<DnsDTO> getdnsList() {
        List<DnsDTO> list = new ArrayList<>();
        YunDnsExample example = new YunDnsExample();
        List<YunDns> yunDnss = yunDnsMapper.selectByExample(example);
        for (YunDns yunDns : yunDnss) {
            DnsDTO dto = new DnsDTO();
            dto.setId(yunDns.getDnsid());
            dto.setName(yunDns.getDomain());
            if (yunDns.getHid()!=null) {
                YunHost yunHost = yunHostMapper.selectByPrimaryKey(yunDns.getHid());
                dto.setHid(yunHost.getHid());
                if (yunHost.getHstate()==1){
                    dto.setStatus("enable");
                }else {
                    dto.setStatus("pause");
                }
            }
            list.add(dto);
        }
        return list;
    }

    @Override
    public int addDns(YunDns yunDns) {
        int i = yunDnsMapper.insertSelective(yunDns);
        return i;
    }

    @Override
    public int deleteDns(Long id) {
        int i = yunDnsMapper.deleteByPrimaryKey(id);
        return i;
    }
}
