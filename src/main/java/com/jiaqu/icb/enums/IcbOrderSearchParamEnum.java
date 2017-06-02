package com.jiaqu.icb.enums;

import com.jiaqu.icb.util.IcbStatic;

/**
 * 订单搜索时所需参数
 * @author 周宁
 *
 */
public enum IcbOrderSearchParamEnum {

	/**
	 * 提交支付请求的合作机构编号
	 */
	instid(IcbStatic.instid)
	/**
	 * 提交支付请求的二级商户编号，如无则送空
	 */
		,subinstid(IcbStatic.subinstid)
		/**
		 * 合作机构流水号,必输，本交易的唯一标识
		 */
			,insttxsno("")
			/**
			 * 待查询的合作机构订单号,必输
			 */
				,qryorderno("")
				/**
				 * 待查询订单支付卡号	,银行卡号，选输
				 */
					,qrycardno("")
					/**
					 * 交易渠道,固定送24
					 */
						,txchannel(IcbStatic.txchannel);
	
	private String value;
	
	private IcbOrderSearchParamEnum(String value) {
		setValue(value);
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}
