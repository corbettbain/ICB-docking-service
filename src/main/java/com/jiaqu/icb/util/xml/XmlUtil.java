package com.jiaqu.icb.util.xml;

import com.jiaqu.icb.enums.IcbOrderSubmitForXmlEnum;
import com.jiaqu.icb.pojo.order.submit.OrderSubmission;
import com.thoughtworks.xstream.XStream;

/**
 * 转换为xml工具类
 * @author 周宁
 *
 */
public class XmlUtil {

	public static String objectToXml(Object object ,String alias) {

		XStream xStream = new XStream();
		xStream.alias(alias, object.getClass());
		return xStream.toXML(object);
	}
	
	public static Object xmlToObject(String xml,Object object) {

		XStream xStream = new XStream();
		xStream.alias(object.getClass().getName(), object.getClass());
		return  xStream.fromXML(xml);
	}
	
	public static void main(String[] args) {
		OrderSubmission orderSubmission = new OrderSubmission();
		orderSubmission = IcbOrderSubmitForXmlEnum.getOrderSubmission(orderSubmission);
		System.err.println(objectToXml(orderSubmission, "ssss"));
	}
}
