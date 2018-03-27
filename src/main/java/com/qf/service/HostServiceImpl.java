package com.qf.service;

import com.qf.dao.YunHostMapper;
import com.qf.dto.HostDTO;
import com.qf.pojo.YunHost;
import com.qf.pojo.YunHostExample;
import com.qf.util.DataUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Thanks for Everything.
 */
@Service("hostService")
public class HostServiceImpl implements HostService {
	//注入持久层
	@Autowired
	private YunHostMapper yunHostMapper;

	@Override
	public List<HostDTO> findByName(String hostName) {
		List<HostDTO> list = new ArrayList<HostDTO>();
		YunHostExample example = new YunHostExample();
		if(!StringUtils.isEmpty(hostName)){
			YunHostExample.Criteria criteria = example.createCriteria();
			criteria.andHostnameLike("%"+hostName+"%");
		}
		List<YunHost> yunHosts = yunHostMapper.selectByExample(example);
		for (YunHost yunHost : yunHosts) {//解决字段不一致的问题，显示JSON的问题
			//运用DTO,或者直接运用Map
			HostDTO dto = new HostDTO();
			dto.setId(yunHost.getHid());
			dto.setHostName(yunHost.getHostname());
			dto.setInnerIP(yunHost.getInip());
			dto.setOuterIP(yunHost.getOutip());
			dto.setState(yunHost.getHstate());
			Date exptime = yunHost.getExptime();
			dto.setDie_time(DataUtils.dateToStr(exptime));
			dto.setMemo(yunHost.getMemo());
			String protection = yunHost.getProtection();
			if(StringUtils.isEmpty(protection)){
				dto.setFirewall(0);
			}else{
				dto.setFirewall(1);
			}
			list.add(dto);
		}
		return list;
	}

	@Override
	public int addHost(YunHost yunHost) {

		int i = yunHostMapper.insertSelective(yunHost);
		return i;
	}


}
