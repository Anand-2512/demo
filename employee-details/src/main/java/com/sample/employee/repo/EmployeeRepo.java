package com.sample.employee.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.employee.repo.model.EmployeeEntity;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer>{

	
	

}
