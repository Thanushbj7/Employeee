package com.employeeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeapp.model.Course;
import com.employeeapp.repositary.ICourseRepositary;
@Service
public class CourseServiceImpl implements ICourseService{
	@Autowired
	ICourseRepositary courseRepositary;
	public void setCourseRepositary(ICourseRepositary courseRepositary) {
		this.courseRepositary = courseRepositary;
	}
	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		return courseRepositary.save(course);
	}

	

	@Override
	public void updateCourse(Course course) {
		courseRepositary.save(course);
		
	}

	@Override
	public void deleteCourse(int courseId) {
		courseRepositary.deleteById(courseId);
		
	}

	@Override
	public List<Course> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course getById(int courseId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getByEmployee(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

}
