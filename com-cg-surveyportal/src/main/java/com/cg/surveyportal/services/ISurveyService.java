package com.cg.surveyportal.services;

import java.util.List;

import com.cg.surveyportal.entities.Survey;

public interface ISurveyService {

	//public void populateSurvey();
	public List<Survey> getAllSurveys();
	public Survey getSurveyById(long id);
	
	public void deleteAllsurveys();
}
