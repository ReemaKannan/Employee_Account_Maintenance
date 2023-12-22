package com.optimum.employee.EmployeeMaster.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.optimum.employee.EmployeeMaster.entity.EmployeeMaster;
import com.optimum.employee.EmployeeMaster.service.EmployeeMasterService;


@CrossOrigin("*")
@RestController
@RequestMapping("/employeemaster")

public class EmployeeMasterController {
	@Autowired
	EmployeeMasterService employeeMasterService;
	
	@PostMapping(value="/post")
	public ResponseEntity<?> createEmployee(@RequestBody EmployeeMaster employeeMaster)
	{
		EmployeeMaster add=employeeMasterService.createEmployee(employeeMaster);
		return new ResponseEntity<EmployeeMaster>(add,HttpStatus.CREATED);
	}
	

	@DeleteMapping(value="/delete/{empid}")
	public void delete(@PathVariable ("empid") Integer empid)
	{
		employeeMasterService.delete(empid);
	}
	
	@PutMapping(value="/update")
	public EmployeeMaster updateEmployee(@RequestBody EmployeeMaster employeeMaster) {
		// TODO Auto-generated method stub
		return employeeMasterService.updateEmployee(employeeMaster);
	}
	
	@GetMapping(value="/get")
	public Iterable<EmployeeMaster> getEmployee(){
		return employeeMasterService.getEmployee();
	}
	
	
	@GetMapping("{empid}")
	public ResponseEntity<EmployeeMaster> getEmployeeById (@PathVariable("empid") int empid){
		EmployeeMaster employeemaster=employeeMasterService.getEmployeeById(empid);
		return new ResponseEntity<>(employeemaster, HttpStatus.OK);
	}
	
	@PutMapping("{empid}")
	public ResponseEntity<EmployeeMaster> updateEmployeeById (@PathVariable int empid,@RequestBody EmployeeMaster employeemaster){
		EmployeeMaster getEmp=employeeMasterService.getEmployeeById(empid);
		getEmp.setFirstname(employeemaster.getFirstname());
		getEmp.setLastname(employeemaster.getLastname());
		getEmp.setContact(employeemaster.getContact());
		getEmp.setMailid(employeemaster.getMailid());
		getEmp.setExperience(employeemaster.getExperience());
		getEmp.setCertification(employeemaster.getCertification());
		getEmp.setDesignation(employeemaster.getDesignation());


		EmployeeMaster updateEmp=employeeMasterService.save(employeemaster);
		return new ResponseEntity<>(updateEmp, HttpStatus.OK);
	}
}
	
	
	
	
	
