package com.ashok.SpringBootController;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ashok.SpringBootModel.Student;
import com.ashok.SpringBootService.StudentService;

@RestController
public class StudentController
{
	@Autowired
	private StudentService student_service;
	
	//get All Students Information
	@GetMapping("/get/all/Students/info")
	public List<Student> getStudentInfo()
	{
		return student_service.retrieveAllStudents();
	}
	
	//get Single Student Information
	@GetMapping("/get/single/student/info/{Student_Id}")
	public Student getSingleStudent(@PathVariable String Student_Id)
	{
		return student_service.getSingleStudentInfo(Student_Id);
	}
}