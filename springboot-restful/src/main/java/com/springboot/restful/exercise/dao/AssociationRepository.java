package com.springboot.restful.exercise.dao;

import com.springboot.restful.exercise.model.Association;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssociationRepository extends JpaRepository<Association, Long>  {

	
}