package com.jiaqu.icb.enums;

import com.jiaqu.icb.util.IcbStatic;

public enum IcbOrderMessageRecServiceEnum {

	/**
	 * 订单通知时用到的 字段参数 
	 */
	/**
	 * 订单通知-ORDER
	 */
	transtype(IcbStatic.transtype),//订单通知-ORDER
	/**
	 * 版本号
	 */
	version(""),//版本号
	/**
	 * base64编码后xml格式的订单支付结果报文
	 */
	reqdata(""),//base64编码后xml格式的订单支付结果报文
	/**
	 * 签名报文
	 */
	apigw_sign(""),//签名报文
	/**
	 * 时间戳
	 */
	apigw_timestamp(""),//时间戳
	/**
	 * 证书id
	 */
	apigw_certid(""),//证书id
	/**
	 * 编码格式
	 */
	charset(IcbStatic.charset),
	/**
	 * 公钥地址
	 */
	pubceraddr(IcbStatic.pubceraddr),//公钥证书地址"F:/pub.cer"
	;
	
	private String value;
	
	private IcbOrderMessageRecServiceEnum(String value) {
		setValue(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	
}
