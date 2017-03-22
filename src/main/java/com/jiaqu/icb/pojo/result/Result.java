package com.jiaqu.icb.pojo.result;

import java.util.Map;

public class Result{

	private Integer errorcode;
	
	private String message;
	
	private Map<String, Object> data;

	public Integer getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(Integer errorcode) {
		this.errorcode = errorcode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Result [errorcode=" + errorcode + ", message=" + message + ", data=" + data + "]";
	}

	public Result(Integer errorcode, String message, Map<String, Object> data) {
		super();
		this.errorcode = errorcode;
		this.message = message;
		this.data = data;
	}

	public Result() {
		this.errorcode = 200;
		this.message = "success";
	}
	
}
