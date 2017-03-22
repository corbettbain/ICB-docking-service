package com.jiaqu.icb.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiaqu.icb.pojo.order.submit.OrderSubmission;
import com.jiaqu.icb.pojo.result.Result;
import com.jiaqu.icb.service.icbrec.ICBOrderMessageRecService;
import com.jiaqu.icb.service.icbsubmit.ICBOrderSubmitService;

@Controller
@RequestMapping("/icb")
public class ICBController {

	@Inject
	private ICBOrderSubmitService iCBOrderSubmitService;
	
	@Inject
	private ICBOrderMessageRecService iCBOrderMessageRecService;
	
	@RequestMapping(value = "/order-submit", method = RequestMethod.POST)
	@ResponseBody
	public Result icbPay(HttpServletRequest request,HttpServletResponse response,OrderSubmission orderSubmission){
		
		iCBOrderSubmitService.orderSunmit(request, response, orderSubmission);
		return  new Result();		
	}
	
	@RequestMapping(value = "/order-msg-rec",method = RequestMethod.POST)
	@ResponseBody
	public Result icbMessageRec(HttpServletRequest request ,HttpServletResponse response){
		
		iCBOrderMessageRecService.orderMessageRec(request, response);
		return new Result();
	}
	
}
