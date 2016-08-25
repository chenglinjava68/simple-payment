/*
 * Copyright 2014-2018 the original author or authors.
 */
package cn.hex16.payment.gateway.enums;

/**
 * 提交形式
 * 
 * @author 柒葉
 * @since 1.0
 * @date 2016年8月28日
 */
public enum DisplayType {
	FORM("Form表单"), 
	
	AJAX("Ajax");
	
    private String text;
	
	private DisplayType(String text)
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
