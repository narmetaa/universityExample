package com.university.modules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.university.dao.CollegeRepositary;
//import com.university.dao.CollegeRepositary;
import com.university.pojos.College;

@Service
public class CollegeInfoServices {

	@Autowired
	CollegeRepositary dao;

	private College clg;

	@Autowired
	public College getClg() {
		return clg;
	}

	public void setClg(College clg) {
		this.clg = clg;
	}

	public void CollegeInfo(College college) {

		System.out.println("college Name: " + college.getCollegeName() + "college code: " + college.getCollegeCode());

		dao.save(college);
		System.out.println(college.getCollegeCode());
		System.out.println("dao layar created sucessfully !!");
	}
}
