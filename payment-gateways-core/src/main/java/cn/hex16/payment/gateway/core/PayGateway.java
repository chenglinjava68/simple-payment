/*
 * Copyright 2014-2018 the original author or authors.
 */
package cn.hex16.payment.gateway.core;

/**
 * 支付插件标准接口
 * 
 * @author 柒葉
 * @since 1.0
 * @date 2016年8月24日
 */
public interface PayGateway {
	void createRequest();
	void checkOrder();
}
