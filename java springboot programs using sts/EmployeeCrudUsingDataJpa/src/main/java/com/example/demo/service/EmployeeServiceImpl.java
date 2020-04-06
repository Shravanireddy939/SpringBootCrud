package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao empDao;

	@Override
	public String createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		 empDao.save(emp);
		 return "Employee has been Created";
	}

	@Override
	public Employee findEmployee(Integer empId) {
		// TODO Auto-generated method stub
		return empDao.findOne(empId);
	}

	@Override
	public List<Employee> findAllEmployee() {
		// TODO Auto-generated method stub
		List<Employee> employees=empDao.findAll();
				return employees;
	}

	@Override
	public List<Employee> findEmpByName(String empName) {
		// TODO Auto-generated method stub
		return empDao.findEmpByName(empName);
	}

	@Override
	public String updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		boolean result=empDao.exists(emp.getEid());
		if(result) {
			empDao.save(emp);
			return "Employee Updated Successfully";
					}
		else {
			empDao.save(emp);
			return "New Employee is Inserted";
		}
		
	}

	@Override
	public String deleteEmpById(Integer empId) {
		// TODO Auto-generated method stub
		boolean result=empDao.exists(empId);
		if(result) {
			empDao.delete(empId);
			return "Deleted Successfully";
					}
		else {
				return "Employee doesn'nt exits";
		}
	}

	@Override
	public List<Employee> GreaterThan100() {
		// TODO Auto-generated method stub
		return empDao.GreaterThan100();
	}
	


}