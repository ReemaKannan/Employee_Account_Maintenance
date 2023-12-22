package com.optimum.employee.EmployeeMaster.service;


import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.optimum.employee.EmployeeMaster.entity.EmployeeMaster;
import com.optimum.employee.EmployeeMaster.repository.EmployeeMasterRepository;

@Transactional
@Service
public class EmployeeMasterService {
	@Autowired
	EmployeeMasterRepository employeeMasterRepository;

	public EmployeeMaster createEmployee(EmployeeMaster employeeMaster) {
		// TODO Auto-generated method stub
		return employeeMasterRepository.save(employeeMaster);
	}

	public void delete(Integer empid) {
		employeeMasterRepository.deleteByEmpid(empid);
	 }

	public EmployeeMaster updateEmployee(EmployeeMaster employeeMaster) {
		// TODO Auto-generated method stub
		return employeeMasterRepository.save(employeeMaster);
	}

	public Iterable<EmployeeMaster> getEmployee() {
		// TODO Auto-generated method stub
		return employeeMasterRepository.findAll();
	}

	


	public EmployeeMaster save(EmployeeMaster updateEmployee) {
		return employeeMasterRepository.save(updateEmployee);
		
	}

	public EmployeeMaster getEmployeeById(int empid) {
		// TODO Auto-generated method stub
		Optional<EmployeeMaster> optional=employeeMasterRepository.findById(empid);
		return optional.get();
	}
}


	
   
	





