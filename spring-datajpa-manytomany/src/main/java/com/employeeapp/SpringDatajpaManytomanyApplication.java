package com.employeeapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employeeapp.model.Course;
import com.employeeapp.model.Employee;
import com.employeeapp.service.ICourseService;
import com.employeeapp.service.IEmployeeService;

@SpringBootApplication
public class SpringDatajpaManytomanyApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaManytomanyApplication.class, args);
	}
	@Autowired
	IEmployeeService employeeService;
	public void setEmployeeService(IEmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	ICourseService courseService;
	@Autowired
	public void setCourseService(ICourseService courseService) {
		this.courseService = courseService;
	}
	
	@Override
	public void run(String... args) throws Exception {
		Employee employee=new Employee("Rahul","Banglore","Digital");
         Course jcourse=courseService.getById(100);
         Course pcourse=courseService.getById(101);
//         Course mcourse=new Course("Machine learning",779,"Full Stack");
         Set<Course> course=new HashSet<>(Arrays.asList(jcourse,pcourse));
         employee.setCourse(course);
         
        
	}
	

}
