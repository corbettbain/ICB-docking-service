package com.jiaqu.icb.enums;

import com.jiaqu.icb.util.IcbStatic;

/**
 * 订单提交所需部分指定不变更参数
 * @author 周宁
 *
 */
public enum IcbOrderSubmitEnum {

	version("接口版本",IcbStatic.version),//"1.0.0.0"
	merid("合作机构编号",IcbStatic.merid),//"12020000000000013044"
	trancode("交易编码",IcbStatic.trancode),//"ordersubmit"
	charset("编码字符集，base64编码中使用的字符",IcbStatic.charset),
	;
	
	private String description;
	
	private String value;
	
	private IcbOrderSubmitEnum(String description , String value) {
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
