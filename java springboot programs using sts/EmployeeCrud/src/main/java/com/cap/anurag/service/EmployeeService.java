package com.cap.anurag.service;

import java.util.List;

import com.cap.anurag.entity.Employee;

public interface EmployeeService {

	String createEmployee(Employee emp);

	Employee findEmployee(Integer empId);

	List<Employee> findAllEmployee();

	String updateEmployee(Employee emp);

	String deleteEmpById(Integer empId);

}
