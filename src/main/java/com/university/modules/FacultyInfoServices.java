package com.university.modules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.university.dao.FaculiityRepository;
import com.university.pojos.College;
import com.university.pojos.Faculty;

@Service
public class FacultyInfoServices {

	 
	@Autowired
	private FaculiityRepository Frepo;
	
	
	public void saveFaculty(Faculty faculty) {
		
		System.out.println(" Hi--FacultyInfoServices!!");
		Frepo.save(faculty);
		System.out.println("insertion done");
		
	}
	
	

}
