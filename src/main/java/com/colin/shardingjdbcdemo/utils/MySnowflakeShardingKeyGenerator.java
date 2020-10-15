package com.colin.shardingjdbcdemo.utils;

import org.apache.shardingsphere.spi.keygen.ShardingKeyGenerator;

import java.util.Properties;

/**
 * @Package: com.colin.shardingjdbcdemo.utils
 * @Author: sxf
 * @Date: 2020-10-14
 * @Description:
 */
public class MySnowflakeShardingKeyGenerator implements ShardingKeyGenerator {
    private Properties properties = new Properties();

    @Override
    public Comparable<?> generateKey() {
        return IdWorker.getInstance().generateId();
    }

    @Override
    public String getType() {
        //声明类型
        return "MYSNOWFLAKE";
    }

    @Override
    public Properties getProperties() {
        return this.properties;
    }

    @Override
    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
