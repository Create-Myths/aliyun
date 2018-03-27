package com.qf.service;

import com.qf.dao.UUserMapper;
import com.qf.dao.YunDatabaseMapper;
import com.qf.dao.YunDatatypeMapper;
import com.qf.dto.DatabaseDTO;
import com.qf.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("databaseService")
public class DatabaseServiceImpl implements DatabaseService {

    @Autowired
    private YunDatabaseMapper yunDatabaseMapper;

    @Autowired
    private YunDatatypeMapper yunDatatypeMapper;

    @Autowired
    private UUserMapper userMapper;


    @Override
    public List<DatabaseDTO> getDatabaseList() {
        List<DatabaseDTO> list = new ArrayList<>();
        YunDatabaseExample example = new YunDatabaseExample();
        List<YunDatabase> yunDatabases = yunDatabaseMapper.selectByExample(example);
        for (YunDatabase yunDatabase : yunDatabases) {
            DatabaseDTO dto = new DatabaseDTO();
            dto.setId(yunDatabase.getDbid());
            dto.setDb_name(yunDatabase.getDbname());
            if (yunDatabase.getDbtypeid() !=null){
                YunDatatype yunDatatype = yunDatatypeMapper.selectByPrimaryKey(yunDatabase.getDbtypeid());
                dto.setDb_type(yunDatatype.getDataname());
            }
            dto.setStatus(yunDatabase.getDbstatus());
            dto.setIp(yunDatabase.getDbip());
            dto.setValid_time(yunDatabase.getPeriodtime());
            list.add(dto);
        }
        return list;
    }

    @Override
    public int addDatabase(YunDatabase yunDatabase) {
        int i = yunDatabaseMapper.insertSelective(yunDatabase);
        return i;
    }

    @Override
    public int deleteDatabase(Long id) {
        int i = yunDatabaseMapper.deleteByPrimaryKey(id);
        return i;
    }
}
