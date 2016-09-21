package com.capgemini.exception;

public class InsufficientInitialBalanceException extends Exception {

	String message = null;
	public InsufficientInitialBalanceException() {
	}

	public InsufficientInitialBalanceException(String msg) {
		 this.message =  msg;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
