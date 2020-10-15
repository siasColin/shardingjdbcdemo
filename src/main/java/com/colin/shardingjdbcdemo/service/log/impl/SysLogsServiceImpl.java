package com.colin.shardingjdbcdemo.service.log.impl;

import java.util.List;

import com.colin.shardingjdbcdemo.entity.log.SysLogs;
import com.colin.shardingjdbcdemo.entity.log.SysLogsCriteria;
import com.colin.shardingjdbcdemo.mapper.log.SysLogsMapper;
import com.colin.shardingjdbcdemo.service.log.ISysLogsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysLogsServiceImpl implements ISysLogsService {
    @Autowired
    private SysLogsMapper sysLogsMapper;

    private static final Logger logger = LoggerFactory.getLogger(SysLogsServiceImpl.class);

    public long countByExample(SysLogsCriteria example) {
        long count = this.sysLogsMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public SysLogs selectByPrimaryKey(Long id) {
        return this.sysLogsMapper.selectByPrimaryKey(id);
    }

    public List<SysLogs> selectByExample(SysLogsCriteria example) {
        return this.sysLogsMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Long id) {
        return this.sysLogsMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(SysLogs record) {
        return this.sysLogsMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SysLogs record) {
        return this.sysLogsMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(SysLogsCriteria example) {
        return this.sysLogsMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(SysLogs record, SysLogsCriteria example) {
        return this.sysLogsMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(SysLogs record, SysLogsCriteria example) {
        return this.sysLogsMapper.updateByExample(record, example);
    }

    public int insert(SysLogs record) {
        return this.sysLogsMapper.insert(record);
    }

    public int insertSelective(SysLogs record) {
        return this.sysLogsMapper.insertSelective(record);
    }
}