package com.qf.service;

import com.qf.dto.ProtectDTO;
import com.qf.pojo.YunProtect;

import java.util.List;

public interface ProtectService {

    public List<ProtectDTO> getProtectList();

    public int addProtect(YunProtect yunProtect);

    public int updateProtect(YunProtect yunProtect);

    public int deleteProtect(Long id);
}
