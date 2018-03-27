package com.qf.service;

import com.qf.dao.UUserMapper;
import com.qf.pojo.UUser;
import com.qf.pojo.UUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Thanks for Everything.
 */
@Service("yunUserService")
public class YunUserServiceImpl implements YunUserService {
	//注入持久层
	@Autowired
	private UUserMapper uUserMapper;

	@Override
	public UUser login(String username, String password) {
		UUserExample example = new UUserExample();
		UUserExample.Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		criteria.andPasswordEqualTo(password);
		List<UUser> uUsers = uUserMapper.selectByExample(example);
		if(uUsers!=null&&uUsers.size()>0){
			return uUsers.get(0);
		}
		return null;
	}
}
