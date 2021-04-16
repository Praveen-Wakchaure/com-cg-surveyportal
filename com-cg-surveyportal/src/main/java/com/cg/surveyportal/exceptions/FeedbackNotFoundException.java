package com.cg.surveyportal.exceptions;

import java.util.concurrent.Executors;

public class FeedbackNotFoundException extends Exception {

    public FeedbackNotFoundException(){

    }

    public FeedbackNotFoundException(String msg){
        super(msg);
    }
}
