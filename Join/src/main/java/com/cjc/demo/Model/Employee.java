package com.cjc.demo.Model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	
	@Id
	private int id;
	private String empname;
	private String empaddress;
	private String mobileno;
	@OneToOne(cascade=CascadeType.ALL)
	 private Department department;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
}
