package com.ashok.SpringBootService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.ashok.SpringBootModel.Course;
import com.ashok.SpringBootModel.Student;

@Component
public class StudentService {
	private static List<Student> students=new ArrayList<>();
	static
	{
		Course course1=new Course("Course1","PHP","PHP With Its Framework",
				Arrays.asList("Introduction Of PHP","Loop In PHP","Framework Using PHP"));
		
		Course course2=new Course("Course2","Python","Python With Its Framework",
				Arrays.asList("Introduction Of Python","Loop In Python","Framework Using Python"));
		
		Course course3=new Course("Course3","Java","Java With Its Framework",
				Arrays.asList("Introduction Of java","Loop In java","Framework Using java"));
		
		Course course4=new Course("Course4","Rubby","Rubby With Its Framework",
				Arrays.asList("Introduction Of Rubby","Loop In Rubby","Framework Using Rubby"));
		Student ashok=new Student("Student1","Ashok Kumar","Software Developer",
				new ArrayList<>(Arrays.asList(course1,course2,course3,course4)));
		Student amit=new Student("Student2","Amit Kumar","Software Engineer",
				new ArrayList<>(Arrays.asList(course1,course2,course3,course4)));
		students.add(ashok);
		students.add(amit);
	}
	
	//Method to get All Student Information with Course
	public List<Student> retrieveAllStudents()
	{
		return students; 
	}
	
	//Method to get Particular Student Information
	public Student getSingleStudentInfo(String student_Id)
	{
		for(Student student:students)
		{
			if(student.getId().equals(student_Id))
			{
				return student;
			}
		}
		return null;
	}
}
