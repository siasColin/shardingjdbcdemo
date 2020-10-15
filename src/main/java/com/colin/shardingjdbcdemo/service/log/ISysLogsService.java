package com.colin.shardingjdbcdemo.service.log;

import com.colin.shardingjdbcdemo.entity.log.SysLogs;
import com.colin.shardingjdbcdemo.entity.log.SysLogsCriteria;

import java.util.List;

public interface ISysLogsService {
    long countByExample(SysLogsCriteria example);

    SysLogs selectByPrimaryKey(Long id);

    List<SysLogs> selectByExample(SysLogsCriteria example);

    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysLogs record);

    int updateByPrimaryKey(SysLogs record);

    int deleteByExample(SysLogsCriteria example);

    int updateByExampleSelective(SysLogs record, SysLogsCriteria example);

    int updateByExample(SysLogs record, SysLogsCriteria example);

    int insert(SysLogs record);

    int insertSelective(SysLogs record);
}