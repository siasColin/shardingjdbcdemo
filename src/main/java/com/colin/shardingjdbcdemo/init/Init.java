package com.colin.shardingjdbcdemo.init;

import com.colin.shardingjdbcdemo.utils.IdWorker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @Package: com.colin.shardingjdbcdemo.init
 * @Author: sxf
 * @Date: 2020-10-14
 * @Description: 项目启动后执行一些初始化任务
 */
@Component
public class Init implements ApplicationRunner {
    @Value("${snowflake.workerId:0}")
    private long workerId;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        //初始化id生成器
        IdWorker.init(workerId);
    }
}
