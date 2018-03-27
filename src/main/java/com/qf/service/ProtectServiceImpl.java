package com.qf.service;

import com.qf.dao.YunProtectMapper;
import com.qf.dto.ProtectDTO;
import com.qf.pojo.YunProtect;
import com.qf.pojo.YunProtectExample;
import com.qf.util.DataUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("protectService")
public class ProtectServiceImpl implements ProtectService {

    @Autowired
    private YunProtectMapper yunProtectMapper;


    @Override
    public List<ProtectDTO> getProtectList() {
        List<ProtectDTO> list = new ArrayList<ProtectDTO>();
        YunProtectExample example = new YunProtectExample();
        List<YunProtect> yunProtects = yunProtectMapper.selectByExample(example);
        for (YunProtect yunProtect : yunProtects) {
            ProtectDTO dto = new ProtectDTO();
            dto.setId(yunProtect.getProtectid());
            dto.setName(yunProtect.getProtectname());
            dto.setCreatetime(DataUtils.dateToStr(yunProtect.getCreatetime()));
            list.add(dto);
        }
        return list;
    }

    @Override
    public int addProtect(YunProtect yunProtect) {
        int i = yunProtectMapper.insertSelective(yunProtect);
        return i;
    }

    @Override
    public int updateProtect(YunProtect yunProtect) {
        int i = yunProtectMapper.updateByPrimaryKeySelective(yunProtect);
        return i;
    }

    @Override
    public int deleteProtect(Long id) {
        int i = yunProtectMapper.deleteByPrimaryKey(id);
        return i;
    }
}
