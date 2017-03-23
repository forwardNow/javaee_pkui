package com.pkusoft.framework.security;

import org.apache.shiro.authc.UsernamePasswordToken;

public class CaptchaUsernamePasswordToken extends UsernamePasswordToken {

	private static final long serialVersionUID = 1L;

	private String captcha;
	private String mac;

	public String getCaptcha() {

		return captcha;

	}

	public void setCaptcha(String captcha) {

		this.captcha = captcha;

	}

	public CaptchaUsernamePasswordToken() {

		super();

	}

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public CaptchaUsernamePasswordToken(String username, char[] password, boolean rememberMe, String host, String captcha, String mac) {
        super(username, password, rememberMe, host);
        this.captcha = captcha;
        this.mac = mac;
    }

}
