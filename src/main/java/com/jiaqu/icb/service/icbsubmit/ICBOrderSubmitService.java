package com.jiaqu.icb.service.icbsubmit;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.icbc.api.core.ApiException;
import com.jiaqu.icb.pojo.order.submit.OrderSubmission;

public interface ICBOrderSubmitService {

	/**
	 * 订单提交业务
	 * @return 
	 * @throws IOException 
	 * @throws ApiException 
	 */
	String orderSunmit(HttpServletRequest request , HttpServletResponse response,OrderSubmission orderSubmission) throws IOException, ApiException;
}
