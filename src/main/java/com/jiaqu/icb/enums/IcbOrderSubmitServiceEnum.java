package com.jiaqu.icb.enums;

public enum IcbOrderSubmitServiceEnum {

	apiurl("",""),
	apiname("",""),
	appid("",""),
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
