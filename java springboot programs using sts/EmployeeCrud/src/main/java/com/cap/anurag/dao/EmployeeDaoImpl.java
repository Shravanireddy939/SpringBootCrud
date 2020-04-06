package com.cap.anurag.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cap.anurag.entity.Employee;
@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao{

	 @PersistenceContext
	    private EntityManager em;
	 
	@Override
	public String save(Employee emp) {
		// TODO Auto-generated method stub
        em.persist(emp);
        return "Employee Registered Successfully !!!!..." ;
		
	}

	@Override
	public Employee findById(Integer empId) {
		// TODO Auto-generated method stub
		return em.find(Employee.class, empId);
		 }

	@Override
	public List<Employee> findAllEmp() {
		// TODO Auto-generated method stub
		Query q=em.createQuery("select a from Employee a");
		@SuppressWarnings("unchecked")
		List<Employee> l= q.getResultList();
		return l;
	}

	@Override
	public String updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		 em.merge(emp);
		 return "Updated Succesfully";
	
	}

	@Override
	public String deleteById(Integer empId) {
		// TODO Auto-generated method stub
		 Employee emp=em.find(Employee.class, empId);
	  em.remove(emp);
	  return "Deleted Successfully";
		 }

	

}
