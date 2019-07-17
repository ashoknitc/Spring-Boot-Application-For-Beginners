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
		Course course1=new Course("Course1","Spring","Description Of Spring",
					Arrays.asList("Learn Maven","Import Project","First Example","Second Example"));
		
		Course course2=new Course("Course2","Spring  MVC","Description Of Spring MVC",
				Arrays.asList("Learn Maven Depemdency","Import MVC Project ","First Example","Second Example"));
		Course course3=new Course("Course3","Spring Boot","Description Of Spring Boot",
				Arrays.asList("Learn Maven for Spring Boot","Import Spring Boot Project","First Example","Second Example"));
		Course course4=new Course("Course4","Core Java","Description Of Core Java",
				Arrays.asList("Learn Core Java","Import Core Java Project","First Example","Second Example"));
		Student avishek=new Student("Student1","avishek suryabanshi","Software Enginner",
				new ArrayList<>(Arrays.asList(course1,course2,course3,course4)));
		Student ashok=new Student("Student2","ashok verma","Software Enginner",
				new ArrayList<>(Arrays.asList(course1,course2,course3,course4)));
		Student akshay=new Student("Student3","akshay verma","Software Devlopment Enginner",
				new ArrayList<>(Arrays.asList(course1,course2,course3,course4)));
		students.add(akshay);
		students.add(avishek);
		students.add(ashok);
		
	}
	//get all student infromation
	public List<Student> getAllStudents()
	{
		return students;
	}
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
	public List<Course> getAllStudentCourses(String studentId)
	{
		Student student=getSingleStudentInfo(studentId);
		if(student==null)
		{
			return null;
		}
		return student.getCourses();
	}
	public List<String> getAllStepsInfo(String student_id,String course_id)
	{
		Student student=getSingleStudentInfo(student_id);
		if(student==null)
		{
			return null;
		}
		for(Course course:student.getCourses())
		{
			if(course.getId().equals(course_id))
			{
				return course.getSteps();
			}
		}
		return null;
	}
}
