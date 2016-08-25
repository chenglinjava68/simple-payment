/*
 * Copyright 2014-2018 the original author or authors.
 */
package cn.hex16.payment.gateway.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 说明
 * 
 * @author 柒葉
 * @since 1.0
 * @date 2016年8月27日
 */
public class PayRequestParam implements Serializable {
	private String url;

	private String method;

	private Map<String, Object> data = new HashMap<>();
	
	
}
