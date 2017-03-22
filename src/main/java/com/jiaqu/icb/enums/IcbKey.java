package com.jiaqu.icb.enums;

public enum IcbKey {

	rsaprivatekey("MIICXAIBAAKBgQDWDc2OGi2KC1zt3c0ieZ2dAIeVmTGjhuK09sVv1pS8oQ+vzuMlhpLLrUv2XTJYUkK1aEpsVE4RHW6ukoV+ncJd3aTFdv6e30ZImHpBv8YOtlQaZOWMx6Y8hlOpqyYAKir8HCXr6JD/KIHnJWZiiTdj7jMYPwJ5ZBOfxUzd8CzmbwIDAQABAoGAEuk5RdquN0n1tdYor2kLMbnAQMk+B3J9SPucSdstXNTl6+RdUQ1onrH6yhNFxWPPHPPPz25LT1vIUYgEX0FU0Iiw5b6O4ABUIUoO0dgF9pwpzQ5kiMuty/y1yKcBupCqq2g+CNicDV8te5OgUyVW7AHjEEwh5kPQtJ7A6kfGS9ECQQD7848iR7H7lFKi8VMjlIOZ856/aa80nMUXkBaHvVjPe5Yh7nyo/Zyz5Q6WZFLQKjaH6zrbQGGwMGnV2jHWHfdbAkEA2X5YwOxmVjQ7iz095J/2Xmon/BLCmCO+mFXdB4l6xNU+DlCABXBHhNiAb1rl0pqxCJZ4LL8+zPVRucrgxkqNfQJAMxuO11dPxUarFJ57TOZdY6dFdnKLtdJvMH5r85D3KO9a3vsvkmAPn3ZBZURogA1wDlYrFDqVFlZbwaOHJHXjrQJAB5b4I+tb+uAhv88oTMUkRNExigNhlQuSSCCe8PdkOGA0pS07+nSbmlAv0zL52CqbyO/vS6h02ZQqAPDKfUD2xQJBAJ4j82VoRGaefJnOe6HxAjY1aVEOUcJ7Sa+cUxdPlWxc+xqGbqYFKBJyxM+2uArtDqIwf8cKhZpxDxWKsVTfpnA=")
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
