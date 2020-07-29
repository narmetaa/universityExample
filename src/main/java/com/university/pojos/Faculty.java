package com.university.pojos;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Faculty {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long fcollegeCode;
	private String facultyName;
	private String fsubject;
	private String facultyGender;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idNumber", referencedColumnName = "idNumber")
	private IdCardDetails idcarddetais;

	public Long getFcollegeCode() {
		return fcollegeCode;
	}

	public void setFcollegeCode(Long fcollegeCode) {
		this.fcollegeCode = fcollegeCode;
	}

	public String getFacultyName() {
		return facultyName;
	}

	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}

	public String getFsubject() {
		return fsubject;
	}

	public void setFsubject(String fsubject) {
		this.fsubject = fsubject;
	}

	public String getFacultyGender() {
		return facultyGender;
	}

	public void setFacultyGender(String facultyGender) {
		this.facultyGender = facultyGender;
	}

	public IdCardDetails getIdcarddetais() {
		return idcarddetais;
	}

	public void setIdcarddetais(IdCardDetails idcarddetais) {
		this.idcarddetais = idcarddetais;
	}

}
