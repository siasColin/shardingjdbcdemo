package com.colin.shardingjdbcdemo.controller.test;

import com.colin.shardingjdbcdemo.entity.area.SysArea;
import com.colin.shardingjdbcdemo.entity.area.SysAreaCriteria;
import com.colin.shardingjdbcdemo.service.area.ISysAreaService;
import com.colin.shardingjdbcdemo.service.log.ISysLogsService;
import com.colin.shardingjdbcdemo.service.test.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Package: com.colin.shardingjdbcdemo.controller.test
 * @Author: sxf
 * @Date: 2020-10-14
 * @Description:
 */
@RequestMapping("/test")
@RestController
public class TestController {
    @Autowired
    private ISysLogsService sysLogsService;
    @Autowired
    private ISysAreaService sysAreaService;
    @Autowired
    private ITestService testService;

    @GetMapping("/areaList")
    public List<SysArea> areaList(){
        SysAreaCriteria sysAreaCriteria = new SysAreaCriteria();
        sysAreaCriteria.setOrderByClause("ID DESC");
        return sysAreaService.selectByExample(sysAreaCriteria);
    }

    @GetMapping("/tx_xa")
    public String testTransaction_XA(){
        testService.testTransaction_XA();
        return "success";
    }
}
