package com.cg.surveyportal.services;

import java.util.List;
import com.cg.surveyportal.exceptions.InvalidQuestionTextException;
import com.cg.surveyportal.exceptions.InvalidSurveyException;
import com.cg.surveyportal.exceptions.QuestionNotFoundException;
import com.cg.surveyportal.exceptions.SurveyNotFoundException;
import com.cg.surveyportal.entities.Option;
import com.cg.surveyportal.entities.Question;


public interface IQuestionService {

    Question getById(long id) throws QuestionNotFoundException;

	List<Question> getQuestionDetails();

    Question removeById(Long questionId);

	Question updateQuestion(long questionId,String questionText)
	throws InvalidQuestionTextException, SurveyNotFoundException, InvalidSurveyException;

	void addQuestion (String text, List<Option> option);
	
	void addQuestionText (String text);
	
	// Question createQuestion(String questionText, List<Option> options)
    //throws InvalidQuestionTextException, SurveyNotFoundException, InvalidSurveyException;

}