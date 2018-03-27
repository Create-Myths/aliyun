package com.qf.service;

import com.qf.dao.YunHostaccountMapper;
import com.qf.pojo.YunHostaccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Thanks for Everything.
 */
@Service("yunHostaccountService")
public class YunHostaccountServiceImpl implements YunHostaccountService {

	@Autowired
	private YunHostaccountMapper yunHostaccountMapper;
	@Override
	public Long addYunHostCount(YunHostaccount pojo) {
		yunHostaccountMapper.insertSelective(pojo);
		return pojo.getAccountid();
	}
}
