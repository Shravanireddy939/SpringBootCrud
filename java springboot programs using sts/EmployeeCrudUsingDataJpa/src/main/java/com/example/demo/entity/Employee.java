package com.example.demo.entity;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Table;
import javax.persistence.*;

@Entity
@Table(name="emptable6")

public class Employee {
@Id
@GeneratedValue
@Column(length=10)
private int eid;
@Column(length=10)
private String ename;
@Column(length=10)
private int esal;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getEsal() {
	return esal;
}
public void setEsal(int esal) {
	this.esal = esal;
}
public Employee(int eid, String ename, int esal) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.esal = esal;
}
public Employee() {
     }


}

