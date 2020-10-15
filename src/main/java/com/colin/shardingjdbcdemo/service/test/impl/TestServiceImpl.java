package com.colin.shardingjdbcdemo.service.test.impl;

import com.colin.shardingjdbcdemo.entity.area.SysArea;
import com.colin.shardingjdbcdemo.entity.log.SysLogs;
import com.colin.shardingjdbcdemo.mapper.area.SysAreaMapper;
import com.colin.shardingjdbcdemo.mapper.log.SysLogsMapper;
import com.colin.shardingjdbcdemo.service.test.ITestService;
import com.colin.shardingjdbcdemo.utils.IdWorker;
import org.apache.shardingsphere.core.strategy.keygen.SnowflakeShardingKeyGenerator;
import org.apache.shardingsphere.transaction.annotation.ShardingTransactionType;
import org.apache.shardingsphere.transaction.core.TransactionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Package: com.colin.shardingjdbcdemo.service.test.impl
 * @Author: sxf
 * @Date: 2020-10-14
 * @Description:
 */
@Service
public class TestServiceImpl implements ITestService {
    @Autowired
    private SysLogsMapper sysLogsMapper;
    @Autowired
    private SysAreaMapper sysAreaMapper;

    @Override
    @Transactional
    @ShardingTransactionType(TransactionType.XA)  // 支持TransactionType.LOCAL, TransactionType.XA, TransactionType.BASE
    public void testTransaction_XA() {
        SysLogs sysLogs = new SysLogs();
        sysLogs.setId(IdWorker.getInstance().generateId());
        sysLogs.setApplicationName("SHARDINGJDBCDEMO");
        sysLogs.setIp("192.168.0.135");
        sysLogs.setDescription("shardingjdbcdemo-测试");
        sysLogs.setLogType(0);
        sysLogs.setModuleName("测试");
        sysLogs.setCreateTime(new Date());
        sysLogs.setOperateTime(new Date());
        sysLogs.setOperateUser("colin");
        sysLogsMapper.insertSelective(sysLogs);
        SysArea sysArea = new SysArea();
//        sysArea.setId(IdWorker.getInstance().generateId());
        sysArea.setApplicationName("SHARDINGJDBCDEMO");
        sysArea.setAreaCode("410000000000");
        sysArea.setParentCode("41");
        sysArea.setAreaLevel(1);
        sysArea.setAreaName("河南省");
        sysArea.setCreateTime(new Date());
        sysArea.setCreateUser("colin");
        sysArea.setLongitude(BigDecimal.valueOf(113.628962));
        sysArea.setLatitude(BigDecimal.valueOf(34.757272));
        sysArea.setSortNum(1);
        sysAreaMapper.insertSelective(sysArea);
    }
}
