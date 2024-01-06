package com.cjc.controller;

import java.util.List;

import org.hibernate.dialect.MySQLDialect;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Student;

@RestController
public class CrudController {
	@PostMapping("/save")
	public String saveData(@RequestBody Student s)
	{
		return null;
		
	}
	@GetMapping("/get")
	public List<Student> getData()
	{
		return null;
		
	}
	
	
	
	

}
