package com.bugtracking.project.exceptions;

public class StatusNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StatusNotFoundException(String msg) {
		super(msg);
	}

}
