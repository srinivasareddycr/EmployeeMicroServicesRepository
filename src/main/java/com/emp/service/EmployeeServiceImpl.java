package com.emp.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

//import org.springframework.beans.factory.annotation.Autowired;

import com.emp.model.Employee;
@Service
public class EmployeeServiceImpl  implements IEmployeeService{

	
	//@Autowired
	//Employee employee;
	
	List<Employee> list = List.of( 
			new Employee(112L,"TonyStark","5676654"),
			new Employee(113L,"thor","5676656"),
			new Employee(114L,"steve rogers","5676655"),
			new Employee(115L,"natasha","5676657"),
			new Employee(116L,"clint","5676658"),
			new Employee(117L,"suriya","5676659"),
			new Employee(118L,"sreeni","5676650"),
			new Employee(119L,"panther","5676651")
			
			);
	
//	ArrayList<Employee> ss = new ArrayList<Employee>();
//	Employee employee = new Employee(112L,"TonyStark","5676654");
//	ss.

	
	
	@Override
	public Employee getEmployee(Long id) {
		
		return list.stream().filter(employee -> employee.geteId().equals(id)).findAny().orElse(null);
	}


}
