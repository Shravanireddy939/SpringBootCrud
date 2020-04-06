package com.cap.anurag.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.anurag.dao.EmployeeDao;
import com.cap.anurag.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDao empDao;

	@Override
	public String createEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return empDao.save(emp);
	}

	@Override
	public Employee findEmployee(Integer empId) {
		// TODO Auto-generated method stub
		return empDao.findById(empId);
	}

	@Override
	public List<Employee> findAllEmployee() {
		// TODO Auto-generated method stub
		return empDao.findAllEmp();
	}

	@Override
	public String updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return empDao.updateEmployee(emp);
		 
				 }

	@Override
	public String deleteEmpById(Integer empId) {
		// TODO Auto-generated method stub
		return empDao.deleteById(empId);
	}



}
