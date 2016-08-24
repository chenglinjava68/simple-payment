/*
 * Copyright 2014-2018 the original author or authors.
 */
package cn.hex16.payment.gateway.core;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * http servlet request封装
 * 
 * @author 柒葉
 * @since 1.0
 * @date 2016年8月25日
 */
public class HttpRequest implements Serializable {
	private static final long serialVersionUID = 1L;

	// 请求参数
	private Map<String, List<String>> paramters = new HashMap<String, List<String>>();
	
	/**
	 * 根据参数名称获取请求参数
	 * @param name 参数名称
	 * @return 参数值
	 */
	public String getParameter(String name) {
		List<String> vals = paramters.get(name);
		if (vals == null || vals.isEmpty()) {
			return null;
		}

		if (vals.size() == 1) {
			// simple form.
			return vals.get(0).toString();
		}

		// delimited form
		StringBuilder values = new StringBuilder(128);
		for (String e : vals) {
			if (e != null) {
				if (values.length() > 0)
					values.append(',');
				values.append(e.toString());
			}
		}
		return values.toString();
	}
 
	/**
	 * 根据参数名称获取请求参数集合
	 * @param name 参数名称
	 * @return 参数值(集合)
	 */
	public String[] getParameterValues(String name) {
		List<String> vals = paramters.get(name);
		if (vals == null || vals.isEmpty())
			return null;
		return vals.toArray(new String[vals.size()]);
	}
 
}
