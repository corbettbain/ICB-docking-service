package com.jiaqu.icb.pojo.result;

import java.util.Map;

public class Result{

	private Integer flag;
	
	private String message;
	
	private Object data;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "Result [flag=" + flag + ", message=" + message + ", data=" + data + "]";
	}

	public Result(Integer flag, String message, Object data) {
		super();
		this.flag = flag;
		this.message = message;
		this.data = data;
	}

	public Result(Object data) {
		this.flag = 1;
		this.message = "success";
		this.data = data;
	}
	
}
