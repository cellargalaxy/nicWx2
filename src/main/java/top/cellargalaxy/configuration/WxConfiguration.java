package top.cellargalaxy.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by cellargalaxy on 17-12-31.
 */
@Component
public class WxConfiguration {
	@Value("${wx.able:false}")
	private boolean able;
	@Value("${wx.test:true}")
	private boolean test;
	@Value("${wx.test.openId}")
	private String testOpenId;
	@Value("${wx.timeout:5000}")
	private int timeout;
	@Value("${wx.token:token}")
	private String token;
	@Value("${wx.appID}")
	private String appID;
	@Value("${wx.appSecret}")
	private String appSecret;
	@Value("${wx.templateId}")
	private String templateId;
	@Value("${wx.netviewUrl}")
	private String netviewUrl;
	
	public boolean isTest() {
		return test;
	}
	
	public void setTest(boolean test) {
		this.test = test;
	}
	
	public String getTestOpenId() {
		return testOpenId;
	}
	
	public void setTestOpenId(String testOpenId) {
		this.testOpenId = testOpenId;
	}
	
	public int getTimeout() {
		return timeout;
	}
	
	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}
	
	public boolean isAble() {
		return able;
	}
	
	public void setAble(boolean able) {
		this.able = able;
	}
	
	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	public String getAppID() {
		return appID;
	}
	
	public void setAppID(String appID) {
		this.appID = appID;
	}
	
	public String getAppSecret() {
		return appSecret;
	}
	
	public void setAppSecret(String appSecret) {
		this.appSecret = appSecret;
	}
	
	public String getTemplateId() {
		return templateId;
	}
	
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	
	public String getNetviewUrl() {
		return netviewUrl;
	}
	
	public void setNetviewUrl(String netviewUrl) {
		this.netviewUrl = netviewUrl;
	}
}
