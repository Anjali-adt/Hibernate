package com.durgesh_hbr;

import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name="student_address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name="address_id")
	private int addId;
	
	@Column(length=50)
	private String street;
	
	@Column(length=100)
	private String city;
	
	@Transient
	private double x;
	
	@Column(name="added_date")
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	
	public Address() {
		super();
	}

	public Address(int addId, String street, String city, double x, Date addedDate) {
		super();
		this.addId = addId;
		this.street = street;
		this.city = city;
		this.x = x;
		this.addedDate = addedDate;
		
	}

	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	

	

	@Override
	public String toString() {
		return "Address [addId=" + addId + ", street=" + street + ", city=" + city + ", x=" + x + ", addedDate="
				+ addedDate + ", image=" +"]";
	}
	

}
