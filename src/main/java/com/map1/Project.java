package com.map1;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	private int pId;
	@Column(name="projectName")
	private String pName;
	
	@ManyToMany(mappedBy="projects")
	private List<Employee>emps;

	public Project() {
		super();
	}

	public Project(int pId, String pName, List<Employee> emps) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.emps = emps;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public List<Employee> getEmps() {
		return emps;
	}

	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
	
	
	
}
