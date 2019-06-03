package com.fairyland.mgr.entity;

public class BaseResponse {
	private String code;
	private String message;
	@Override
	public String toString() {
		return "BaseResponse [code=" + code + ", message=" + message + "]";
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
