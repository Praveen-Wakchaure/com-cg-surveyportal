package com.cg.surveyportal.servicesimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.surveyportal.exceptions.InvalidQuestionTextException;
import com.cg.surveyportal.exceptions.InvalidSurveyException;
import com.cg.surveyportal.exceptions.SurveyNotFoundException;
import com.cg.surveyportal.entities.Option;
import com.cg.surveyportal.entities.Question;
import com.cg.surveyportal.repositories.IQuestionRepository;
import com.cg.surveyportal.services.IQuestionService;

@Service
public class QuestionServiceImpl implements IQuestionService {
	
	@Autowired
	IQuestionRepository questionRepository;

	@Override
	public Question getById(long questionId) {
    Question questionById = questionRepository.findById(questionId).get();
		
		return questionById;
	}

	@Override
   public Question updateQuestion(long questionId,String questionText)
			throws InvalidQuestionTextException, SurveyNotFoundException, InvalidSurveyException {
		    Question updateQuestion = questionRepository.findById(questionId).get();
			updateQuestion.setQuestionText(questionText);
			questionRepository.save(updateQuestion);
		return updateQuestion;
	}

	@Override
	public Question removeById(Long questionId) {
		
		Question deletedQuestion = questionRepository.findById(questionId).get();
		questionRepository.deleteById(questionId);
		return deletedQuestion;
	}

	@Override
	public List<Question> getQuestionDetails() {
		// TODO Auto-generated method stub
		return (List<Question>) questionRepository.findAll();
	}

	@Override
	public void addQuestion(String text, List<Option> option) {
		// TODO Auto-generated method stub
		Question question = new Question();
		question.setOptions(option);
		question.setQuestionText(text);
		questionRepository.save(question);
	}
	
	public void addQuestionText(String text) {
		Question question = new Question();
		question.setQuestionText(text);
		questionRepository.save(question);
	}
	
	/*@Override
	public Question createQuestion( String questionText, List<Option> options)
			throws InvalidQuestionTextException, SurveyNotFoundException, InvalidSurveyException {
		
		Question newQuestion = new Question();
		//newQuestion.setSurvey(survey);
		newQuestion.setQuestionText(questionText);
		//newQuestion.setOptions(options);
		
		questionRepository.save(newQuestion);
		
		return newQuestion;
	}*/


}