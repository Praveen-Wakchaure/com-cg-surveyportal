package com.cg.surveyportal.services;

import java.util.List;

import com.cg.surveyportal.entities.Survey;
import com.cg.surveyportal.entities.Topic;
import com.cg.surveyportal.exceptions.SurveyorNotFoundException;
import com.cg.surveyportal.exceptions.TopicNotFoundException;

public interface ITopicService {

	public Topic getTopicDetails(long id) throws TopicNotFoundException;
    public List<Topic> getTopicsDetails(String name) throws TopicNotFoundException;
    public Topic removeTopic(long id) throws TopicNotFoundException;
    public Topic addTopic(String name, String description, String surveyorUsername) throws SurveyorNotFoundException;
    public Topic updateTopicName(long id, String name) throws TopicNotFoundException;
    public Topic updateTopicDescription(long id, String description) throws TopicNotFoundException;
    public void populateTopic();
    public List<Topic> getAllTopic();
    public long getTopicCount();
    public long getSurveyCountOnTopic(String name) throws TopicNotFoundException;
	public void addSurveysToTopic(Survey survey, String name) throws TopicNotFoundException;
	public Topic changeSurveyor(long topicId, long SurveyorId);
}
