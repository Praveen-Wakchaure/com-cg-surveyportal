package com.cg.surveyportal.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.surveyportal.entities.Topic;
import com.cg.surveyportal.exceptions.TopicNotFoundException;

public interface ITopicRepository extends JpaRepository<Topic, Long> {

	public List<Topic> findByName(String name) throws TopicNotFoundException;
}
