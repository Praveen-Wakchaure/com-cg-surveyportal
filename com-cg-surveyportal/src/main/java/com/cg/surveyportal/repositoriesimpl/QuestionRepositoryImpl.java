package com.cg.surveyportal.repositoriesimpl;

//import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import com.cg.surveyportal.exceptions.QuestionNotFoundException;

import com.cg.surveyportal.repositories.IQuestionRepository;
import com.cg.surveyportal.entities.Question;

public class QuestionRepositoryImpl implements IQuestionRepository {

	
	@Autowired
	IQuestionRepository questionRepository;
	
	/*@Override
	public Question findByQid(Long questionId) throws QuestionNotFoundException {
		// TODO Auto-generated method stub
		
		Question questionById = questionRepository.findById(questionId).get();
		
		return questionById;
	}
	@Override
	public Question add(Question question) {
		
		questionRepository.save(question);
		
		return question;
	}
	@Override
	public void removeById(Long questionId) {
		
		questionRepository.deleteById(questionId);
		
	}
	@Override
	public Question update(Question question) throws QuestionNotFoundException {
		
		questionRepository.save(question);
		
		return null;
	}
*/
	@Override
	public <S extends Question> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Question> Iterable<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Question> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Question> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Question> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Question entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Question> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

}