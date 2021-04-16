package com.cg.surveyportal.exceptions;

public class QuestionNotFoundException extends Exception{
    public QuestionNotFoundException(){

    }

    public QuestionNotFoundException(String msg){
        super(msg);
    }
}
