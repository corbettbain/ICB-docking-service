package com.jiaqu.icb.enums;

import com.jiaqu.icb.util.IcbStatic;

public enum IcbKey {

	rsaprivatekey(IcbStatic.rsaprivatekey)
	,rsapublickey("");
	
	
	private String key;
	
	private IcbKey(String key) {
		setKey(key);
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	
}
