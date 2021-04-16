package com.cg.surveyportal.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	private String TOPIC_NOT_FOUND = "TOPIC_NOT_FOUND";
	private String SURVEYOR_NOT_FOUND = "SURVEYOR_NOT_FOUND";
	
	
	@ExceptionHandler(TopicNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleTopicNotFoundException(TopicNotFoundException topicNotFoundException, WebRequest request) {
		String details = topicNotFoundException.getLocalizedMessage();
        ErrorDetails error = new ErrorDetails(TOPIC_NOT_FOUND, details);
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(SurveyorNotFoundException.class)
	public ResponseEntity<ErrorDetails> handleSurveyorNotFoundException(SurveyorNotFoundException surveyorNotFoundException, WebRequest request) {
		String details = surveyorNotFoundException.getLocalizedMessage();
        ErrorDetails error = new ErrorDetails(SURVEYOR_NOT_FOUND, details);
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
}
