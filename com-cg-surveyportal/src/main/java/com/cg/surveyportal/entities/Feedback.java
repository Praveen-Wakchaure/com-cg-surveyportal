package com.cg.surveyportal.entities;

import java.time.LocalDateTime;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table
public class Feedback {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	@Column
    private LocalDateTime postedDateTime;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "id")
	private Survey survey;
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = CascadeType.ALL)
	@JoinColumn(referencedColumnName = "id")
    private Participant participant;
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn( referencedColumnName = "id")
	private Question question;
	@Embedded
	private Option chosenOption;
//	@OneToOne
//	@MapKey(name = "questionId")
//	private Map<Long, Option> chosenAnswer;
	
	
	public Feedback() {
	}
	public Feedback(Long id, LocalDateTime postedDateTime, Survey survey, Participant participant, Map<Long, Option> chosenAnswer, Question question, Option chosenOptionion) {
		super();
		this.id = id;
		this.postedDateTime = postedDateTime;
		this.survey = survey;
		this.participant = participant;
		this.question = question;
		this.chosenOption = chosenOptionion;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDateTime getPostedDateTime() {
		return postedDateTime;
	}
	public void setPostedDateTime(LocalDateTime postedDateTime) {
		this.postedDateTime = postedDateTime;
	}
	public Survey getSurvey() {
		return survey;
	}
	public void setSurvey(Survey survey) {
		this.survey = survey;
	}
	public Participant getParticipant() {
		return participant;
	}
	public void setParticipant(Participant participant) {
		this.participant = participant;
	}
	public Question getQuestion() {
		return question;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public Option getChosenOption() {
		return chosenOption;
	}
	public void setChosenOption(Option chosenOption) {
		this.chosenOption = chosenOption;
	}
	@Override
	public String toString() {
		return "Feedback [id=" + id + ", postedDateTime=" + postedDateTime + ", survey=" + survey + ", participant="
				+ participant + ", question=" + question + ", chosenOption=" + chosenOption + "]";
	}
	
}
