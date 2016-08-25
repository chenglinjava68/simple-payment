/*
 * Copyright 2014-2018 the original author or authors.
 */
package cn.hex16.payment.gateway.core;

import cn.hex16.payment.gateway.domain.PayNofityResult;
import cn.hex16.payment.gateway.domain.PayRequestParam;

/**
 * 支付插件标准接口
 * 
 * @author 柒葉
 * @since 1.0
 * @date 2016年8月24日
 */
public interface PayGateway {
	/**
	 * 获取插件ID
	 * 
	 * @return
	 */
	public String getId();

	/**
	 * 获取插件名称
	 * 
	 * @return
	 */
	public String getName();

	/**
	 * 支付return返回，request包装类
	 * 
	 * @return
	 */
	public Class<? extends WebRequest> getReturnRequestClass();

	/**
	 * 支付notify回调request包装类
	 * 
	 * @return
	 */
	public Class<? extends WebRequest> getNotifyRequestClass();

	/**
	 * 获取支付网关配置信息
	 * 
	 * @return
	 */
	public PayGatewayConfig getConfig();

	/**
	 * 构建请求参数
	 * 
	 * @param request
	 *            <p>http请求,该对象出web由用户提交的部分参数，还必须包含以下约定参数<p>
	 *            <table style=" border-collapse: collapse">
	 *            <tr>
	 *            <td style="border: solid 1px blue;">参数</td>
	 *            <td style="border: solid 1px blue;">类型</td>
	 *            <td style="border: solid 1px blue;">说明</td>
	 *            </tr>
	 *            <tr>
	 *            <td style="border: solid 1px blue;">sn</td>
	 *            <td style="border: solid 1px blue;">String</td>
	 *            <td style="border: solid 1px blue;">订单流水号</td>
	 *            </tr>
	 *              <tr>
	 *            <td style="border: solid 1px blue;">amout</td>
	 *            <td style="border: solid 1px blue;">BigDecimal</td>
	 *            <td style="border: solid 1px blue;">充值金额</td>
	 *            </tr>
	 *            <tr>
	 *            <td style="border: solid 1px blue;">title</td>
	 *            <td style="border: solid 1px blue;">String</td>
	 *            <td style="border: solid 1px blue;">订单标题</td>
	 *            </tr>
	 *               <tr>
	 *            <td style="border: solid 1px blue;">description</td>
	 *            <td style="border: solid 1px blue;">String</td>
	 *            <td style="border: solid 1px blue;">订单详情</td>
	 *            </tr>
	 *            </table>
	 * @return
	 */
	public PayRequestParam buildPayParams(WebRequest request);

	/**
	 * 校验异步回调通知
	 * 
	 * @param request
	 * @return
	 */
	public PayNofityResult checkNotify(WebRequest request);

	/**
	 * 
	 * @param request
	 * @return
	 */
	public PayGatewayConfig transform(WebRequest request);
}
