package com.university.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.university.dao.FacultyIdCardSaveRepository;
import com.university.pojos.Faculty;
import com.university.pojos.IdCardDetails;

@RestController
public class FacultyController {

	@Autowired
	private FacultyIdCardSaveRepository savefaculty;

	@PostMapping("/savefaculty")
	public String facultysave(@RequestBody Faculty faculty) {
		System.out.println("user triggred for save faculty data");
		

		savefaculty.save(faculty);

		return null;
	}

	/*
	 * {
	 * 
	 * "facultyName":"ashok", "fsubject":"englsih", "facultyGender":"male",
	 * "idcarddetais":{ "idNumber":"as4551gs", "bloodGroup":"A*",
	 * "designation":"associate" }
	 * 
	 * }
	 * 
	 */
	
	@PostMapping("/save")
	public String saveFaculty(@RequestBody Faculty fa) {
		savefaculty.save(fa);
		
		return "done";
		
	}
	
	
	
	
	
	
	
	
	
	
}
