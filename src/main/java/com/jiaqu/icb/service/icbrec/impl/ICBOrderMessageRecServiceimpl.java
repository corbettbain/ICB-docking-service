package com.jiaqu.icb.service.icbrec.impl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.icbc.api.core.ApiClient;
import com.jiaqu.icb.enums.IcbOrderMessageRecServiceEnum;
import com.jiaqu.icb.service.icbrec.ICBOrderMessageRecService;
import com.jiaqu.icb.util.ecode.EcodeUtil;

/**
 * 工行主动通知接受数据业务层
 * @author 周宁
 *
 */

@Service
public class ICBOrderMessageRecServiceimpl implements ICBOrderMessageRecService {

	/**
	 * 订单通知的业务层,接收通知并且验证签名
	 * @author 周宁
	 *
	 */
	@Override
	public Object orderMessageRec(HttpServletRequest request,HttpServletResponse response) {
		
		System.out.println("支付结果通知...");
		String transtype = request.getParameter(IcbOrderMessageRecServiceEnum.transtype.toString());
		
		String version = request.getParameter(IcbOrderMessageRecServiceEnum.version.toString());
		
		String reqdata = new String(EcodeUtil.base64Decode(
									request.getParameter(IcbOrderMessageRecServiceEnum.reqdata.toString())
										,IcbOrderMessageRecServiceEnum.charset.getValue()));
		
		String apigw_sign = request.getParameter(IcbOrderMessageRecServiceEnum.apigw_sign.toString());
		
		String apigw_timestamp = request.getParameter(IcbOrderMessageRecServiceEnum.apigw_timestamp.toString());
		
		String apigw_certid = request.getParameter(IcbOrderMessageRecServiceEnum.apigw_certid.toString());
				
		Map<String,String> paramMap = new HashMap<String,String>();
		paramMap.put(IcbOrderMessageRecServiceEnum.transtype.toString(), transtype);
		paramMap.put(IcbOrderMessageRecServiceEnum.version.toString(), version);
		paramMap.put(IcbOrderMessageRecServiceEnum.apigw_timestamp.toString(), apigw_timestamp);
		paramMap.put(IcbOrderMessageRecServiceEnum.apigw_certid.toString(), apigw_certid);
		paramMap.put(IcbOrderMessageRecServiceEnum.reqdata.toString(), reqdata);

		if(transtype.equals(IcbOrderMessageRecServiceEnum.transtype.getValue())){
			ApiClient ac = new ApiClient(null,IcbOrderMessageRecServiceEnum.pubceraddr.getValue());
			try{
				boolean isOK = ac.doVerify(paramMap,apigw_sign,IcbOrderMessageRecServiceEnum.charset.getValue());
				if(isOK){
					System.out.println("验签通过...");
					System.out.println("success");
				}
			}catch(Exception e){
				System.out.printf(e.getMessage(),e);
			}
		}
		
		return null;
	}

}
