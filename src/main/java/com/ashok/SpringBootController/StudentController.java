package com.ashok.SpringBootController;

import java.net.URI;
import java.net.URL;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ashok.SpringBootModel.Course;
import com.ashok.SpringBootModel.Student;
import com.ashok.SpringBootService.StudentService;

@RestController
public class StudentController
{
	@Autowired
	private StudentService student_service;
	
	//get All Students information
	@GetMapping("/get/all/students/info")
	public List<Student> getAllStudents()
	{
		return student_service.getAllStudents();
	}
	//get single student info
	@GetMapping("/get/single/Student/info/{student_id}")
	public Student getSingleStudent(@PathVariable String student_id)
	{
		return student_service.getSingleStudentInfo(student_id);
	}
	//get CourseList
	@GetMapping("/get/all/courses/{student_id}")
	public List<Course> getAllCourses(@PathVariable String student_id)
	{
		return student_service.getStudentCourseList(student_id);
	}
	//get Single Course info
	@GetMapping("/get/course/info/{student_id}/{course_id}")
	public Course getCourseInfo(@PathVariable String student_id,@PathVariable String course_id)
	{
		return student_service.getSingleCourse(student_id, course_id);
	}
	

}