package com.jiaqu.icb.enums;

public enum IcbKey {

	rsaprivatekey("MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAOBlCzoCn9+kduIPRtsjAB3JHmEiSUo+yOGW3Gm2VsqjT74XCP3u856R5apWoJH3rOZYpvOJ6gvF2bdDbG0laF3WNggcT97cYbaL4ub2BFpp+YE4t5fS88Ve6DQ3KBTWvcFXphO4Ywz67XEFsIlDfrgFSTRPIWUhjeKHrzFrlm33AgMBAAECgYB8ECGW3yCZO4rnDV81hTJpRWrgdV5kCDZ0Uz5lzARMYOKTzJSSIOzcvPlnpiF80pzrdhRIDfYysB7hLgvihI4gWmkrNutZL5FyvF2+8qfoaHVPxSmbWlbBZ7/4H/YphE1RIi1uGCvfat9BgODxQi62BG5kV8RSSw2fhgMVOZspQQJBAPCCO2OxoYlQo6Ozr1wHmpbMea5wmSjwcL86AixHb5cs3nkuWZ4UPdlMP1mMXRhKRbbK4fG/NSEDalNAgtvmU7ECQQDu2RtFc5uC1kZ0tSZU08OCphxr5sNm1iEZ0E6dVjpggxlUv8L+W7LsAAjSEGc2LzPmGGhzDgprc6/zo+qYrA4nAkEAppKsK1oFdSMikuiKFYU2riakSAq4KUCN9gNpKd24Dc4Hr4pIi1GdnHhQj+bFO2OFcRqG7nXtiBXjeBGAEGkvoQJBALEu+40dAusfW+ruCz54TZwY8BKXgLND/BAzOG59bhb0ihEVpGiey+9I40I6CubmQ2DZEHrxmoc1rfxWyAxz7pcCQBKUr1MKckP+/jeI3jzXUGrSJzJFdOLFtU0K0paH1hkozjDOZq+LkPEJ/6CZrXbF6rXvOovpUcWP4754EwLLI/A=")
	,rsapublickey("");
	
	
	private String key;
	
	private IcbKey(String key) {
		setKey(key);
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	
}
