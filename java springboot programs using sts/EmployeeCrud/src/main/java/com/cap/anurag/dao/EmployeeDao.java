package com.cap.anurag.dao;

import java.util.List;

import com.cap.anurag.entity.Employee;

public interface EmployeeDao {

	String save(Employee emp);

	Employee findById(Integer empId);

	List<Employee> findAllEmp();

	String deleteById(Integer empId);

	String updateEmployee(Employee emp);

}
