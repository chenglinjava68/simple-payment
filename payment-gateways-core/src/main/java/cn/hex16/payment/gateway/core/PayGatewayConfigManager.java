/*
 * Copyright 2014-2018 the original author or authors.
 */
package cn.hex16.payment.gateway.core;

import java.util.List;

/**
 * 支付插件统一配置管理类
 * 
 * @author 柒葉
 * @since 1.0
 * @date 2016年8月28日
 */
public interface PayGatewayConfigManager {
	/**
	 * 保存支付插件配置
	 * 
	 * @param config
	 */
	public void saveConfig(PayGatewayConfig config);

	/**
	 * 删除指定支付插件配置
	 * 
	 * @param payGatewayId
	 */
	public void deleteConfig(String payGatewayId);

	/**
	 * 获取指定支付插件配置
	 * 
	 * @param payGatewayId
	 * @return
	 */
	public PayGatewayConfig getConfig(String payGatewayId);

	/**
	 * 获取所有支付分组
	 * 
	 * @return
	 */
	public List<PayGatewayGroup> getGroups();

	/**
	 * 删除支付分组
	 * 
	 * @param id
	 */
	public void deleteGroup(long id);

	/**
	 * 保存支付分组
	 * 
	 * @param group
	 */
	public void saveGroup(PayGatewayGroup group);

	/**
	 * 更新支付分组
	 * 
	 * @param group
	 */
	public void updateGroup(PayGatewayGroup group);

	/**
	 * 获取指定支付分组
	 * 
	 * @param id
	 * @return
	 */
	public PayGatewayGroup getGroup(long id);
}
