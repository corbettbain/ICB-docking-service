package com.jiaqu.icb.service.icbrec.impl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.icbc.api.codec.Base64;
import com.icbc.api.core.ApiClient;
import com.icbc.api.core.ApiException;
import com.jiaqu.icb.enums.IcbOrderMessageRecServiceEnum;
import com.jiaqu.icb.service.icbrec.ICBOrderMessageRecService;

/**
 * 工行主动通知接受数据业务层
 * @author 周宁
 *
 */

public class ICBOrderMessageRecServiceImpl implements ICBOrderMessageRecService {

	
	private Logger logger = LoggerFactory.getLogger(ICBOrderMessageRecServiceImpl.class);
	
	private static final String RESULT_SIGNATURE_FAIL = "验签不通过";
	
	private static final String RESULT_SIGNATURE_SUCCESS = "验签通过";
	
	private static final String RESULT_TRANSTYPE_FAIL = "TRANSTYPE不符";
	/**
	 * 订单通知的业务层,接收通知并且验证签名
	 * @author 周宁
	 * @throws Exception 
	 *
	 */
	@Override
	public Map<String, Object> orderMessageRec(HttpServletRequest request,HttpServletResponse response) throws Exception {
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
		
		return signature(transtype, version, apigw_timestamp
					, apigw_certid, reqdata, apigw_sign, IcbOrderMessageRecServiceEnum.charset);
	}

	@Override
	public Map<String, Object> orderMessageRec(String transtype, String version, String apigw_timestamp,
			String apigw_certid, String reqdata, String apigw_sign) throws Exception {
		logger.info("ICBOrderMessageRecServiceimpl : 开始获取订单通知参数");
		
		return signature(transtype, version, apigw_timestamp
				, apigw_certid, reqdata, apigw_sign, IcbOrderMessageRecServiceEnum.charset);
	}

	
	

	
	private Map<String, Object> signature(String transtype,String version,String apigw_timestamp,String apigw_certid,String reqdata,String apigw_sign,IcbOrderMessageRecServiceEnum charset) throws ApiException{
		logger.info("ICBOrderMessageRecServiceImpl : 开始开始封装参数进行验签");
		Map<String, String> paramMap = new HashMap<String,String>();
		paramMap.put(IcbOrderMessageRecServiceEnum.transtype.toString(), transtype);
		paramMap.put(IcbOrderMessageRecServiceEnum.version.toString(), version);
		paramMap.put(IcbOrderMessageRecServiceEnum.apigw_timestamp.toString(), apigw_timestamp);
		paramMap.put(IcbOrderMessageRecServiceEnum.apigw_certid.toString(), apigw_certid);
		paramMap.put(IcbOrderMessageRecServiceEnum.reqdata.toString(), reqdata);

		logger.info("ICBOrderMessageRecServiceImpl : 参数为:" + paramMap + "----apigw_sign:" + apigw_sign);
		
		Map<String, Object> map = new HashMap<>();
		map.put(ICBOrderMessageRecService.REC_DATA,paramMap);
		
		if(transtype.equals(IcbOrderMessageRecServiceEnum.transtype.getValue())){
			ApiClient ac = new ApiClient(null,IcbOrderMessageRecServiceEnum.pubceraddr.getValue());
			boolean isOK = ac.doVerify(paramMap,apigw_sign,charset.getValue());
			if(isOK){
				System.out.println("验签通过...");
				logger.info("ICBOrderMessageRecServiceImpl : 验签通过");
				map.put(IS_OK, true);
				map.put(RESULT, RESULT_SIGNATURE_SUCCESS);
				return map;
			}else {
				map.put(IS_OK, false);
				map.put(RESULT, RESULT_SIGNATURE_FAIL);
				return map;
			}
		}else {
			map.put(IS_OK, false);
			map.put(RESULT, RESULT_TRANSTYPE_FAIL);
			return map;
		}	
	}
	
}
