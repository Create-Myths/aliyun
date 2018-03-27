package com.qf.service;

import com.qf.dao.YunDiskMapper;
import com.qf.dao.YunHostMapper;
import com.qf.dto.DiskDTO;
import com.qf.pojo.YunDisk;
import com.qf.pojo.YunDiskExample;
import com.qf.pojo.YunHost;
import com.qf.util.DataUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Service("diskService")
public class DiskServiceImpl implements DiskService {

    //注入持久层
    @Autowired
    private YunDiskMapper yunDiskMapper;

    @Autowired
    private YunHostMapper yunHostMapper;

    @Override
    public List<DiskDTO> findByName(String diskName) {

        List<DiskDTO> list = new ArrayList<>();
        YunDiskExample example = new YunDiskExample();

        if (!StringUtils.isEmpty(diskName)) {
            YunDiskExample.Criteria criteria = example.createCriteria();
            criteria.andDisknameLike("%" + diskName + "%");
        }

        List<YunDisk> yunDisks = yunDiskMapper.selectByExample(example);
        for (YunDisk yunDisk : yunDisks) {
            DiskDTO dto = new DiskDTO();
            dto.setId(yunDisk.getDid());
            dto.setDiskName(yunDisk.getDiskname());
            dto.setDiskSize(yunDisk.getDiskcapacity());
            if (yunDisk.getHid() != null) {
                YunHost yunHost = yunHostMapper.selectByPrimaryKey(yunDisk.getHid());
                dto.setMntHost(yunHost.getHostname());
                dto.setHostIP(yunHost.getOutip());
                dto.setState(yunHost.getHstate());
            }
            dto.setCreate_time(DataUtils.dateToStr(yunDisk.getCreatetime()));

            list.add(dto);
        }
        return list;
    }

    @Override
    public int addDisk(YunDisk yunDisk) {
        int i = yunDiskMapper.insertSelective(yunDisk);
        return i;
    }

    @Override
    public int updateDist(YunDisk yunDisk) {
        int i = yunDiskMapper.updateByPrimaryKeySelective(yunDisk);
        return i;
    }

    @Override
    public int deleteDist(Long id) {
        int i = yunDiskMapper.deleteByPrimaryKey(id);
        return i;
    }


}
