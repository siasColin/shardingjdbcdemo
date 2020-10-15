package com.colin.shardingjdbcdemo.service.area;


import com.colin.shardingjdbcdemo.entity.area.SysArea;
import com.colin.shardingjdbcdemo.entity.area.SysAreaCriteria;

import java.util.List;

public interface ISysAreaService {
    long countByExample(SysAreaCriteria example);

    SysArea selectByPrimaryKey(Long id);

    List<SysArea> selectByExample(SysAreaCriteria example);

    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SysArea record);

    int updateByPrimaryKey(SysArea record);

    int deleteByExample(SysAreaCriteria example);

    int updateByExampleSelective(SysArea record, SysAreaCriteria example);

    int updateByExample(SysArea record, SysAreaCriteria example);

    int insert(SysArea record);

    int insertSelective(SysArea record);
}