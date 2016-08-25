/*
 * Copyright 2014-2018 the original author or authors.
 */
package cn.hex16.payment.gateway.core;

import java.util.List;
import java.util.Map;

import cn.hex16.payment.gateway.enums.DisplayType;
import cn.hex16.payment.gateway.enums.GatewayChannel;
import cn.hex16.payment.gateway.enums.PayMethodType;
import cn.hex16.payment.gateway.enums.RequestMethod;

/**
 * 支付网关统一配置接口
 * 
 * @author 柒葉
 * @since 1.0
 * @date 2016年8月24日
 */
public interface PayGatewayConfig {
	/**
	 * 获取支付网关ID
	 * 
	 * @return
	 */
	public String getGatewayId();

	/**
	 * 设置支付网关ID
	 * 
	 * @param gatewayId
	 */
	public void SetGatewayId(String gatewayId);

	/**
	 * 是否启用支付网关插件
	 * 
	 * @return
	 */
	public boolean isEnabled();

	/**
	 * 设置支付网关插件
	 * 
	 * @param enabled
	 */
	public void setEnabled(boolean enabled);

	/**
	 * 获取支付分组
	 * 
	 * @return
	 */
	public PayGatewayGroup getGroup();

	/**
	 * 设置支付分组
	 * 
	 * @param group
	 */
	public void setGroup(PayGatewayGroup group);

	/**
	 * 添加支付插件参数
	 * 
	 * @param name
	 * @param value
	 */
	public void putProperty(String name, String value);

	/**
	 * 获取插件参数
	 * 
	 * @return
	 */
	public Map<String, String> getProperties();

	/**
	 * 获取提交方式
	 * 
	 * @return
	 */
	public DisplayType getDisplayType();

	/**
	 * 设置提交方式
	 * 
	 * @param type
	 */
	public void setDisplayType(DisplayType type);

	/**
	 * 获取支付插件支持的平台
	 * 
	 * @return
	 */
	public List<GatewayChannel> getGatewayChannels();

	/**
	 * 设置支付插件支持的平台
	 * 
	 * @param channels
	 */
	public void setGatewayChannels(List<GatewayChannel> channels);

	/**
	 * 设置支付插件应用场景
	 * 
	 * @return
	 */
	public PayMethodType getPayMethodType();

	/**
	 * 获取支付插件应用场景
	 * 
	 * @param payMethodType
	 */
	public void setPayMethodType(PayMethodType payMethodType);

	/**
	 * 获取提交方式(针对PC网页端)
	 * 
	 * @return
	 */
	public RequestMethod getRequestMethod();

	/**
	 * 设置支付插件提交方式(针对PC网页端)
	 * 
	 * @param requestMethod
	 */
	public void setRequestMethod(RequestMethod requestMethod);
}
