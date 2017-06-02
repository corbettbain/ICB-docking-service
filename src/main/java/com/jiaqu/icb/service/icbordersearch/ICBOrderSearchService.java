package com.jiaqu.icb.service.icbordersearch;

import java.util.Map;

import com.icbc.api.core.ApiException;

/**
 * 工行订单查询接口
 * @author 周宁
 *
 */
public interface ICBOrderSearchService {

	/**
	 * API网关响应码
	 */
	public static final String ICBC_API_RETMSG = "ICBC_API_RETMSG";
	/**
	 * API网关响应信息
	 */
	public static final String ICBC_API_RETCODE = "ICBC_API_RETCODE";
	/**
	 * API网关响应时间戳
	 */
	public static final String ICBC_API_TIMESTAMP = "ICBC_API_TIMESTAMP";
	/**
	 * 响应码
	 */
	public static final String rspcode = "rspcode";
	/**
	 * 响应信息
	 */
	public static final String rspmsg = "rspmsg";
	
	/**
	 * 合作机构流水号合作机构流水号
	 */
	public static final String insttxsno = "insttxsno";
	/**
	 * 订单状态
	 */
	public static final String status = "status";
	/**
	 * 支付响应码
	 */
	public static final String resultcode = "resultcode";
	/**
	 * 支付响应信息
	 */
	public static final String resultmsg = "resultmsg";
	/**
	 * 订单金额
	 */
	public static final String amount = "amount";
	
	
	/**
	 * 查询工行订单
	 * @param instid 合作机构编号
	 * @param subinstid 机构二级商户编号
	 * @param insttxsno 合作机构流水号
	 * @param qryorderno 待查询的合作机构订单号
	 * @param txchannel 交易渠道
	 * @return 如失败则返回null 
	 * @throws ApiException
	 */
	Map<String, Object> searchICBOrder(String instid,String subinstid,String insttxsno,String qryorderno,String txchannel) throws ApiException;
	
	/**
	 * 查询工行订单
	 * @param instid 合作机构编号
	 * @param subinstid 机构二级商户编号
	 * @param insttxsno 合作机构流水号
	 * @param qryorderno 待查询的合作机构订单号
	 * @param qrycardno 待查询订单支付卡号
	 * @param txchannel 交易渠道
	 * @return 如失败则返回null 
	 * @throws ApiException
	 */
	Map<String, Object> searchICBOrder(String instid,String subinstid,String insttxsno,String qryorderno,String txchannel,String qrycardno) throws ApiException;
}
