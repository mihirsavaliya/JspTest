package com.example.jsptest.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Hospital")
public class HospitalTest 
{
	@Column(name = "hId")
	@Id
	/* @GeneratedValue(strategy=GenerationType.IDENTITY) */
	private Long hId;
	
	@Column(name = "hName")
	private String name;
	
	@Column(name = "hCity")
	private String city;
	
	@Column(name = "hSpeciality")
	private String speciality;
	
	@Column(name = "hNumDoctor")
	private int numDoctor;

	public Long gethId() {
		return hId;
	}

	public void sethId(Long hId) {
		this.hId = hId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public int getNumDoctor() {
		return numDoctor;
	}

	public void setNumDoctor(int numDoctor) {
		this.numDoctor = numDoctor;
	}

	@Override
	public String toString() {
		return "HospitalTest [hId=" + hId + ", name=" + name + ", city=" + city + ", speciality=" + speciality
				+ ", numDoctor=" + numDoctor + ", gethId()=" + gethId() + ", getName()=" + getName() + ", getCity()="
				+ getCity() + ", getSpeciality()=" + getSpeciality() + ", getNumDoctor()=" + getNumDoctor()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
