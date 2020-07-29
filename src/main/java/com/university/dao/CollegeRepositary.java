package com.university.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.university.pojos.College;

@Repository
public interface CollegeRepositary extends CrudRepository<College, Long> {

}
