package com.cg.surveyportal.exceptions;

public class SurveyNotFoundException extends Exception{

    public SurveyNotFoundException(){
    }

    public SurveyNotFoundException(String msg){
        super(msg);
    }
}
