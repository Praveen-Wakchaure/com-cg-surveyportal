package com.cg.surveyportal.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.surveyportal.entities.Survey;
import com.cg.surveyportal.exceptions.TopicNotFoundException;
import com.cg.surveyportal.services.ISurveyService;
import com.cg.surveyportal.services.ITopicService;

@RestController
@RequestMapping("/survey")
public class SurveyControllers {
	
	@Autowired
	private ISurveyService surveyService;
	@Autowired
	private ITopicService topicService;
	
//	@GetMapping("/populate")
//	private void populateSurvey() {
//		surveyService.populateSurvey();
//	}
	
	@GetMapping("/allsurveys")
	private List<Survey> getAllSurveys() {
		return surveyService.getAllSurveys();
	}
	
	@DeleteMapping
	private void deleteAllsurveys()
	{
		surveyService.deleteAllsurveys();
	}
	
	@GetMapping("/addsurveytotopic")
	private void addSurveyToTopic() throws TopicNotFoundException
	{
		Survey survey = new Survey();
		survey.setDescription("This survey is on Java programming.");
		survey.setIsActive(true);
		
 		
		topicService.addSurveysToTopic(surveyService.getSurveyById(7), "Programming");
	}
	
	
	
	
	
	
}
