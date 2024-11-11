package com.map;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
	

@Entity
public class Question {
	

	@Id
	@Column(name="que_id")
	private int queId;
	
	private String que;
	
	@OneToOne
	private Answer ans;
	
	public Question() {
		super();
	}

	public Question(int queId, String que, Answer ans) {
		super();
		this.queId = queId;
		this.que = que;
		this.ans = ans;
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

	public Answer getAns() {
		return ans;
	}

	public void setAns(Answer ans) {
		this.ans = ans;
	}
	

	
}
