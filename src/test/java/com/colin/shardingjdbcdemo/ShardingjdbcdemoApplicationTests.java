package com.colin.shardingjdbcdemo;

import com.colin.shardingjdbcdemo.entity.area.SysArea;
import com.colin.shardingjdbcdemo.entity.log.SysLogs;
import com.colin.shardingjdbcdemo.entity.log.SysLogsCriteria;
import com.colin.shardingjdbcdemo.service.area.ISysAreaService;
import com.colin.shardingjdbcdemo.service.log.ISysLogsService;
import com.colin.shardingjdbcdemo.utils.IdWorker;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class ShardingjdbcdemoApplicationTests {

    @Autowired
    private ISysLogsService sysLogsService;

    @Autowired
    private ISysAreaService sysAreaService;

    @Test
    public void saveLog() {
        SysLogs sysLogs = new SysLogs();
//        sysLogs.setId(IdWorker.getInstance().generateId());
        sysLogs.setApplicationName("SHARDINGJDBCDEMO");
        sysLogs.setIp("192.168.0.135");
        sysLogs.setDescription("shardingjdbcdemo-测试");
        sysLogs.setLogType(0);
        sysLogs.setModuleName("测试");
        sysLogs.setCreateTime(new Date());
        sysLogs.setOperateTime(new Date());
        sysLogs.setOperateUser("colin");
        sysLogsService.insertSelective(sysLogs);
    }

    @Test
    public void saveArea(){
        SysArea sysArea = new SysArea();
        sysArea.setId(IdWorker.getInstance().generateId());
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
        sysAreaService.insertSelective(sysArea);
    }

    @Test
    public void findLogById() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SysLogsCriteria sysLogsCriteria = new SysLogsCriteria();
        sysLogsCriteria.setOrderByClause("ID desc");
//        SysLogsCriteria.Criteria criteria = sysLogsCriteria.createCriteria();
        /*List<Date> dataList = new ArrayList<Date>();
        try {
            dataList.add(format.parse("2020-10-10 09:59:45"));
            dataList.add(format.parse("2020-09-10 10:10:29"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        criteria.andCreateTimeIn(dataList);*/
//        try {
//            criteria.andCreateTimeBetween(format.parse("2020-09-10 10:10:29"),format.parse("2020-10-10 09:59:45"));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
        List<SysLogs> sysLogs = sysLogsService.selectByExample(sysLogsCriteria);
        System.out.println(sysLogs.get(0));
    }

    /**
     * 错误测试（4.0.0-RC1版本不能正常解析sql中的 now() 等函数，升级4.1.1后正常）
     */
    @Test
    public void run1() {
        SysLogs sysLogs = new SysLogs();
        sysLogs.setId(IdWorker.getInstance().generateId());
        sysLogs.setApplicationName("SHARDINGJDBCDEMO");
        sysLogs.setIp("192.168.0.135");
        sysLogs.setDescription("shardingjdbcdemo-测试");
        sysLogs.setLogType(0);
        sysLogs.setModuleName("测试");
        sysLogs.setCreateTime(new Date());
        sysLogs.setOperateUser("colin");
        sysLogsService.insert(sysLogs);
    }

}
