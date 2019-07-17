package com.ashok.SpringBootController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashok.SpringBootModel.Student;
import com.ashok.SpringBootService.StudentService;

@RestController
public class StudentController
{
	@Autowired
	private StudentService student_service;
	
	//get all Student information
	@GetMapping("/get/all/students")
	public List<Student> getAllStudents()
	{
		return student_service.getAllStudents();
	}
	
}