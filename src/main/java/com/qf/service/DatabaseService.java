package com.qf.service;

import com.qf.dto.DatabaseDTO;
import com.qf.pojo.YunDatabase;

import java.util.List;

public interface DatabaseService {
    public List<DatabaseDTO> getDatabaseList();

    public int addDatabase(YunDatabase yunDatabase);

    public int deleteDatabase(Long id);
}
