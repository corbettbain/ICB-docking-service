package com.jiaqu.icb.util.ecode;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class EcodeUtil {

	/**
	 * base64解码
	 * @param data
	 * @param charset
	 * @return
	 */
	public static String base64Decode(String data,String charset){
		BASE64Decoder b64dec = new BASE64Decoder();
		try {
			return new String(b64dec.decodeBuffer(data),charset);
		} catch (Exception e) {
			//logger.error(e.getMessage(), e);
			return null;
		}
	}
	
	/**
	 * base64编码
	 * @param data
	 * @param charset
	 * @return
	 */
	public static String base64Encode(String data,String charset){
		BASE64Encoder b64enc = new BASE64Encoder();
	    try {
			return b64enc.encode(data.getBytes(charset));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//logger.error(e.getMessage(), e);
			return null;
		}
	}
}
