package com.cjc.demo.Model;

public class EmployeeDTO {

	private String empname;
	private String deptname;
	
	
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	
	
	public EmployeeDTO(String empname, String deptname) {
	
		this.empname = empname;
		this.deptname = deptname;
	}
	
	
	
	
	
}
