package com.devsuperior.dscommerce.services.exceptions;

@SuppressWarnings("serial")
public class MethodArgumentNotValidException extends RuntimeException {

	public MethodArgumentNotValidException(String msg) {
		super(msg);
	}
}
