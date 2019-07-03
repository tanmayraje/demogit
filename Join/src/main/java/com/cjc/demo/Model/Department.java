package com.cjc.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {

	@Id
	private int id;
	private String deptname;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
