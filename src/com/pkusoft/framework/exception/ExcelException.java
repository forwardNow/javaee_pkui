package com.pkusoft.framework.exception;

public class ExcelException extends Exception {

	private static final long serialVersionUID = 1L;

	public ExcelException() {
		super();
	}

	public ExcelException( String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace ) {
		super( message, cause, enableSuppression, writableStackTrace );
	}

	public ExcelException( String message, Throwable cause ) {
		super( message, cause );
	}

	public ExcelException( String message ) {
		super( message );
	}

	public ExcelException( Throwable cause ) {
		super( cause );
	}

}
