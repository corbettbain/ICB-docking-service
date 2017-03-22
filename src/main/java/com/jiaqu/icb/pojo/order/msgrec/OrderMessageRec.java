package com.jiaqu.icb.pojo.order.msgrec;

import com.jiaqu.icb.pojo.order.publics.Rd;

/**
 * 订单通知实体
 * @author 周宁  2017年3月17日 下午4:05:05
 *
 */
public class OrderMessageRec {

private Integer transtime;//交易时间
	
	private Integer orderno;//订单编号
	
	private String instid;
	
	private String instname;//合作机构名称
	
	private String subinstid;//机构二级商户编号
	
	private String subinstname;//机构二级商户名称
	
	private String userid;//合作机构用户编号
	
	private String username;//合作机构用户名称
	
	private String goodsid;//商品编号
	
	private String goodsname;//商品名称
	
	private Integer orderamount;//订单金额
	
	private Integer txchannel;//交易渠道
	
	private String settlegroup;//清算组别
	
	private Integer installmenttimes;//v分期付款期数
	
	private Integer credittype;//支持订单支付的银行卡种类
	
	private String varnote;//返回合作机构变量
	
	private Integer paymethod;//支付方式
	
	private Integer subpaymethod;//子支付方式
	
	private Integer payamount;//支付金额
	
	private String paytime;//支付时间
	
	private String transerialno;//交易流水号
	
	private Integer orderstatus;//订单状态
	
	private Integer mobileno;//手机号
	
	private String internaluserno;//内部用户号
	
	private String cardno;//付款卡号
	
	private String note1;//备注1
	
	private String note2;
	
	private String note3;
	
	private String note4;
	
	private String note5;
	
	private Rd rd;//支付信息

	public Integer getTranstime() {
		return transtime;
	}

	public void setTranstime(Integer transtime) {
		this.transtime = transtime;
	}

	public Integer getOrderno() {
		return orderno;
	}

	public void setOrderno(Integer orderno) {
		this.orderno = orderno;
	}

	public String getInstid() {
		return instid;
	}

	public void setInstid(String instid) {
		this.instid = instid;
	}

	public String getInstname() {
		return instname;
	}

	public void setInstname(String instname) {
		this.instname = instname;
	}

	public String getSubinstid() {
		return subinstid;
	}

	public void setSubinstid(String subinstid) {
		this.subinstid = subinstid;
	}

	public String getSubinstname() {
		return subinstname;
	}

