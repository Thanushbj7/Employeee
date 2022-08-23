package com.employeeapp.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.employeeapp.model.Course;
import com.employeeapp.model.Employee;
@Repository
public interface ICourseRepositary extends JpaRepository<Course,Integer>{
	@Query("from Course c inner join c.employee e where e.city=?1")
	List<Course> findByCity(String city);
	
	@Query("from Course c inner join c.employee e where e.name=?1")
	List<Employee> findByCourseCategory(String category);
	
	List<Course> findByCategory(String category);
}
