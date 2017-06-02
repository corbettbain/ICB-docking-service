package com.jiaqu.icb.service.icbrec;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 获取订单支付通知及其订单获取相关
 * @author 周宁
 *
 */
public interface ICBOrderMessageRecService {

	/**
	 * 获取接收到的参数
	 */
	public static final String REC_DATA = "REC_DATA";
	/**
	 * 验签结果
	 */
	public static final String IS_OK = "IS_OK";
	/**
	 * 验签结果原因
	 */
	public static final String RESULT = "RESULT";
	
	
	Map<String, Object> orderMessageRec(HttpServletRequest request,HttpServletResponse response) throws Exception;
	
	Map<String, Object> orderMessageRec(String transtype,String version,String apigw_timestamp,String apigw_certid,String reqdata,String apigw_sign) throws Exception;
	
}
