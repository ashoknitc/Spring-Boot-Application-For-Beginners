package com.ashok.SpringBootController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ashok.SpringBootModel.Course;
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
	
	//get Single Student Information
	@GetMapping("/get/student/{studentId}")
	public Student getStudentInfo(@PathVariable String studentId )
	{
		return student_service.getSingleStudentInfo(studentId);
	}
	
	//get Course list accourding to studentId
	@GetMapping("/get/student/{studentId}/courses")
	public List<Course> getAllStudentCourse(@PathVariable String studentId)
	{
		return student_service.getAllStudentCourses(studentId);
	}
	
	
	//get Course Information according to course_id and student_id
	@GetMapping("/get/steps/by/{studentId}/{courseId}")
	public List<String> getAllSteps(@PathVariable String studentId,@PathVariable String courseId)
	{
		return student_service.getAllStepsInfo(studentId, courseId);
	}
	
}