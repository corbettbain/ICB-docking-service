package com.jiaqu.icb.service.icbrec.impl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.icbc.api.codec.Base64;
import com.icbc.api.core.ApiClient;
import com.jiaqu.icb.enums.IcbOrderMessageRecServiceEnum;
import com.jiaqu.icb.service.icbrec.ICBOrderMessageRecService;

/**
 * 工行主动通知接受数据业务层
 * @author 周宁
 *
 */

@Service
public class ICBOrderMessageRecServiceimpl implements ICBOrderMessageRecService {

	
	private Logger logger = Logger.getLogger(ICBOrderMessageRecServiceimpl.class);
	
	/**
	 * 订单通知的业务层,接收通知并且验证签名
	 * @author 周宁
	 * @throws Exception 
	 *
	 */
	@Override
	public Object orderMessageRec(HttpServletRequest request,HttpServletResponse response) throws Exception {
		logger.info("ICBOrderMessageRecServiceimpl : 开始获取订单通知参数");
		System.out.println("支付结果通知...");
		String transtype = request.getParameter(IcbOrderMessageRecServiceEnum.transtype.toString());
		
		String version = request.getParameter(IcbOrderMessageRecServiceEnum.version.toString());
		
		String reqdata = new String(Base64.decodeBase64(
									request.getParameter(IcbOrderMessageRecServiceEnum.reqdata.toString()).getBytes(IcbOrderMessageRecServiceEnum.charset.getValue())));
		
		String apigw_sign = request.getParameter(IcbOrderMessageRecServiceEnum.apigw_sign.toString());
		
		String apigw_timestamp = request.getParameter(IcbOrderMessageRecServiceEnum.apigw_timestamp.toString());
		
		String apigw_certid = request.getParameter(IcbOrderMessageRecServiceEnum.apigw_certid.toString());
		
		logger.info("ICBOrderMessageRecServiceimpl : 参数为:transtype:" + transtype + "----version:" + version +"----reqdata:" + reqdata + "-----apigw_sign:" + apigw_sign + "----apigw_timestamp:" + apigw_timestamp + "----apigw_certid:" + apigw_certid);
		
		logger.info("ICBOrderMessageRecServiceimpl : 开始开始封装参数进行验签");
		Map<String,String> paramMap = new HashMap<String,String>();
		paramMap.put(IcbOrderMessageRecServiceEnum.transtype.toString(), transtype);
		paramMap.put(IcbOrderMessageRecServiceEnum.version.toString(), version);
		paramMap.put(IcbOrderMessageRecServiceEnum.apigw_timestamp.toString(), apigw_timestamp);
		paramMap.put(IcbOrderMessageRecServiceEnum.apigw_certid.toString(), apigw_certid);
		paramMap.put(IcbOrderMessageRecServiceEnum.reqdata.toString(), reqdata);

		logger.info("ICBOrderMessageRecServiceimpl : 参数为:" + paramMap);
		
		if(transtype.equals(IcbOrderMessageRecServiceEnum.transtype.getValue())){
			ApiClient ac = new ApiClient(null,IcbOrderMessageRecServiceEnum.pubceraddr.getValue());
			try{
				boolean isOK = ac.doVerify(paramMap,apigw_sign,IcbOrderMessageRecServiceEnum.charset.getValue());
				if(isOK){
					System.out.println("验签通过...");
					logger.info("ICBOrderMessageRecServiceimpl : 验签通过");
				}
			}catch(Exception e){
				System.out.printf(e.getMessage(),e);
			}
		}
		
		return null;
	}

}
