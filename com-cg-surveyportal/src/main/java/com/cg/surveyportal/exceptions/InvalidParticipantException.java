package com.cg.surveyportal.exceptions;

public class InvalidParticipantException extends Exception{

    public InvalidParticipantException(){

    }

    public InvalidParticipantException(String msg){
        super(msg);
    }
}
