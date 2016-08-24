/*
 * Copyright 2014-2018 the original author or authors.
 */
package cn.hex16.payment.gateway.core;

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
	 * @return
	 */
	public boolean isEnabled();
	
	/**
	 * 设置支付网关插件
	 * @param enabled
	 */
	public void setEnabled(boolean enabled);

}
