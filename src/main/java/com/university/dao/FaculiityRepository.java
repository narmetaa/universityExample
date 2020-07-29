package com.university.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.university.pojos.Faculty;

@Repository
public interface FaculiityRepository extends CrudRepository<Faculty, Long> {

}
