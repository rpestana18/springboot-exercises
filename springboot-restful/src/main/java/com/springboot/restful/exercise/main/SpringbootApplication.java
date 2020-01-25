package com.springboot.restful.exercise.main;

import com.springboot.restful.exercise.controller.RestServiceController;
import com.springboot.restful.exercise.dao.AssociationRepository;
import com.springboot.restful.exercise.dao.DatabaseConfiguration;
import com.springboot.restful.exercise.model.Association;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackageClasses = RestServiceController.class) //rest
@ComponentScan(basePackageClasses = DatabaseConfiguration.class) // database
@EntityScan(basePackageClasses = Association.class)
@EnableJpaRepositories(basePackageClasses = AssociationRepository.class)
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
}
