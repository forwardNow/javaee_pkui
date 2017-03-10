package com.pkusoft.framework.exception;

/**
 * 业务异常类
 * @author tanggj
 *
 */
public class BizException extends RuntimeException{
    static final long serialVersionUID = 1L;
    
    private int errorCode;

    public int getErrorCode(){
    	return this.errorCode;
    }
    
    public BizException(int errorCode) {
    	this(errorCode,"错误号:" + errorCode);
    }

    public BizException(int errorCode,String message) {
    	super(message);
    	this.errorCode = errorCode;
    }
    
    public BizException(int errorCode,String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }
    
    public BizException(int errorCode,Throwable cause) {
        super(cause);
        this.errorCode = errorCode;
    }
}
