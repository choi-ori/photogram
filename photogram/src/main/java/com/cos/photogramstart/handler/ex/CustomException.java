package com.cos.photogramstart.handler.ex;

public class CustomException extends RuntimeException{

	// 객체를 구분 할 때!!
	private static final long serialVersionUID = 1L;

	public CustomException(String message) {
		super(message);
	}
}
