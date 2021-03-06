package com.cg.surveyportal.entities;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table
public class Survey {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	@Column( length = 200)	
    private String description;
	@Column
    private LocalDateTime publishedDateTime;
	@Column
    private LocalDateTime endDateTime;
	@Column
    private Boolean isActive;
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY, optional = true, cascade = CascadeType.ALL)
	@JoinColumn(name = "topic")
    private Topic topic;
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY, optional = true, cascade = CascadeType.ALL)
	@JoinColumn(name = "id", insertable = false, updatable = false, nullable = true)
    private Surveyor surveyor;
	@JsonManagedReference
    @OneToMany(mappedBy="survey", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Question> questions; 
	@OneToMany(mappedBy="survey", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Feedback> feedback;
	
	//Constructors
	public Survey() {
	}
	public Survey(Long id, String description, LocalDateTime publishedDateTime, LocalDateTime endDateTime,
			Boolean isActive, Topic topic, Surveyor surveyor, List<Question> questions, List<Feedback> feedback) {
		super();
		this.id = id;
		this.description = description;
		this.publishedDateTime = publishedDateTime;
		this.endDateTime = endDateTime;
		this.isActive = isActive;
		this.topic = topic;
		this.surveyor = surveyor;
		this.questions = questions;
		this.feedback = feedback;
	}
	//Getters and setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDateTime getPublishedDateTime() {
		return publishedDateTime;
	}
	public void setPublishedDateTime(LocalDateTime publishedDateTime) {
		this.publishedDateTime = publishedDateTime;
	}
	public LocalDateTime getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(LocalDateTime endDateTime) {
		this.endDateTime = endDateTime;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public Surveyor getSurveyor() {
		return surveyor;
	}
	public void setSurveyor(Surveyor surveyor) {
		this.surveyor = surveyor;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
	public List<Feedback> getFeedback() {
		return feedback;
	}
	public void setFeedback(List<Feedback> feedback) {
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		return "Survey [id=" + id + ", description=" + description + ", publishedDateTime=" + publishedDateTime
				+ ", endDateTime=" + endDateTime + ", isActive=" + isActive + ", topic=" + topic + ", surveyor="
				+ surveyor + ", questions=" + questions + ", feedback=" + feedback + "]";
	}
	
}
