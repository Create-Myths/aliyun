package com.qf.service;

import com.qf.dao.YunOsMapper;
import com.qf.pojo.YunOs;
import com.qf.pojo.YunOsExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Thanks for Everything.
 */
@Service("osService")
public class OsServiceImpl implements OsService {

	@Autowired
	private YunOsMapper yunOsMapper;

	@Override
	public List<YunOs> findOs() {
		YunOsExample example = new YunOsExample();
		List<YunOs> yunOs = yunOsMapper.selectByExample(example);
		return yunOs;
	}
}
