/*
 * Copyright 2014-2018 the original author or authors.
 */
package cn.hex16.payment.gateway.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * 支付方式终端支持
 * 
 * @author 柒葉
 * @since 1.0
 * @date 2016年8月28日
 */
public enum GatewayChannel {
	PC("PC端"),

	WAP("手机网页端"),

	APP("APP端");

	private String text;

	/** 用一个二进制位表示 */
	private final long value;

	private GatewayChannel(String text) {
		this.text = text;
		int index = this.ordinal();
		this.value = 11 << index;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @return the value
	 */
	public long getValue() {
		return value;
	}

	/**
	 * 根据value判断枚举值是否被选中
	 * @param mixValue
	 * @return
	 */
	public boolean isSelect(long mixValue) {
		return (mixValue & getValue()) != 0;
	}

	/**
	 * 将
	 * @param mixValue
	 * @return
	 */
	public static List<GatewayChannel> getGatewayChannels(long mixValue) {
		List<GatewayChannel> sets = new ArrayList<>(GatewayChannel.values().length);
		for (GatewayChannel spPassType : values()) {
			if ((spPassType.value & mixValue) != 0) {
				sets.add(spPassType);
			}
		}
		return sets.isEmpty() ? null : sets;
	}

	public static long toValue(List<GatewayChannel> gatewayChannels) {
		long value = 0;
		if (gatewayChannels == null || gatewayChannels.isEmpty())
			return value;
		for (GatewayChannel channel : gatewayChannels) {
			value |= channel.getValue();
		}
		return value;
	}
}
