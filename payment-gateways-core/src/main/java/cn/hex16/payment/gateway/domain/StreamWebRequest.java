/*
 * Copyright 2014-2018 the original author or authors.
 */
package cn.hex16.payment.gateway.domain;

import java.nio.ByteBuffer;

import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;

import cn.hex16.payment.gateway.core.WebRequest;

/**
 * 考虑到部分网关数据交互方式采用的不是Form表单，而是如:xml、json这种特殊格式
 * 
 * @author 柒葉
 * @since 1.0
 * @date 2016年8月27日
 */
public class StreamWebRequest implements WebRequest {
	private static final long serialVersionUID = 1L;

	// 文件流文本内容
	private String streamText;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cn.hex16.payment.gateway.core.WebRequest#transform(javax.servlet.http.
	 * HttpServletRequest)
	 */
	@Override
	public void transform(HttpServletRequest request) {
		ServletInputStream stream = null;
		try {
			stream = request.getInputStream();
			int i = stream.available();
			if (i < 0) {
				i = 1024;
			}
			byte[] tmp = new byte[i];
			int l;
			StringBuffer buffer = new StringBuffer();
			while ((l = stream.read(tmp)) != -1) {
				buffer.append(new String(tmp, 0, l));
			}
			streamText = buffer.toString();
		} catch (Exception ex) {

		} finally {
			if (stream != null) {
				try {
					stream.close();
				} catch (Exception ex) {

				}
			}
		}
	}

	/**
	 * @return the streamText
	 */
	public String getStreamText() {
		return streamText;
	}

}
