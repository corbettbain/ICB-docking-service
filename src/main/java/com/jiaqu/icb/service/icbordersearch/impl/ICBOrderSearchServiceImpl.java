package com.jiaqu.icb.service.icbordersearch.impl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;
import com.icbc.api.core.ApiClient;
import com.icbc.api.core.ApiException;
import com.icbc.api.core.ApiRequest;
import com.icbc.api.core.ApiResponse;
import com.jiaqu.icb.enums.IcbKey;
import com.jiaqu.icb.enums.IcbOrderSearchParamEnum;
import com.jiaqu.icb.enums.IcbOrderSubmitForXmlEnum;
import com.jiaqu.icb.enums.IcbOrderSubmitServiceEnum;
import com.jiaqu.icb.service.icbordersearch.ICBOrderSearchService;

public class ICBOrderSearchServiceImpl implements ICBOrderSearchService {

	private static final String SUCCESS = "success";

	/**
	 * 接口响应内容
	 */
	private static final String response = "response";

	private Logger logger = LoggerFactory.getLogger(ICBOrderSearchServiceImpl.class);

	@Override
	public Map<String, Object> searchICBOrder(String instid, String subinstid, String insttxsno, String qryorderno,
			String txchannel) throws ApiException {
		logger.info("ICBOrderSearchServiceImpl:查询开始.....");
		return searchICBOrders(instid, subinstid, insttxsno, qryorderno, txchannel, null);
	}

	@Override
	public Map<String, Object> searchICBOrder(String instid, String subinstid, String insttxsno, String qryorderno,
			String txchannel, String qrycardno) throws ApiException {

		return searchICBOrders(instid, subinstid, insttxsno, qryorderno, txchannel, qrycardno);
	}

	private Map<String, Object> searchICBOrders(String instid, String subinstid, String insttxsno, String qryorderno,
			String txchannel, String qrycardno) throws ApiException {
		if (instid == null) {
			throw new NullPointerException("instid为null");
		}
		if (subinstid == null) {
			throw new NullPointerException("subinstid为null");
		}
		if (insttxsno == null) {
			throw new NullPointerException("insttxsno为null");
		}
		if (qryorderno == null) {
			throw new NullPointerException("qryorderno为null");
		}
		if (txchannel == null) {
			throw new NullPointerException("txchannel为null");
		}
		logger.info("ICBOrderSearchServiceImpl:顺利通过控制针检验.....传入参数为:instid:" + instid + "----subinstid:" + subinstid
				+ "----insttxsno:" + insttxsno + "----qryorderno:" + qryorderno + "----txchannel:" + txchannel
				+ "----qrycardno:" + qrycardno);
		
		String priKey = IcbKey.rsaprivatekey.getKey();
		// prikey:调用方私钥
		ApiClient ac = new ApiClient(priKey);
		String apiUrl = IcbOrderSubmitServiceEnum.apiurl.getValue();// 测试环境为http://114.255.225.27/api，如果访问不同就试下https。生产环境必须为https
		String apiName = IcbOrderSubmitServiceEnum.apiname.getValue();// com.icbc.upay.order.query
		String appId = IcbOrderSubmitServiceEnum.appid.getValue();// 即1202打头的机构号

		logger.info("ICBOrderSearchServiceImpl:私钥：" + priKey);
		logger.info("ICBOrderSearchServiceImpl:apiUrl：" + apiUrl + "----apiName:" + apiName + "----appId:" + appId);
		
		ApiRequest req = new ApiRequest(apiUrl, apiName, appId);
		req.setRequestField(IcbOrderSearchParamEnum.instid.toString(), instid);
		req.setRequestField(IcbOrderSearchParamEnum.subinstid.toString(), subinstid);
		req.setRequestField(IcbOrderSearchParamEnum.insttxsno.toString(), insttxsno);
		req.setRequestField(IcbOrderSearchParamEnum.insttxsno.toString(), qryorderno);
		if (qrycardno != null) {
			req.setRequestField(IcbOrderSearchParamEnum.qrycardno.toString(), qrycardno);
		}

		req.setRequestField(IcbOrderSearchParamEnum.txchannel.toString(),
				IcbOrderSubmitForXmlEnum.txchannel.getValue());

		Map<String, Object> map = new HashMap<>();

		ApiResponse ar = ac.execute(req);
		String api_retmsg = ar.getString(ICBC_API_RETMSG);
		
		logger.info("ICBOrderSearchServiceImpl:响应结果api_retmsg:" + api_retmsg);
		
		if (api_retmsg.equals(SUCCESS)) {// api调用成功
			map.put(ICBC_API_RETMSG, ar.getString(ICBC_API_RETMSG).toString());
			map.put(ICBC_API_RETCODE, ar.getString(ICBC_API_RETCODE).toString());
			map.put(ICBC_API_TIMESTAMP, ar.getString(ICBC_API_TIMESTAMP).toString());
			map.put(rspcode, ar.getString(rspcode).toString());
			map.put(rspmsg, ar.getString(rspmsg).toString());

			JSONObject jsonObject = JSONObject.parseObject(ar.getString(response));
			if (jsonObject == null) {
				throw new NullPointerException("response响应信息转换json失败");
			}
			if (jsonObject.containsKey(ICBOrderSearchService.insttxsno)) {
				throw new NullPointerException("insttxsno在json中不存在");
			}
			if (jsonObject.containsKey(ICBOrderSearchService.status)) {
				throw new NullPointerException("status在json中不存在");
			}
			if (jsonObject.containsKey(ICBOrderSearchService.resultcode)) {
				throw new NullPointerException("resultcode在json中不存在");
			}
			if (jsonObject.containsKey(ICBOrderSearchService.resultmsg)) {
				throw new NullPointerException("resultmsg在json中不存在");
			}
			if (jsonObject.containsKey(ICBOrderSearchService.amount)) {
				throw new NullPointerException("amount在json中不存在");
			}
			map.put(ICBOrderSearchServiceImpl.insttxsno, jsonObject.get(ICBOrderSearchServiceImpl.insttxsno));
			map.put(status, jsonObject.get(status));
			map.put(resultcode, jsonObject.get(resultcode));
			map.put(resultmsg, jsonObject.get(resultmsg));
			map.put(amount, jsonObject.get(amount));
			
			logger.info("ICBOrderSearchServiceImpl:map结果集:" + map.toString());
			return map;
		} else {
			return null;
		}

	}
}
