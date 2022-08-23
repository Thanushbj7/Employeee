package com.employeeapp.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
@Entity
public class Course {
	@Id
	@GeneratedValue(generator="employee_gen",strategy=GenerationType.AUTO)
	@SequenceGenerator(name="employee_gen",sequenceName="employee_sequence",initialValue = 100,allocationSize=1)
	private Integer courseId;
	@Column(name="coursename",length=20)
	private String courseName;
	@Column(length=20)
	private int duration;
	@Column(length=20)
	private String category;
	@ManyToMany(fetch=FetchType.EAGER,mappedBy="course")
	private Set<Employee> employee;
	
	public Course(String courseName, int duration, String category) {
		super();
		this.courseName = courseName;
		this.duration = duration;
		this.category = category;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Set<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration + ", category="
				+ category + "]";
	}
	
}
