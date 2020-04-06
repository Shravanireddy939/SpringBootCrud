package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {

	String createEmployee(Employee emp);

	Employee findEmployee(Integer empId);

	List<Employee> findAllEmployee();

	List<Employee> findEmpByName(String empName);

	String updateEmployee(Employee emp);

	String deleteEmpById(Integer empId);
	
	List<Employee>GreaterThan100();
	}
