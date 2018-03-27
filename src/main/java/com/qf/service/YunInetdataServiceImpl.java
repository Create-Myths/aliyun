package com.qf.service;

import com.qf.dao.YunInetdataMapper;
import com.qf.pojo.YunInetdata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Thanks for Everything.
 */
@Service("yunInetdataService")
public class YunInetdataServiceImpl implements YunInetdataService {
	@Autowired
	private YunInetdataMapper yunInetdataMapper;
	@Override
	public Long addYunInetData(YunInetdata pojo) {
		int i = yunInetdataMapper.insertSelective(pojo);
		System.out.println(i);//这个返回可以不用
		//这个返回的i表示是否添加成功，但是我们这里需要得到添加后的主键
		return pojo.getDataid();
	}
}
