package com.jiaqu.icb.pojo.order.submit;

import com.jiaqu.icb.pojo.order.publics.Rd;

/**
 * 工行订单提交基础数据
 * @author 周宁
 *
 */
public class OrderSubmission {

	private Integer transtime;//交易时间
	
	private String orderno;//订单编号
	
	private String instname;//合作机构名称
	
	private String subinstid;//机构二级商户编号
	
	private String subinstname;//机构二级商户名称
	
	private String userid;//合作机构用户编号
	
	private String username;//合作机构用户名称
	
	private String trxplat;//网络交易平台
	
	private String goodsid;//商品编号
	
	private String goodsname;//商品名称
	
	private String notifyurl;//商户通知URL
	
	private String notifytype;//通知类型
	
	private String jumpurl;//商户跳转URL
	
	private Integer orderamount;//订单金额
	
	private Integer txchannel;//交易渠道
	
	private String settlegroup;//清算组别
	
	private String enabledpmd;//支付方式
	
	private Integer installmenttimes;//v分期付款期数
	
	private Integer credittype;//支持订单支付的银行卡种类
	
	private String varnote;//返回合作机构变量
	
	private String instreference;//
	
	private String instcustomip;//客户端IP
	
	private Integer mobileno;//手机号
	
	private String b2caccountno;//B2C收款账号
	
	private String b2caccountname;//B2C收款户名
	
	private String c2caccountno;//C2C收款账号
	
	private String c2caccountname;//C2C收款户名
	
	private String b2baccountno;//B2B收款账号
	
	private String b2baccountname;//B2B收款户名
	
	private Integer jumptype;//是否显示支付成功页面
	
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

	public String getOrderno() {
		return orderno;
	}

	public void setOrderno(String orderno) {
		this.orderno = orderno;
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

	public String getTrxplat() {
		return trxplat;
	}

	public void setTrxplat(String trxplat) {
		this.trxplat = trxplat;
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

	public String getNotifyurl() {
		return notifyurl;
	}

	public void setNotifyurl(String notifyurl) {
		this.notifyurl = notifyurl;
	}

	public String getNotifytype() {
		return notifytype;
	}

	public void setNotifytype(String notifytype) {
		this.notifytype = notifytype;
	}

	public String getJumpurl() {
		return jumpurl;
	}

	public void setJumpurl(String jumpurl) {
		this.jumpurl = jumpurl;
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

	public String getEnabledpmd() {
		return enabledpmd;
	}

	public void setEnabledpmd(String enabledpmd) {
		this.enabledpmd = enabledpmd;
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

	public String getInstreference() {
		return instreference;
	}

	public void setInstreference(String instreference) {
		this.instreference = instreference;
	}

	public String getInstcustomip() {
		return instcustomip;
	}

	public void setInstcustomip(String instcustomip) {
		this.instcustomip = instcustomip;
	}

	public Integer getMobileno() {
		return mobileno;
	}

	public void setMobileno(Integer mobileno) {
		this.mobileno = mobileno;
	}

	public String getB2caccountno() {
		return b2caccountno;
	}

	public void setB2caccountno(String b2caccountno) {
		this.b2caccountno = b2caccountno;
	}

	public String getB2caccountname() {
		return b2caccountname;
	}

	public void setB2caccountname(String b2caccountname) {
		this.b2caccountname = b2caccountname;
	}

	public String getC2caccountno() {
		return c2caccountno;
	}

	public void setC2caccountno(String c2caccountno) {
		this.c2caccountno = c2caccountno;
	}

	public String getC2caccountname() {
		return c2caccountname;
	}

	public void setC2caccountname(String c2caccountname) {
		this.c2caccountname = c2caccountname;
	}

	public String getB2baccountno() {
		return b2baccountno;
	}

	public void setB2baccountno(String b2baccountno) {
		this.b2baccountno = b2baccountno;
	}

	public String getB2baccountname() {
		return b2baccountname;
	}

	public void setB2baccountname(String b2baccountname) {
		this.b2baccountname = b2baccountname;
	}

	public Integer getJumptype() {
		return jumptype;
	}

	public void setJumptype(Integer jumptype) {
		this.jumptype = jumptype;
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
		return "OrderSubmission [transtime=" + transtime + ", orderno=" + orderno + ", instname=" + instname
				+ ", subinstid=" + subinstid + ", subinstname=" + subinstname + ", userid=" + userid + ", username="
				+ username + ", trxplat=" + trxplat + ", goodsid=" + goodsid + ", goodsname=" + goodsname
				+ ", notifyurl=" + notifyurl + ", notifytype=" + notifytype + ", jumpurl=" + jumpurl + ", orderamount="
				+ orderamount + ", txchannel=" + txchannel + ", settlegroup=" + settlegroup + ", enabledpmd="
				+ enabledpmd + ", installmenttimes=" + installmenttimes + ", credittype=" + credittype + ", varnote="
				+ varnote + ", instreference=" + instreference + ", instcustomip=" + instcustomip + ", mobileno="
				+ mobileno + ", b2caccountno=" + b2caccountno + ", b2caccountname=" + b2caccountname + ", c2caccountno="
				+ c2caccountno + ", c2caccountname=" + c2caccountname + ", b2baccountno=" + b2baccountno
				+ ", b2baccountname=" + b2baccountname + ", jumptype=" + jumptype + ", note1=" + note1 + ", note2="
				+ note2 + ", note3=" + note3 + ", note4=" + note4 + ", note5=" + note5 + ", rd=" + rd + "]";
	}

	public OrderSubmission(Integer transtime, String orderno, String instname, String subinstid, String subinstname,
			String userid, String username, String trxplat, String goodsid, String goodsname, String notifyurl,
			String notifytype, String jumpurl, Integer orderamount, Integer txchannel, String settlegroup,
			String enabledpmd, Integer installmenttimes, Integer credittype, String varnote, String instreference,
			String instcustomip, Integer mobileno, String b2caccountno, String b2caccountname, String c2caccountno,
			String c2caccountname, String b2baccountno, String b2baccountname, Integer jumptype, String note1,
			String note2, String note3, String note4, String note5, Rd rd) {
		super();
		this.transtime = transtime;
		this.orderno = orderno;
		this.instname = instname;
		this.subinstid = subinstid;
		this.subinstname = subinstname;
		this.userid = userid;
		this.username = username;
		this.trxplat = trxplat;
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.notifyurl = notifyurl;
		this.notifytype = notifytype;
		this.jumpurl = jumpurl;
		this.orderamount = orderamount;
		this.txchannel = txchannel;
		this.settlegroup = settlegroup;
		this.enabledpmd = enabledpmd;
		this.installmenttimes = installmenttimes;
		this.credittype = credittype;
		this.varnote = varnote;
		this.instreference = instreference;
		this.instcustomip = instcustomip;
		this.mobileno = mobileno;
		this.b2caccountno = b2caccountno;
		this.b2caccountname = b2caccountname;
		this.c2caccountno = c2caccountno;
		this.c2caccountname = c2caccountname;
		this.b2baccountno = b2baccountno;
		this.b2baccountname = b2baccountname;
		this.jumptype = jumptype;
		this.note1 = note1;
		this.note2 = note2;
		this.note3 = note3;
		this.note4 = note4;
		this.note5 = note5;
		this.rd = rd;
	}

	public OrderSubmission() {
		// TODO Auto-generated constructor stub
	}
}
