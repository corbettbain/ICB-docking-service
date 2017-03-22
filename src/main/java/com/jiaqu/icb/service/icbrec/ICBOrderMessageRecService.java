package com.jiaqu.icb.service.icbrec;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 获取订单支付通知及其订单获取相关
 * @author 周宁
 *
 */
public interface ICBOrderMessageRecService {

	Object orderMessageRec(HttpServletRequest request,HttpServletResponse response);
	
}
