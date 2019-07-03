package com.cjc.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.cjc.demo.Model.Employee;
import com.cjc.demo.Model.EmployeeDTO;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {

	@Query("select new com.cjc.demo.Model.EmployeeDTO(e.empname,d.deptname)"+"from Employee e INNER JOIN e.department d ")
	
	public List<EmployeeDTO> fetchdata();

	
	public Employee findAllById(int id);
}
