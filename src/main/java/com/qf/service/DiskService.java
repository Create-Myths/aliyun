package com.qf.service;

import com.qf.dto.DiskDTO;
import com.qf.pojo.YunDisk;

import java.util.List;

public interface DiskService {

    /**
     *
     * @param diskName  可选
     * @return
     */
    public List<DiskDTO> findByName(String diskName);

    public int addDisk(YunDisk yunDisk);

    public int updateDist(YunDisk yunDisk);

    public int deleteDist(Long id);
}
