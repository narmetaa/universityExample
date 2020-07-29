package com.university.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.university.pojos.IdCardDetails;

@Repository
public interface IdCardRepository extends CrudRepository<IdCardDetails, Long> {

}
