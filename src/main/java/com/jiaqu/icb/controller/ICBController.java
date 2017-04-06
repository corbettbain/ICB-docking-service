package com.jiaqu.icb.controller;

import java.net.Inet4Address;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jiaqu.icb.pojo.order.publics.Rd;
import com.jiaqu.icb.pojo.order.submit.OrderSubmission;
import com.jiaqu.icb.pojo.result.Result;
import com.jiaqu.icb.service.icbrec.ICBOrderMessageRecService;
import com.jiaqu.icb.service.icbsubmit.ICBOrderSubmitService;
import com.jiaqu.icb.util.NumberUtil;
import com.jiaqu.icb.util.date.DateFormat;

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

		try {
			
			orderSubmission.setGoodsid("12");
			orderSubmission.setGoodsname("1231");
			orderSubmission.setOrderamount(1);
			
			Rd rd = new Rd();
			rd.setDescription("");
			rd.setPayamount(orderSubmission.getOrderamount());
			orderSubmission.setRd(rd);
			orderSubmission.setTranstime(Long.parseLong(DateFormat.dateFormat("yyyyMMddHHmmss")));
			orderSubmission.setOrderno(NumberUtil.getRandNum16());
			orderSubmission.setInstcustomip(Inet4Address.getLocalHost().getHostAddress());
			orderSubmission.setNote1("");
			orderSubmission.setNote2("");
			orderSubmission.setNote3("");
			orderSubmission.setNote4("");
			orderSubmission.setNote5("");
			orderSubmission.setMobileno("15394338986");
			String html = iCBOrderSubmitService.orderSunmit(request, response, orderSubmission);
			return  new Result(html);
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(-1,"服务器异常",null);
		}		
	}
	
	@RequestMapping(value = "/order-msg-rec")
	@ResponseBody
	public Result icbMessageRec(HttpServletRequest request ,HttpServletResponse response){
		
		try {
			iCBOrderMessageRecService.orderMessageRec(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Result(null);
	}
	
}
