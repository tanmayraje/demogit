package com.cjc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.demo.Model.Employee;
import com.cjc.demo.Model.EmployeeDTO;
import com.cjc.demo.service.ServiceIMP;

@CrossOrigin("*")
@RestController
public class Homecontroller {

	@Autowired
	ServiceIMP sr;
	
	@RequestMapping(value="/getdata",method=RequestMethod.GET)
	public List<EmployeeDTO> getdata()
	{
		
		List<EmployeeDTO> list=sr.getdata(); 
		
		
		return list;
		
		
	}
	
	@RequestMapping(value="/savedata",method=RequestMethod.POST)
	public String savedata(@RequestBody Employee e)
	{
		sr.savedata(e);
		
		return "save successfully";
		
		
	}
	
	@RequestMapping(value="/deletedata/{id}",method=RequestMethod.DELETE)
	public String deletedata(@ModelAttribute Employee e, Model m)
	{
		
		List<Employee> list=(List<Employee>) sr.deletedata(e.getId());
		
		
		m.addAttribute("stu",list);
		
		return "delete successfully";
	}
}
