package com.colin.shardingjdbcdemo.service.area.impl;

import java.util.List;

import com.colin.shardingjdbcdemo.entity.area.SysArea;
import com.colin.shardingjdbcdemo.entity.area.SysAreaCriteria;
import com.colin.shardingjdbcdemo.mapper.area.SysAreaMapper;
import com.colin.shardingjdbcdemo.service.area.ISysAreaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysAreaServiceImpl implements ISysAreaService {
    @Autowired
    private SysAreaMapper sysAreaMapper;

    private static final Logger logger = LoggerFactory.getLogger(SysAreaServiceImpl.class);

    public long countByExample(SysAreaCriteria example) {
        long count = this.sysAreaMapper.countByExample(example);
        logger.debug("count: {}", count);
        return count;
    }

    public SysArea selectByPrimaryKey(Long id) {
        return this.sysAreaMapper.selectByPrimaryKey(id);
    }

    public List<SysArea> selectByExample(SysAreaCriteria example) {
        return this.sysAreaMapper.selectByExample(example);
    }

    public int deleteByPrimaryKey(Long id) {
        return this.sysAreaMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(SysArea record) {
        return this.sysAreaMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SysArea record) {
        return this.sysAreaMapper.updateByPrimaryKey(record);
    }

    public int deleteByExample(SysAreaCriteria example) {
        return this.sysAreaMapper.deleteByExample(example);
    }

    public int updateByExampleSelective(SysArea record, SysAreaCriteria example) {
        return this.sysAreaMapper.updateByExampleSelective(record, example);
    }

    public int updateByExample(SysArea record, SysAreaCriteria example) {
        return this.sysAreaMapper.updateByExample(record, example);
    }

    public int insert(SysArea record) {
        return this.sysAreaMapper.insert(record);
    }

    public int insertSelective(SysArea record) {
        return this.sysAreaMapper.insertSelective(record);
    }
}