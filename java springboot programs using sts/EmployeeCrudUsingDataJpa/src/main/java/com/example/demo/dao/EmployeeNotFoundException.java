package com.example.demo.dao;

@SuppressWarnings("serial")
public class EmployeeNotFoundException extends RuntimeException{
	public EmployeeNotFoundException(String msg){
        super(msg);
    }

    public EmployeeNotFoundException(String msg,Throwable e){
        super(msg,e);
    }
}
