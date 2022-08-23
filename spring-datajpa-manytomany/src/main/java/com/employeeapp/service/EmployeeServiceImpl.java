package com.employeeapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employeeapp.model.Employee;
import com.employeeapp.repositary.IEmployeeRepositary;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	IEmployeeRepositary employeeRepositary;
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepositary.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepositary.save(employee);

	}

	@Override
	public void deleteEmployee(int employeeId) {
		employeeRepositary.deleteById(employeeId);

	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getById(int employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getByCity(String city) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getByCourseName(String courseName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getByCourseCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

}
