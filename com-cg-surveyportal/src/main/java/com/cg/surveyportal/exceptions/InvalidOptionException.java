package com.cg.surveyportal.exceptions;

public class InvalidOptionException extends Exception{

    public InvalidOptionException(){
    }

    public InvalidOptionException(String msg){
        super(msg);
    }

}
