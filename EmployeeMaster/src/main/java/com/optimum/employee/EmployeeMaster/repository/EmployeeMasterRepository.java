package com.optimum.employee.EmployeeMaster.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.optimum.employee.EmployeeMaster.entity.EmployeeMaster;

@Repository
public interface EmployeeMasterRepository extends JpaRepository<EmployeeMaster,Integer>{


	void deleteByEmpid(Integer empid);







}
