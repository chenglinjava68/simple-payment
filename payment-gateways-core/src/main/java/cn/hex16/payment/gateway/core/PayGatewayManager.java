/*
 * Copyright 2014-2018 the original author or authors.
 */
package cn.hex16.payment.gateway.core;

import java.util.List;

import cn.hex16.payment.gateway.enums.GatewayChannel;
import cn.hex16.payment.gateway.enums.PayMethodType;

/**
 * 支付插件管理类
 * 
 * @author 柒葉
 * @since 1.0
 * @date 2016年8月28日
 */
public interface PayGatewayManager {
	/**
	 * 注册支付插件
	 * @param payGateway
	 */
	public void registerPayGateway(PayGateway payGateway);

	/**
	 * 根据支付插件ID获取支付插件
	 * @param payGatewayId
	 * @return
	 */
	public PayGateway getPayGateway(String payGatewayId);

	/**
	 * 根据终端平台和应用场景获取支付插件
	 * @param channel 支付方式终端支持
	 * @param payMethodType 支付插件应用场景
	 * @return
	 */
	public List<PayGateway> getPayGateways(GatewayChannel channel, PayMethodType payMethodType);
}
