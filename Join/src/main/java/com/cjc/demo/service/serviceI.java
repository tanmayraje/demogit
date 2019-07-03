package com.cjc.demo.service;

import java.util.List;

import com.cjc.demo.Model.Employee;
import com.cjc.demo.Model.EmployeeDTO;

public interface serviceI {
	
	
	
	public List<EmployeeDTO> getdata();

	
	public  void savedata(Employee e);

	public List<Employee> deletedata(int id);



}
