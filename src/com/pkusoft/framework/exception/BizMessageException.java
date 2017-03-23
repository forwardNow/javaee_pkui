package com.pkusoft.framework.exception;

/**
 * 业务异常，消息提示
 * @author tanggj
 * 
 */
public class BizMessageException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public BizMessageException(String message) {
		super(message);
	}

	public BizMessageException(Throwable cause) {
		super(cause);
	}

	public BizMessageException(String message, Throwable cause) {
		super(message, cause);
	}
}
