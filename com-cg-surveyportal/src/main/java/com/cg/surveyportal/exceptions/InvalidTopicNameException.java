package com.cg.surveyportal.exceptions;

public class InvalidTopicNameException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidTopicNameException() {
    }

    public InvalidTopicNameException(String msg) {
        super(msg);
    }

}
