package com.sample.employee.service;

import java.util.List;

import com.sample.employee.model.EmployeeDetails;

public interface EmployeeService {

	List<EmployeeDetails> getAllEmployees();

	void createEmployeeRegistration(EmployeeDetails body);

}
