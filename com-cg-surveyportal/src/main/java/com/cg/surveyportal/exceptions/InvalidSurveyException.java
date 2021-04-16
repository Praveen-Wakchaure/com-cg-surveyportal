package com.cg.surveyportal.exceptions;

public class InvalidSurveyException extends Exception{
    public InvalidSurveyException(){

    }

    public InvalidSurveyException(String msg){
        super(msg);
    }
}
