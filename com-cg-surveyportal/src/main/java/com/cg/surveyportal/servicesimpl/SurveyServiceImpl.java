package com.cg.surveyportal.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.surveyportal.entities.Survey;
import com.cg.surveyportal.repositories.ISurveyRepository;
import com.cg.surveyportal.services.ISurveyService;
import com.cg.surveyportal.services.ITopicService;

@Service
public class SurveyServiceImpl implements ISurveyService {
	
	@Autowired
	ISurveyRepository surveyRepository;
	@Autowired
	ITopicService topicService; 
	
//	public void populateSurvey() {
//		List<Survey> surveyList = new ArrayList<>();
//		
//		Survey survey = new Survey();
//		survey.setDescription("This is a surveys is on James Bond.");
//		survey.setPublishedDateTime(null);
//		survey.setEndDateTime(null);
//		survey.setIsActive(true);
//		String topic ="Movies";
//		survey.setTopic(topicService.getTopicsDetails(topic).get(0));
//		topicService.addSurveysToTopic(survey, topic);
//		surveyList.add(survey);
//		//*************************************//
//		survey = new Survey();
//		survey.setDescription("This is a surveys is on Peaky Blinders.");
//		survey.setPublishedDateTime(null);
//		survey.setEndDateTime(null);
//		survey.setIsActive(true);
//		survey.setTopic(topicService.getTopicsDetails("TV Shows").get(0));
//		surveyList.add(survey);
//		//*************************************//
//		survey = new Survey();
//		survey.setDescription("This is a surveys is on Apex Lengends.");
//		survey.setPublishedDateTime(null);
//		survey.setEndDateTime(null);
//		survey.setIsActive(true);
//		survey.setTopic(topicService.getTopicsDetails("Gaming").get(0));
//		surveyList.add(survey);
//		//*************************************//
//		survey = new Survey();
//		survey.setDescription("This is a surveys is on the Hemlet.");
//		survey.setPublishedDateTime(null);
//		survey.setEndDateTime(null);
//		survey.setIsActive(true);
//		survey.setTopic(topicService.getTopicsDetails("Litrature").get(0));
//		surveyList.add(survey);
//		//*************************************//
//		surveyRepository.saveAll(surveyList);
//	}

	@Override
	public List<Survey> getAllSurveys() {
		List<Survey> surveyById = surveyRepository.findAll();
		return surveyById;
	}
	
	@Override
	public Survey getSurveyById(long id) {
		return surveyRepository.findById(id).get();
	}

	@Override
	public void deleteAllsurveys() {
		surveyRepository.deleteAll(); 
	}

}
