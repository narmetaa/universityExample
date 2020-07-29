package com.university.modules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.university.pojos.College;



@RestController
@RequestMapping("/clg")
public class Colleges {
	
	@Autowired
	CollegeInfoServices clgs;
	
	
	
	@RequestMapping(value = "/college")
	public String collegeDetails(@RequestBody College college) {
		
		System.out.println(college.getCollegeCity()+"  " +college.getCollegeName()+"  "+college.getTypeOfCollege()+"  "+college.getCollegeCode());
		clgs.CollegeInfo(college);
		return "200";
	}

}
