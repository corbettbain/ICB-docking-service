package com.jiaqu.icb.util;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public final class ResourceLoader {  
	  
    private static ResourceLoader loader = new ResourceLoader();  
    private static Map<String, Properties> loaderMap = new HashMap<String, Properties>();  
  
    private ResourceLoader() {  
    }  
  
    public static ResourceLoader getInstance() {  
        return loader;  
    }  
    
    
    public Properties getPropFromProperties(String fileName) throws Exception {  
          
        Properties prop = loaderMap.get(fileName);  
        if (prop != null) {  
            return prop;  
        }  
        InputStream in = this.getClass().getClassLoader().getResourceAsStream(fileName);
        InputStreamReader inputStreamReader = new InputStreamReader(in, "UTF-8");
        prop = new Properties();  
        prop.load(inputStreamReader);  
  
        loaderMap.put(fileName, prop);  
        return prop;  
    }  
}  