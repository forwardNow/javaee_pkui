package com.pkusoft.framework.exception;

/**
 * 框架内核异常，框架内部使用
 * @author tanggj
 *
 */
public class KernelException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public KernelException() {
		super();
	}

	public KernelException(String message, Throwable cause) {
		super(message, cause);
	}

	public KernelException(String message) {
		super(message);
	}

	public KernelException(Throwable cause) {
		super(cause);
	}
}
