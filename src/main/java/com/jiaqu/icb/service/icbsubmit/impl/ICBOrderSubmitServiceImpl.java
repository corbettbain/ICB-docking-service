package com.jiaqu.icb.service.icbsubmit.impl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;

import com.icbc.api.core.ApiClient;
import com.icbc.api.core.ApiRequest;
import com.jiaqu.icb.enums.IcbKey;
import com.jiaqu.icb.enums.IcbOrderSubmitEnum;
import com.jiaqu.icb.enums.IcbOrderSubmitForXmlEnum;
import com.jiaqu.icb.enums.IcbOrderSubmitServiceEnum;
import com.jiaqu.icb.pojo.order.submit.OrderSubmission;
import com.jiaqu.icb.service.icbsubmit.ICBOrderSubmitService;
import com.jiaqu.icb.util.ecode.EcodeUtil;
import com.jiaqu.icb.util.xml.XmlUtil;

@Service
public class ICBOrderSubmitServiceImpl implements ICBOrderSubmitService{

	@Override
	public void orderSunmit(HttpServletRequest request, HttpServletResponse response,OrderSubmission orderSubmission) {
		
		//私钥
			String priKey = IcbKey.rsaprivatekey.getKey();
					
			String version = IcbOrderSubmitEnum.version.getValue();
			String merid = IcbOrderSubmitEnum.merid.getValue();
			String trancode = IcbOrderSubmitEnum.trancode.getValue();
			String reqdata = XmlUtil.objectToXml(IcbOrderSubmitForXmlEnum.getOrderSubmission(orderSubmission), "UPAY");
			String charset = IcbOrderSubmitEnum.charset.getValue();
			
			String b64Reqdata=EcodeUtil.base64Encode(reqdata, charset);
			b64Reqdata = b64Reqdata.replaceAll("\r\n", "");
			b64Reqdata = b64Reqdata.replaceAll("\n", "");
			
			ApiRequest req = null;
		
			req = new ApiRequest(IcbOrderSubmitServiceEnum.apiurl.getValue()
									, IcbOrderSubmitServiceEnum.apiname.getValue()
										, IcbOrderSubmitServiceEnum.appid.getValue());//apiurl:api地址，apiname:服务，appid：调用方编号
			req.setRequestField("version", version);
			req.setRequestField("merid", merid);
			req.setRequestField("trancode", trancode);
			req.setRequestField("reqdata", b64Reqdata);
			req.setRequestField("charset", charset);
			
			ApiClient ac = new ApiClient(priKey);
			try{
				ac.post2Site(req, response);
			}catch(Exception e){
				//异常处理
				//logger.error(e.getMessage(),e);
			}
	}

}
