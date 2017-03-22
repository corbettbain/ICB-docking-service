package com.jiaqu.icb.pojo.result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.jiaqu.icb.pojo.order.publics.Rd;
import com.jiaqu.icb.pojo.user.User;

public class TestResult {

	private Integer flg;
	
	private String mesage;
	
	private JSONObject data;

	public Integer getFlg() {
		return flg;
	}

	public void setFlg(Integer flg) {
		this.flg = flg;
	}

	public String getMesage() {
		return mesage;
	}

	public void setMesage(String mesage) {
		this.mesage = mesage;
	}

	
	

	public TestResult(Integer flg, String mesage, JSONObject data) {
		super();
		this.flg = flg;
		this.mesage = mesage;
		this.data = data;
	}

	public JSONObject getData() {
		return data;
	}

	public void setData(JSONObject data) {
		this.data = data;
	}

	public TestResult(Integer flg, String mesage, Object...objects) {
		super();
		this.flg = flg;
		this.mesage = mesage;
		this.data = objects.length > 0 ? new JSONObject() : null;
		if (objects.length > 0) {
			for (int i = 0; i < objects.length; i+=2) {
				this.data.put((String) objects[i], objects[i+1]);
			}
		}
	}
	
	
	
	@Override
	public String toString() {
		return "TestResult [flg=" + flg + ", mesage=" + mesage + ", data=" + data + "]";
	}

	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User());
		List<Rd> rds = new ArrayList<>();
		rds.add(new Rd());
		
		System.out.println();
	}
}
