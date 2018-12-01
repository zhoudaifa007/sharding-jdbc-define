package com.example.sharding.jdbc.demo.config;

import io.shardingjdbc.core.api.algorithm.sharding.PreciseShardingValue;
import io.shardingjdbc.core.api.algorithm.sharding.standard.PreciseShardingAlgorithm;

import java.util.Collection;

/**
 * 自定义分片算法
 * 
 * @author yinjihuan
 *
 */
public class DatabasePreciseShardingAlgorithm implements PreciseShardingAlgorithm<Integer> {
	@Override
	public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Integer> shardingValue) {
		for (String tableName : availableTargetNames) {
			if (tableName.endsWith(shardingValue.getValue() % availableTargetNames.size() + "")) {
				return tableName;
			}
		}
		throw new IllegalArgumentException();
	}
}
