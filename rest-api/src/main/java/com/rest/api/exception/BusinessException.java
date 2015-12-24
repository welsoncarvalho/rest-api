package com.rest.api.exception;

public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 903047545388084758L;
	
	private String code;
	
	public BusinessException(String code, String message) {
		super(message);
	}
	
	public String getCode() {
		return code;
	}
	
}
