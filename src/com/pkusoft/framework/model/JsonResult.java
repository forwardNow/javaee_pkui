package com.pkusoft.framework.model;

public class JsonResult {
	private boolean success = false;
	private String message = "";
	private Object data;

	public JsonResult() {
	}

	public JsonResult(boolean success) {
		this.success = success;
	}

	public JsonResult(boolean success, String message) {
		this.success = success;
		this.message = message;
	}

	public JsonResult(boolean success, Object data) {
		this.success = success;
		this.data = data;
	}

	public JsonResult(boolean success, String message, Object data) {
		this.success = success;
		this.message = message;
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
