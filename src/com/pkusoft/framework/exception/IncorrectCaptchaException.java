package com.pkusoft.framework.exception;

import org.apache.shiro.authc.AuthenticationException;

/**
 * 验证码错误异常类
 * 
 * @author tanggj
 *
 */
public class IncorrectCaptchaException extends AuthenticationException {
	private static final long serialVersionUID = 6146451562810994591L;

	public IncorrectCaptchaException() {
		super();
	}

	public IncorrectCaptchaException(String message, Throwable cause) {
		super(message, cause);
	}

	public IncorrectCaptchaException(String message) {
		super(message);
	}

	public IncorrectCaptchaException(Throwable cause) {
		super(cause);
	}

}
