package com.map;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Answer {
	
	
    @Id
	@Column(name="ans_id")
    private int ansId;
    private String ans;

    
	public Answer() {
		super();
	}

	public Answer(int ansId, String ans) {
		super();
		this.ansId = ansId;
		this.ans = ans;
	}
	

	public int getAnsId() {
		return ansId;
	}

	public void setAnsId(int ansId) {
		this.ansId = ansId;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}
	
	
	

}
