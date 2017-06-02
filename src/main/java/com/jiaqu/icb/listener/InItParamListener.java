package com.jiaqu.icb.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.jiaqu.icb.util.PropertiesUtil;

public class InItParamListener implements ServletContextListener{

	private static final String icbPath = "icbPath";
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		String path = arg0.getServletContext().getInitParameter(icbPath);
		if (path.indexOf(":") > 0) {
			path = path.substring(path.indexOf(":")+1, path.length());
		}
		
		PropertiesUtil.filePath = path;
	}

}
