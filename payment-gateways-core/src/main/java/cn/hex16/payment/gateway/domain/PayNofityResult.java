/*
 * Copyright 2014-2018 the original author or authors.
 */
package cn.hex16.payment.gateway.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 回调通知结果封装
 * 
 * @author 柒葉
 * @since 1.0
 * @date 2016年8月27日
 */
public class PayNofityResult implements Serializable {
	private boolean result;

	private Map<String, Object> data = new HashMap<>();

	/**
	 * @param result
	 *            the result to set
	 */
	public void setResult(boolean result) {
		this.result = result;
	}

	public boolean isSuccess() {
		return result;
	}

	public void put(String key, Object value) {
		data.put(key, value);
	}

	public String getString(String key) {
		return (String) data.get(key);
	}

	public int getInt(String key) {
		return (int) data.get(key);
	}

	public boolean getBoolean(String key) {
		return (boolean) data.get(key);
	}

	public Object getObject(String key) {
		return data.get(key);
	}

	public void putAll(Map<String, Object> map) {
		if (map == null)
			return;
		data.putAll(map);
	}
}
