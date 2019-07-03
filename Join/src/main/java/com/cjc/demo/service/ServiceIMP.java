package com.cjc.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.demo.Model.Employee;
import com.cjc.demo.Model.EmployeeDTO;
import com.cjc.demo.Repository.EmployeeRepository;

@Service
public class ServiceIMP implements serviceI{

	@Autowired
	EmployeeRepository empr;
	
	
	@Override
	public List<EmployeeDTO> getdata() {
		
		return  empr.fetchdata();
	}


	@Override
	public void savedata(Employee e) {
		
		empr.save(e);
		
	}


	@Override
	public List<Employee> deletedata(int id) {
	
		
		 empr.deleteById(id);
		
		return null;
	}


	


	
	
	
	
	
	

}
