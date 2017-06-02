package com.jiaqu.icb.enums;

import com.jiaqu.icb.pojo.order.publics.Rd;
import com.jiaqu.icb.pojo.order.submit.OrderSubmission;
import com.jiaqu.icb.util.IcbStatic;

/**
 * 订单提交数据字典
 * @author 周宁
 *
 */
public enum IcbOrderSubmitForXmlEnum {

	instname("合作机构名称",IcbStatic.instname),
	subinstid("机构二级商户编号",IcbStatic.subinstid),
	subinstname("机构二级商户名称",IcbStatic.subinstname),
	userid("合作机构用户编号",IcbStatic.userid),
	username("合作机构用户名称",IcbStatic.username),
	trxplat("网络交易平台",IcbStatic.trxplat),
	notifyurl("商户通知URL",IcbStatic.notifyurl),
	notifytype("通知类型",IcbStatic.notifytype),
	jumpurl("商户跳转URL",IcbStatic.jumpurl),
	txchannel("交易渠道",IcbStatic.txchannel),
	settlegroup("清算组别",IcbStatic.settlegroup),
	enabledpmd("支付方式",IcbStatic.enabledpmd),
	installmenttimes("分期付款期数",IcbStatic.installmenttimes),
	credittype("支持订单支付的银行卡种类",IcbStatic.credittype),
	varnote("返回合作机构变量",IcbStatic.varnote),
	instreference("如果上送，工行会在客户支付订单时，校验商户上送域名与客户跳转工行支付页面之前网站域名的一致性。",IcbStatic.instreference),
	b2caccountno("B2C收款账号",IcbStatic.b2caccountno),
	b2caccountname("B2C收款户名",IcbStatic.b2caccountname),
	c2caccountno("C2C收款账号",IcbStatic.c2caccountno),
	c2caccountname("C2C收款户名",IcbStatic.c2caccountname),
	b2baccountno("B2B收款账号",IcbStatic.b2baccountno),
	b2baccountname("B2B收款户名",IcbStatic.b2baccountname),
	jumptype("是否显示支付成功页面",IcbStatic.jumptype),
	cardtype("卡类型",IcbStatic.cardtype),
	ispayamt("是否显示应付金额",IcbStatic.ispayamt),
	isdescription("是否显示描述信息",IcbStatic.isdescription),	
	;
	
	private String description;
	
	private String value;
	
	private IcbOrderSubmitForXmlEnum(String description , String value) {
		setDescription(description);
		setValue(value);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
	
	public static OrderSubmission getOrderSubmission(OrderSubmission orderSubmission){		
		
		orderSubmission.setInstname(instname.getValue());
		orderSubmission.setSubinstid(subinstid.getValue());
		orderSubmission.setSubinstname(subinstname.getValue());
		orderSubmission.setUserid(userid.getValue());
		orderSubmission.setUsername(username.getValue());
		orderSubmission.setTrxplat(trxplat.getValue());
		orderSubmission.setNotifyurl(notifyurl.getValue());
		orderSubmission.setNotifytype(notifytype.getValue());
		orderSubmission.setJumpurl(jumpurl.getValue());
		orderSubmission.setTxchannel(Integer.valueOf(txchannel.getValue()));
		orderSubmission.setSettlegroup(settlegroup.getValue());
		orderSubmission.setEnabledpmd(enabledpmd.getValue());
		orderSubmission.setInstallmenttimes(Integer.valueOf(installmenttimes.getValue()));
		orderSubmission.setCredittype(Integer.valueOf(credittype.getValue()));
		orderSubmission.setVarnote(varnote.getValue());
		orderSubmission.setInstreference(instreference.getValue());
		orderSubmission.setB2caccountno(b2caccountno.getValue());
		orderSubmission.setB2caccountname(b2caccountname.getValue());
		orderSubmission.setC2caccountno(c2caccountno.getValue());
		orderSubmission.setC2caccountname(c2caccountname.getValue());
		orderSubmission.setB2baccountno(b2baccountno.getValue());
		orderSubmission.setB2baccountname(b2baccountname.getValue());
		orderSubmission.setJumptype(Integer.valueOf(jumptype.getValue()));
		
		Rd rd = orderSubmission.getRd();
		rd.setCardtype(cardtype.getValue());
		rd.setIspayamt(Integer.valueOf(ispayamt.getValue()));
		rd.setIsdescription(Integer.valueOf(isdescription.getValue()));
		orderSubmission.setRd(rd);
		
		return orderSubmission;
	}
	
}
