/*
 * Copyright 2014-2018 the original author or authors.
 */
package cn.hex16.payment.gateway.core;

/**
 * 支付网关插件分组
 * 
 * @author 柒葉
 * @since 1.0
 * @date 2016年8月24日
 */
public interface PayGatewayGroup {
	/**
	 * 获取分组名称
	 * @return
	 */
	public String getName();

	/**
	 * 设置分组名称
	 * @param name
	 */
	public void setName(String name);
	
	
}
