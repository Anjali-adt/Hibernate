package com.map.one_to_many;

import java.util.List;

import com.map.Answer;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Question1 {
	
	@Id
	@Column(name="que_id")
	private int queId;
	
	private String que;
	
	@OneToMany(mappedBy="ques1", cascade =CascadeType.ALL )
	private List<Answer1> answers;

	public Question1() {
		super();
	}

	public Question1(int queId, String que, List<Answer1> answers) {
		super();
		this.queId = queId;
		this.que = que;
		this.answers = answers;
	}

	public int getQueId() {
		return queId;
	}

	public void setQueId(int queId) {
		this.queId = queId;
	}

	public String getQue() {
		return que;
	}

	public void setQue(String que) {
		this.que = que;
	}

	public List<Answer1> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer1> list) {
		this.answers = list;
	}
	
	
	}


