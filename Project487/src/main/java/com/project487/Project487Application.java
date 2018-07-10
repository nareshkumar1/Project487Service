package com.project487;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.project487.dao.AdminDao;

@SpringBootApplication
public class Project487Application {

	//to enter test data please - 
	
	//implements CommandLineRunner
	
	/*@Autowired
	private AdminDao adminDaoImpl;
	
	@Override
	public void run(String... args) throws Exception {
		
		adminDaoImpl.addNewOrganization("10113", "Project487","MidSize");

	}*/
	
	public static void main(String[] args) {
		SpringApplication.run(Project487Application.class, args);
	}

	
}
