package com.cg.surveyportal.exceptions;

public class TopicNotFoundException extends Exception{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TopicNotFoundException(){

    }

    public TopicNotFoundException(String msg){
        super(msg);
    }
}
