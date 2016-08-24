/*
 * Copyright 2014-2018 the original author or authors.
 */
package cn.hex16.payment.gateway.core;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 支付请求
 * 
 * @author 柒葉
 * @since 1.0
 * @date 2016年8月25日
 */
public class PayRequest {
	//请求参数
	private Map<String, List<String>> paramters = new HashMap<String, List<String>>();

	//提交方式
	private String method;

	//请求地址
	private String url;             
}
