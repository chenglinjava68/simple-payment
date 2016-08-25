/*
 * Copyright 2014-2018 the original author or authors.
 */
package cn.hex16.payment.gateway.enums;

/**
 * 提交方式
 * 
 * @author 柒葉
 * @since 1.0
 * @date 2016年8月28日
 */
public enum RequestMethod {
	GET("get"), 
	
	POST("post");
	
	private String text;
	
	private RequestMethod(String text)
	{
		this.text =text;
	}
	
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
}
