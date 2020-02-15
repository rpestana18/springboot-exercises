package com.springboot.restful.exercise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restful.exercise.dao.AssociationRepository;
import com.springboot.restful.exercise.model.Association;

@RestController
public class AssociationController {
    
    @Autowired
    AssociationRepository repository;
	
	
    @RequestMapping("/association/list")
    public List<Association> listAssociations() {
    	List<Association> m = repository.findAll();
        return m;
    }
    
    @RequestMapping(value = "/association/save", method = RequestMethod.POST)
    public void saveAssociation(@RequestBody Association association) {
    	repository.save(association);
    }
}
