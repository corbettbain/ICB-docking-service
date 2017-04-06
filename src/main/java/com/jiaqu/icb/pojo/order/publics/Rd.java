package com.jiaqu.icb.pojo.order.publics;

/**
 * 订单提交中支付信息
 * @author 周宁
 *
 */
public class Rd {

	private String cardtype;//卡类型
	
	private Integer payamount;//应付金额
	
	private Integer ispayamt;//是否显示应付金额
	
	private String description;//描述信息
	
	private Integer isdescription;//是否显示描述信息

	public String getCardtype() {
		return cardtype;
	}

	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}

	public Integer getPayamount() {
		return payamount;
	}

	public void setPayamount(Integer payamount) {
		this.payamount = payamount;
	}

	public Integer getIspayamt() {
		return ispayamt;
	}

	public void setIspayamt(Integer ispayamt) {
		this.ispayamt = ispayamt;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getIsdescription() {
		return isdescription;
	}

	public void setIsdescription(Integer isdescription) {
		this.isdescription = isdescription;
	}

	@Override
	public String toString() {
		return "Rd [cardtype=" + cardtype + ", payamount=" + payamount + ", ispayamt=" + ispayamt + ", description="
				+ description + ", isdescription=" + isdescription + "]";
	}

	public Rd(String cardtype, Integer payamount, Integer ispayamt, String description, Integer isdescription) {
		super();
		this.cardtype = cardtype;
		this.payamount = payamount;
		this.ispayamt = ispayamt;
		this.description = description;
		this.isdescription = isdescription;
	}

	public Rd() {
		// TODO Auto-generated constructor stub
	}

}
