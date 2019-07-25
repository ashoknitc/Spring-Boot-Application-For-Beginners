package com.ashok.SpringBootService;


import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ashok.SpringBootModel.Course;
import com.ashok.SpringBootModel.Student;

@Component
public class StudentService 
{
	private static List<Student> students=new ArrayList<>();
	static
	{
		Course course1=new Course("Course1","Spring MVC","Description Of Spring MVC",
						Arrays.asList("Defining Of Spring MVC","Spring MVC Pattern","Spring MVC Design Pattern"));
		Course course2=new Course("Course2","PHP","Description Of PHP",
				Arrays.asList("Defining Of PHP","PHP MVC Pattern","PHP MVC Design Pattern"));
		Course course3=new Course("Course3","Spring Boot","Description Of Spring Boot",
				Arrays.asList("Defining Of Spring Boot","Spring Boot Pattern","Spring Boot Design Pattern"));
		Course course4=new Course("Course4","Maven","Description Of Maven",
				Arrays.asList("Defining Of Maven","Maven Dependency","Spring MVC Design Pattern"));
		Student ashok=new Student("Student1","Ashok Kumar","Software Engineer",
				Arrays.asList(course1,course2,course3,course4));
		Student aman=new Student("Student2","Aman Kumar","Software Developer Engineer",
				Arrays.asList(course1,course2,course3,course4));
		students.add(ashok);
		students.add(aman);
	}	
	
	//get all students information
	public List<Student> getAllStudents()
	{
		return students;
	}
	//get single student info
	public Student getSingleStudentInfo(String student_id)
	{
		for(Student student:students)
		{
			if(student.getId().equals(student_id))
			{
				return student;
			}
		}
		return null;
	}
	//get all course information
	public List<Course> getStudentCourseList(String student_id)
	{
		Student student=getSingleStudentInfo(student_id);
		if(student==null)
		{
			return null;
		}
		else
		{
			return student.getCourses();
		}
	}
	//get Single Course Information
	public Course getSingleCourse(String student_id,String course_id)
	{
		for(Course course:getStudentCourseList(student_id))
		{
			if(course.getId().equals(course_id))
			{
				return course;
			}
		}
		return null;
	}
	
	
}
