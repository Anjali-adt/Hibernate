package com.map.one_to_many;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Answer1 {

	@Id
	@Column(name="answer_id")
	private int answerId;
	private String answer;
	
	@ManyToOne
	private Question1 ques1;

	public Answer1() {
		super();
	}

	//public Answer1(int answerId, String answer, Question1 ques1) {
	
	//-----cascading-----------
	  public Answer1(int answerId, String answer) {

		super();
		this.answerId = answerId;
		this.answer = answer;
		//this.ques1 = ques1; -->one-to-many
	}

	public int getAnswerId() {
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
// --------one-to-many
//	public Question1 getQues1() {
//		return ques1;
//	}
//
//	public void setQues1(Question1 ques1) {
//		this.ques1 = ques1;
//	}
//	
	
	
	
}
