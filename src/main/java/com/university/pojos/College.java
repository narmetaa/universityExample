package com.university.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class College {
	
	
	
	@Id
	@GeneratedValue
	private Long collegeCode;
	private String collegeName;
	private String collegeCity;
	private String typeOfCollege;

	
	
	
	
	
	
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Long getCollegeCode() {
		return collegeCode;
	}
	public void setCollegeCode(Long collegeCode) {
		this.collegeCode = collegeCode;
	}
	public String getCollegeCity() {
		return collegeCity;
	}
	public void setCollegeCity(String collegeCity) {
		this.collegeCity = collegeCity;
	}
	public String getTypeOfCollege() {
		return typeOfCollege;
	}
	public void setTypeOfCollege(String typeOfCollege) {
		this.typeOfCollege = typeOfCollege;
	}
	
	
}
