/*
 * Copyright 2014-2018 the original author or authors.
 */
package cn.hex16.payment.gateway.core;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

/**
 * 解决{@link HttpServletRequest}不能序列化
 * 
 * @author 柒葉
 * @since 1.0
 * @date 2016年8月27日
 */
public interface WebRequest extends Serializable{
	/**
	 * 将{@link HttpServletRequest}转换成{@link WebRequest}
	 * 
	 * @param request
	 *            WebRequest
	 */
	void transform(HttpServletRequest request);
}
