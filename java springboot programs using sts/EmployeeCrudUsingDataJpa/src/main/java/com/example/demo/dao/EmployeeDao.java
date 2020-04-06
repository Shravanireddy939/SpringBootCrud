package com.example.demo.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;
 
@Repository
public interface EmployeeDao  extends JpaRepository<Employee, Integer> {
	//Employee findEmpByName(String empName);}
	@Query("select * from Employee where ename=?1")
	List<Employee>findEmpByName(@Param("C") String empName);
	
	@Query ("select ename,esal from Employee where esal>100")
	List<Employee>GreaterThan100();
	}
