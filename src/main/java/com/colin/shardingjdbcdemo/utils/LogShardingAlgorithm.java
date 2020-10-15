package com.colin.shardingjdbcdemo.utils;

import com.google.common.collect.Range;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.standard.RangeShardingValue;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Package: com.colin.shardingjdbcdemo.utils
 * @Author: sxf
 * @Date: 2020-10-10
 * @Description: 日志分片
 */
public class LogShardingAlgorithm implements PreciseShardingAlgorithm, RangeShardingAlgorithm<Integer> {

    @Override
    public String doSharding(Collection availableTargetNames, PreciseShardingValue shardingValue) {
        String target = shardingValue.getValue().toString();
        String [] targetArr = target.split("-");
        return shardingValue.getLogicTableName() +  "_" +  targetArr[0]+targetArr[1];
    }

    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, RangeShardingValue<Integer> shardingValue) {
        Collection<String> availables = new ArrayList<>();
        Range valueRange = shardingValue.getValueRange();
        /*2020-10-10 09:14:00*/
        for (String target : availableTargetNames) {
            Integer shardValue = Integer.parseInt(target.substring(target.lastIndexOf("_")+1,target.lastIndexOf("_")+7));
            if (valueRange.hasLowerBound()) {
                String lowerStr = valueRange.lowerEndpoint().toString();
                Integer start = Integer.parseInt(lowerStr.substring(0, 4) + lowerStr.substring(5, 7));
                if (start - shardValue > 0) {
                    continue;
                }
            }
            if (valueRange.hasUpperBound()) {
                String upperStr = valueRange.upperEndpoint().toString();
                Integer end = Integer.parseInt(upperStr.substring(0, 4) + upperStr.substring(5,7));
                if (end - shardValue < 0) {
                    continue;
                }
            }
            availables.add(target);
        }
        return availables;
    }
}