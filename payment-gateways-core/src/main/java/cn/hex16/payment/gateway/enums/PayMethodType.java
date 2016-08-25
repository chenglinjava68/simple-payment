/*
 * Copyright 2014-2018 the original author or authors.
 */
package cn.hex16.payment.gateway.enums;

/**
 * 支付插件应用场景
 * 
 * @author 柒葉
 * @since 1.0
 * @date 2016年8月28日
 */
public enum PayMethodType {
	PURCHASE("购买"),
	
	REFUND("退款");
	
	private String text;
	
	private PayMethodType(String text)
	{
		this.text = text;
	}
	
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
}
