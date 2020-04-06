package com.cap.anurag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.*;

import com.cap.anurag.dao.EmployeeNotFoundException;
import com.cap.anurag.entity.Employee;
import com.cap.anurag.service.EmployeeService;


@RestController
@RequestMapping("/Bank")
@CrossOrigin("http://localhost:4211")
public class EmpRestController {

@Autowired
EmployeeService empService;
@PostMapping("/CreateAccount")
public String CreateAccount(@RequestBody Employee emp) {
	return empService.createEmployee(emp);
}
@GetMapping("/findById/{empId}")
public Employee findEmployeeById(@PathVariable Integer empId){
	Employee b= empService.findEmployee(empId);	
	 if (b == null) {
			throw new EmployeeNotFoundException(empId+" is not valid"
					+ "\nEnter Valid Employee Number");
		}
	  else
	  {
		System.out.println("Welcome");
	  return  b;
	  }
}

@GetMapping("/findAll")
public List<Employee> findAllEmployee(){
	return empService.findAllEmployee();
}

@PutMapping("/updateEmp")
public String updateEmp(@RequestBody Employee emp) {
	return empService.updateEmployee(emp);
}
@DeleteMapping("/deleteEmp/{empId}")
	public String deleteEmp(@PathVariable Integer empId) {
	String b= empService.deleteEmpById(empId);
		if (b == null) 
		{
			throw new EmployeeNotFoundException(empId+" is not valid"
					+ "\nEnter Valid Employee Number");
		}
	  else
	  {
		System.out.println("Welcome");
	  return  b;
	  }
				}
}
