package com.cg.surveyportal.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table
public class Question {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	@Column(nullable = false, length = 20)	
    private String questionText;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = true, cascade = CascadeType.ALL)
    @JoinColumn( referencedColumnName = "id")
	private Survey survey;

    @ElementCollection
    private List<Option> options;

	public Question() {
		super();
	}

	public Question(Long id, String questionText, Survey survey, List<Option> options) {
		super();
		this.id = id;
		this.questionText = questionText;
		this.survey = survey;
		this.options = options;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public Survey getSurvey() {
		return survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}
	@JsonIgnore
	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> option) {
		this.options = option;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", questionText=" + questionText + ", survey=" + survey + ", options=" + options
				+ "]";
	}
}
