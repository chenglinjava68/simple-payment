/*
 * Copyright 2014-2018 the original author or authors.
 */
package cn.hex16.payment.gateway.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import cn.hex16.payment.gateway.core.WebRequest;

/**
 * 说明
 * 
 * @author 柒葉
 * @since 1.0
 * @date 2016年8月27日
 */
public class FormWebRequest implements WebRequest {
	private Map<String, List<String>> parameters = new HashMap<>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * cn.hex16.payment.gateway.core.WebRequest#transform(javax.servlet.http.
	 * HttpServletRequest)
	 */
	@Override
	public void transform(HttpServletRequest request) {

	}

	public Map<String, String[]> getParameterMap() {
		HashMap<String, String[]> map = new HashMap<String, String[]>(parameters.size() * 3 / 2) {
			@Override
			public String toString() {
				StringBuilder b = new StringBuilder();
				b.append('{');
				for (String k : super.keySet()) {
					if (b.length() > 1)
						b.append(',');
					b.append(k);
					b.append('=');
					b.append(Arrays.asList(super.get(k)));
				}

				b.append('}');
				return b.toString();
			}
		};

		for (Map.Entry<String, List<String>> entry : parameters.entrySet()) {
			String[] a = null;
			if (entry.getValue() != null) {
				a = new String[entry.getValue().size()];
				a = entry.getValue().toArray(a);
			}
			map.put(entry.getKey(), a);
		}
		return Collections.unmodifiableMap(map);
	}

	public String getParameter(String name) {
		List<String> vals = parameters.get(name);
		if ((vals == null) || (vals.isEmpty())) {
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

	public String[] getParameterValues(String name) {
		List<String> vals = parameters.get(name);
		if (vals == null)
			return null;
		return vals.toArray(new String[vals.size()]);
	}

	public Enumeration<String> getParameterNames() {
		return Collections.enumeration(parameters.keySet());
	}
}
