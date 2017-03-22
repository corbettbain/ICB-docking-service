package com.jiaqu.icb.service.icbsubmit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jiaqu.icb.pojo.order.submit.OrderSubmission;

public interface ICBOrderSubmitService {

	/**
	 * 订单提交业务
	 */
	void orderSunmit(HttpServletRequest request , HttpServletResponse response,OrderSubmission orderSubmission);
}
