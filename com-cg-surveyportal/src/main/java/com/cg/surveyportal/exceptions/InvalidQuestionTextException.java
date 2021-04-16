package com.cg.surveyportal.exceptions;

public class InvalidQuestionTextException extends Exception{

    public InvalidQuestionTextException(){

    }

    public InvalidQuestionTextException(String msg){
        super(msg);
    }
}
