package com.cg.surveyportal.exceptions;

public class ParticipantNotFoundException extends Exception{

    public ParticipantNotFoundException(){

    }

    public ParticipantNotFoundException(String msg){
        super(msg);
    }
}
