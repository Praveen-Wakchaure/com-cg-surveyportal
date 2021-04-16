package com.cg.surveyportal.entities;

import javax.persistence.Embeddable;

@Embeddable
public class Option {

	int index;
	String optionText;
	
	public Option() {
		super();
	}
	public Option(int index, String optionText) {
		super();
		this.index = index;
		this.optionText = optionText;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getOptionText() {
		return optionText;
	}
	public void setOptionText(String optionText) {
		this.optionText = optionText;
	}
	
	@Override
	public String toString() {
		return "Option [index=" + index + ", optionText=" + optionText + "]";
	}
}
