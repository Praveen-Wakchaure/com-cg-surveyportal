package com.cg.surveyportal.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.cg.surveyportal.exceptions.InvalidQuestionTextException;
import com.cg.surveyportal.exceptions.QuestionNotFoundException;
import com.cg.surveyportal.entities.Option;
import com.cg.surveyportal.entities.Question;


public interface IQuestionRepository extends CrudRepository<Question,Long> {

   /* Question findByQid(Long questionId) throws QuestionNotFoundException;
    Question add(Question question);
    void removeById(Long questionId) ;
    Question update(Question question) throws QuestionNotFoundException;
*/
}