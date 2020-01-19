package com.springboot.restfull.exercise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restfull.exercise.dao.AssociationRepository;
import com.springboot.restfull.exercise.model.Association;

@RestController
public class RestServiceController {
    
    @Autowired
    AssociationRepository repository;
	
	
    @RequestMapping("/wsrest/association/list")
    public List<Association> listAssociations() {
    	
    	repository.save(new Association(1L, "Associacao 1", "94552377000105"));
    	repository.save(new Association(2L, "Associacao 2", "39161767000138"));
    	repository.save(new Association(3L, "Associacao 3", "87841782000170"));
    	repository.save(new Association(4L, "Associacao 4", "76957541000174"));
     	
    	List<Association> m = repository.findAll();
    	
        return m;
    }
    
    @RequestMapping(value = "/wsrest/association/save", method = RequestMethod.POST)
    public void saveAssociation(@RequestBody Association association) {
    	
    	repository.save(association);
    	
    }
	

}