	public void setSubinstname(String subinstname) {
		this.subinstname = subinstname;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getGoodsid() {
		return goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	public String getGoodsname() {
		return goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	public Integer getOrderamount() {
		return orderamount;
	}

	public void setOrderamount(Integer orderamount) {
		this.orderamount = orderamount;
	}

	public Integer getTxchannel() {
		return txchannel;
	}

	public void setTxchannel(Integer txchannel) {
		this.txchannel = txchannel;
	}

	public String getSettlegroup() {
		return settlegroup;
	}

	public void setSettlegroup(String settlegroup) {
		this.settlegroup = settlegroup;
	}

	public Integer getInstallmenttimes() {
		return installmenttimes;
	}

	public void setInstallmenttimes(Integer installmenttimes) {
		this.installmenttimes = installmenttimes;
	}

	public Integer getCredittype() {
		return credittype;
	}

	public void setCredittype(Integer credittype) {
		this.credittype = credittype;
	}

	public String getVarnote() {
		return varnote;
	}

	public void setVarnote(String varnote) {
		this.varnote = varnote;
	}

	public Integer getPaymethod() {
		return paymethod;
	}

	public void setPaymethod(Integer paymethod) {
		this.paymethod = paymethod;
	}

	public Integer getSubpaymethod() {
		return subpaymethod;
	}

	public void setSubpaymethod(Integer subpaymethod) {
		this.subpaymethod = subpaymethod;
	}

	public Integer getPayamount() {
		return payamount;
	}

	public void setPayamount(Integer payamount) {
		this.payamount = payamount;
	}

	public String getPaytime() {
		return paytime;
	}

	public void setPaytime(String paytime) {
		this.paytime = paytime;
	}

	public String getTranserialno() {
		return transerialno;
	}

	public void setTranserialno(String transerialno) {
		this.transerialno = transerialno;
	}

	public Integer getOrderstatus() {
		return orderstatus;
	}

	public void setOrderstatus(Integer orderstatus) {
		this.orderstatus = orderstatus;
	}

	public Integer getMobileno() {
		return mobileno;
	}

	public void setMobileno(Integer mobileno) {
		this.mobileno = mobileno;
	}

	public String getInternaluserno() {
		return internaluserno;
	}

	public void setInternaluserno(String internaluserno) {
		this.internaluserno = internaluserno;
	}

	public String getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno = cardno;
	}

	public String getNote1() {
		return note1;
	}

	public void setNote1(String note1) {
		this.note1 = note1;
	}

	public String getNote2() {
		return note2;
	}

	public void setNote2(String note2) {
		this.note2 = note2;
	}

	public String getNote3() {
		return note3;
	}

	public void setNote3(String note3) {
		this.note3 = note3;
	}

	public String getNote4() {
		return note4;
	}

	public void setNote4(String note4) {
		this.note4 = note4;
	}

	public String getNote5() {
		return note5;
	}

	public void setNote5(String note5) {
		this.note5 = note5;
	}

	public Rd getRd() {
		return rd;
	}

	public void setRd(Rd rd) {
		this.rd = rd;
	}

	@Override
	public String toString() {
		return "OrderMessageRec [transtime=" + transtime + ", orderno=" + orderno + ", instid=" + instid + ", instname="
				+ instname + ", subinstid=" + subinstid + ", subinstname=" + subinstname + ", userid=" + userid
				+ ", username=" + username + ", goodsid=" + goodsid + ", goodsname=" + goodsname + ", orderamount="
				+ orderamount + ", txchannel=" + txchannel + ", settlegroup=" + settlegroup + ", installmenttimes="
				+ installmenttimes + ", credittype=" + credittype + ", varnote=" + varnote + ", paymethod=" + paymethod
				+ ", subpaymethod=" + subpaymethod + ", payamount=" + payamount + ", paytime=" + paytime
				+ ", transerialno=" + transerialno + ", orderstatus=" + orderstatus + ", mobileno=" + mobileno
				+ ", internaluserno=" + internaluserno + ", cardno=" + cardno + ", note1=" + note1 + ", note2=" + note2
				+ ", note3=" + note3 + ", note4=" + note4 + ", note5=" + note5 + ", rd=" + rd + "]";
	}

	public OrderMessageRec(Integer transtime, Integer orderno, String instid, String instname, String subinstid,
			String subinstname, String userid, String username, String goodsid, String goodsname, Integer orderamount,
			Integer txchannel, String settlegroup, Integer installmenttimes, Integer credittype, String varnote,
			Integer paymethod, Integer subpaymethod, Integer payamount, String paytime, String transerialno,
			Integer orderstatus, Integer mobileno, String internaluserno, String cardno, String note1, String note2,
			String note3, String note4, String note5, Rd rd) {
		super();
		this.transtime = transtime;
		this.orderno = orderno;
		this.instid = instid;
		this.instname = instname;
		this.subinstid = subinstid;
		this.subinstname = subinstname;
		this.userid = userid;
		this.username = username;
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.orderamount = orderamount;
		this.txchannel = txchannel;
		this.settlegroup = settlegroup;
		this.installmenttimes = installmenttimes;
		this.credittype = credittype;
		this.varnote = varnote;
		this.paymethod = paymethod;
		this.subpaymethod = subpaymethod;
		this.payamount = payamount;
		this.paytime = paytime;
		this.transerialno = transerialno;
		this.orderstatus = orderstatus;
		this.mobileno = mobileno;
		this.internaluserno = internaluserno;
		this.cardno = cardno;
		this.note1 = note1;
		this.note2 = note2;
		this.note3 = note3;
		this.note4 = note4;
		this.note5 = note5;
		this.rd = rd;
	}
	
	public OrderMessageRec() {
		// TODO Auto-generated constructor stub
	}
	
}
