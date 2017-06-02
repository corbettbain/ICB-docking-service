package com.jiaqu.icb.service.icbsubmit.impl;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.icbc.api.codec.Base64;
import com.icbc.api.core.ApiClient;
import com.icbc.api.core.ApiException;
import com.icbc.api.core.ApiRequest;
import com.jiaqu.icb.enums.IcbKey;
import com.jiaqu.icb.enums.IcbOrderSubmitEnum;
import com.jiaqu.icb.enums.IcbOrderSubmitForXmlEnum;
import com.jiaqu.icb.enums.IcbOrderSubmitServiceEnum;
import com.jiaqu.icb.pojo.order.submit.OrderSubmission;
import com.jiaqu.icb.service.icbsubmit.ICBOrderSubmitService;
import com.jiaqu.icb.util.IcbStatic;
import com.jiaqu.icb.util.xml.XmlUtil;

public class ICBOrderSubmitServiceImpl implements ICBOrderSubmitService{

	private Logger logger = LoggerFactory.getLogger(ICBOrderSubmitServiceImpl.class);
	
	@Override
	public String orderSunmit(HttpServletRequest request, HttpServletResponse response,OrderSubmission orderSubmission) throws IOException, ApiException {
		
		System.out.println(IcbStatic.apiname);
		//私钥
			String priKey = IcbKey.rsaprivatekey.getKey();
					
			String version = IcbOrderSubmitEnum.version.getValue();
			String merid = IcbOrderSubmitEnum.merid.getValue();
			String trancode = IcbOrderSubmitEnum.trancode.getValue();
			String reqdata = XmlUtil.objectToXml(IcbOrderSubmitForXmlEnum.getOrderSubmission(orderSubmission), "UPAY");
			System.out.println(reqdata);
			String charset = IcbOrderSubmitEnum.charset.getValue();
			
			logger.info("ICBOrderSubmitServiceImpl: priKey:" + priKey +"----version:" + version + "----merid："+  merid + "----trancode:" + trancode +"----reqdata：" + reqdata +"----charset："+charset);
						
			String b64Reqdata = new String(Base64.encodeBase64(reqdata.getBytes(charset)));
			
			b64Reqdata = b64Reqdata.replaceAll("\r\n", "");
			b64Reqdata = b64Reqdata.replaceAll("\n", "");
			
			System.out.println(b64Reqdata);
			
			ApiRequest req = null;
		
			req = new ApiRequest(IcbOrderSubmitServiceEnum.apiurl.getValue()
					, IcbOrderSubmitServiceEnum.apiname.getValue()
					, IcbOrderSubmitServiceEnum.appid.getValue());
			//apiurl:api地址，apiname:服务，appid：调用方编号
			
			req.setRequestField("version", version);
			req.setRequestField("merid", merid);
			req.setRequestField("trancode", trancode);
			req.setRequestField("reqdata", b64Reqdata);
			req.setRequestField("charset", charset);
			
			logger.info("ICBOrderSubmitServiceImpl : 开始获取封装好的html");
			
			ApiClient ac = new ApiClient(priKey);
			String html = null;
			html = ac.post2Site(req, response);
			
			logger.info("ICBOrderSubmitServiceImpl : html为:" + html);
			
			return html;
	}

}
