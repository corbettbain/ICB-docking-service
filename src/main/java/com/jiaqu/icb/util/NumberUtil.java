package com.jiaqu.icb.util;

import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class NumberUtil {

	/**
	 * 随机生成六位数验证码
	 * 
	 * @return
	 */
	public static int getRandomNum() {
		Random r = new Random();
		return r.nextInt(900000) + 100000;// (Math.random()*(999999-100000)+100000)
	}

	/**
	 * 随机生成4位数验证码 ADD BY LXJ IN 2016/6/29
	 * 
	 * @return
	 */
	public static int getRandomNum3() {
		Random r = new Random();
		return r.nextInt(900) + 100;// (Math.random()*(999999-100000)+100000)
	}

	public static int getZRandomNum4() {

		return (int) (Math.random() * (9999 - 1000 + 1)) + 1000;// (Math.random()*(999999-100000)+100000)
	}

	public static String getRandNum20() {
		SimpleDateFormat sdfTime = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		return sdfTime.format(new Date()) + String.valueOf(getRandomNum3());
	}

	public static String getRandNum15() {
		SimpleDateFormat sdfTime = new SimpleDateFormat("yyMMddHHmmss");
		return randString(sdfTime.format(new Date()) + String.valueOf(getRandomNum3()));
	}

	public static String randString(String str) {
		StringBuffer result = new StringBuffer();
		int length = str.length();
		char[] chars = str.toCharArray();
		// 数组下标
		int index = -1;
		while (true) {
			// 随机 生成 下标
			index = new Random().nextInt(length);
			// 是否为空
			if (chars[index] != ' ') {
				result.append(chars[index]);
				// 全部获取完毕
				if (result.length() == length) {
					break;
				}
				// 置空
				chars[index] = ' ';
			} else
				continue;
		}

		return result.toString();
	}

	// 获取流水号
	public static String getRandNum16() {
		SimpleDateFormat sdfTime = new SimpleDateFormat("yyyMMddHHmmss");
		return sdfTime.format(new Date()) + String.valueOf(getRandomNum3());
	}
	/* SimpleDateFormat sdfTime = new SimpleDateFormat("yyMMddHHmmss"); */

	/*
	 * 返回16位培训机构编号
	 */
	public static String getInsCode() {
		return "I" + getRandNum15();
	}

	/*
	 * 返回16位教练员编号
	 */
	public static String getCoachCode() {
		return "C" + getRandNum15();
	}

	/*
	 * 返回16位教练车编号
	 */
	public static String getCarCode() {
		return "T" + getRandNum15();
	}

	/*
	 * 返回16位学员编号
	 */
	public static String getStudentCode() {
		return "S" + getRandNum15();
	}

	/*
	 * 返回16位计时终端编号
	 */
	public static String getMobileCode() {
		return "M" + getRandNum15();
	}

	/*
	 * 返回16位考核员编号
	 */
	public static String getExamCode() {
		return "E" + getRandNum15();
	}

	/*
	 * 返回16位安全员编号
	 */
	public static String getSecuCode() {
		return "S" + getRandNum15();
	}

	/*
	 * 返回16位教练头像编号
	 */
	public static String getCoachImgCode() {
		return "C" + getRandNum15();
	}

	/*
	 * 返回16位
	 */
	public static String getlateplancode() {
		return "L" + getRandNum15();
	}

	/*
	 * 返回16位学员头像编号
	 */
	public static String getStudentImgCode() {
		return "S" + getRandNum15();
	}

	/*
	 * 返回16位模拟课程编号
	 */
	public static String getSimunumCode() {
		return "m" + getRandNum15();
	}

	public static String md5(String str) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(str.getBytes());
			byte b[] = md.digest();

			int i;

			StringBuffer buf = new StringBuffer("");
			for (int offset = 0; offset < b.length; offset++) {
				i = b[offset];
				if (i < 0)
					i += 256;
				if (i < 16)
					buf.append("0");
				buf.append(Integer.toHexString(i));
			}
			str = buf.toString();
		} catch (Exception e) {
			e.printStackTrace();

		}
		return str;
	}

	/*
	 * 返回token
	 */
	public static String getToken() {
		return md5(getRandNum15());
	}

	/*
	 * 根据课程编码取科目
	 */
	public static String getPartbysubjcode(String subjcode) {

		return subjcode.substring(3, 4);

	}

	/*
	 * 根据课程编码取科目编码
	 */
	public static String getsubjcode(String subjcode) {

		return subjcode.substring(subjcode.length() - 6, subjcode.length() - 4);

	}

	/*
	 * 根据课程编码科目编码
	 */
	public static String Editsubjcode(String subjcode, String code) {

		return subjcode.substring(0, subjcode.length() - 6) + code + "0000";

	}

	/*
	 * 获取科目编号
	 */
	public static String getSubjcode(int subject, String traintype) {
		String code = "";
		if (traintype == null || traintype.length() < 1) {
			code = "0";
			return code;
		}

		// 课程方式码定义 1-实操，2-课堂教学，3-模拟器教学，4-远程教学；
		if (subject == 21 || subject == 31)
			code = "1";
		else if (subject == 22 || subject == 32)
			code = "3";
		else if (subject == 1 || subject == 4)
			code = "2";
		else if (subject == 12)
			code = "4";
		else
			code = "0";

		// 培训车型码定义 00-无，01- A1，02-A2，03-A3，11-B1，12-B2，21-C1，22-C2，23-C3，
		// 24-C4，25-C5，31-D，32-E，33-F，41-M，42-N，43-P；
		switch (traintype) {
		case "A1":
			code += "01";
			break;
		case "A2":
			code += "02";
			break;
		case "A3":
			code += "03";
			break;
		case "B1":
			code += "11";
			break;
		case "B2":
			code += "12";
			break;
		case "C1":
			code += "21";
			break;
		case "C2":
			code += "22";
			break;
		case "C3":
			code += "23";
			break;
		case "C4":
			code += "24";
			break;
		case "C5":
			code += "25";
			break;
		case "D":
			code += "31";
			break;
		case "E":
			code += "32";
			break;
		case "F":
			code += "33";
			break;
		case "M":
			code += "41";
			break;
		case "N":
			code += "42";
			break;
		case "P":
			code += "43";
			break;
		default:
			code += "00";
			break;
		}

		// 培训部分码定义：1-第一部分，2-第二部分，3-第三部分，4-第四部分；
		if (subject == 21 || subject == 22)
			code += "2";
		else if (subject == 31 || subject == 32)
			code += "3";
		else if (subject == 1)
			code += "1";
		else if (subject == 4)
			code += "4";
		else if (subject == 2)
			code += "2";
		else if (subject == 3)
			code += "3";
		else
			code += "0";

		// 培训项目码定义：01-法律、法规及道路交通信号，02-机动车基本知识，03-第一部分综合 复习及考核，11-基础驾驶，12-场地驾驶，
		// 13-第二部分综合驾驶及考核，21-跟车行驶，
		// 22-变更车道，23-靠边停车，24-掉头，25-通过路口，26-通过人行横道，27-通过学校区域，
		// 28-通过公共汽车站，29-会车，30-超车，31-夜间驾驶，32-恶劣条件下的驾驶，33-
		// 山区道路驾驶，34-高速公路驾驶，35-行驶路线选择，
		// 36-第三部分综合驾驶及考核，41- 安全、文明驾驶知识，42-危险源辨识知识，43-夜间和高速公路安全驾驶知识，44-恶劣气
		// 象和复杂道路条件下的安全驾驶知识，
		// 45-紧急情况应急处置知识，46-危险化学品知识， 47-典型事故案例分析，48-第四部分综合复习及考核
		switch (subject) {
		case 1:
			code += "01";
			break;
		case 21:
			code += "23";
			break;
		case 22:
			code += "11";
			break;
		case 31:
			code += "25";
			break;
		case 32:
			code += "11";
			break;
		case 4:
			code += "41";
			break;
		case 2:
			code += "11";
			break;
		case 3:
			code += "11";
			break;
		default:
			code += "00";
			break;
		}

		code += "0000";
		return code;
	}

}
