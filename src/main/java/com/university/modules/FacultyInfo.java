package com.university.modules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.university.pojos.College;
import com.university.pojos.Faculty;

@RestController
@RequestMapping("/fct")
public class FacultyInfo {

	@Autowired
	FacultyInfoServices fcty;

	@PostMapping(value = "/faculty")
	public String saveFaculty(@RequestParam("hi") String hi, @RequestBody Faculty faculty) {
		System.out.println("Haiiiiiiii");
		System.out.println(hi);

		System.out.println(faculty.getFacultyName());
	

		return "200";

	}
	
	
	@PostMapping(value = "/clg2")
	public void collegeTest(@RequestBody College college) {
		System.out.println("college test");
		System.out.println(college.getCollegeName());
		
		
		
	}
}
