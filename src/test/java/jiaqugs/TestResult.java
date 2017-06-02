package jiaqugs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.jiaqu.icb.pojo.order.publics.Rd;
import com.jiaqu.icb.pojo.user.User;
import com.jiaqu.icb.util.PropertiesUtil;
import com.jiaqu.icb.util.date.DateFormat;

public class TestResult {

	private Integer flg;
	
	private String mesage;
	
	private Map<String, Object> data;

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

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "TestResult [flg=" + flg + ", mesage=" + mesage + ", data=" + data + "]";
	}

	public TestResult(Integer flg, String mesage, Map<String, Object> data) {
		super();
		this.flg = flg;
		this.mesage = mesage;
		this.data = data;
	}
	
	public TestResult(Integer flg, String mesage, Object...objects) {
		super();
		this.flg = flg;
		this.mesage = mesage;
		this.data = objects.length > 0 ? new HashMap<>() : null;
		if (objects.length > 0) {
			for (int i = 0; i < objects.length; i+=2) {
				this.data.put((String) objects[i], objects[i+1]);
			}
		}
	}
	
	
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		users.add(new User());
		List<Rd> rds = new ArrayList<>();
		rds.add(new Rd());
		TestResult testResult = new TestResult(1, "2", User.class.getSimpleName(),users,Rd.class.getSimpleName(), rds);
		System.out.println( System.getProperty("configurePath"));
		
		System.out.println(Long.parseLong(DateFormat.dateFormat("yyMMddHHmmss")));
		
		String ssString = PropertiesUtil.getStringByKey("b2baccountno","icb.properties");
		System.out.println(ssString);
		System.err.println("但是你是多少".indexOf("你"));
	
		
	}
}
