package com.jiaqu.icb.enums;

public enum IcbOrderSubmitServiceEnum {

	apiurl("","http://114.255.225.27/api"),
	apiname("","com.icbc.gyj.ordersubmittest"),
	appid("被调用方的id","12020000000000013044"),
	;
	
	private String description;
	
	private String value;
	
	private IcbOrderSubmitServiceEnum(String description , String value) {
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
}
