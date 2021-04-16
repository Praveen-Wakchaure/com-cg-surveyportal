package com.cg.surveyportal.repositoriesimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.cg.surveyportal.entities.Topic;
import com.cg.surveyportal.repositories.ITopicRepository;

public class TopicRepositoryImpl implements ITopicRepository {

	@Override
	public List<Topic> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Optional<Topic> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
	}
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	@Override
	public List<Topic> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Topic> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Topic> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Topic> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void flush() {
		// TODO Auto-generated method stub

	}
	@Override
	public <S extends Topic> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteInBatch(Iterable<Topic> entities) {
		// TODO Auto-generated method stub

	}
	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub

	}
	@Override
	public Topic getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Topic> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Topic> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Page<Topic> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Topic> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void delete(Topic entity) {
		// TODO Auto-generated method stub

	}
	@Override
	public void deleteAll(Iterable<? extends Topic> entities) {
		// TODO Auto-generated method stub

	}
	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}
	@Override
	public <S extends Topic> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Topic> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public <S extends Topic> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public <S extends Topic> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
