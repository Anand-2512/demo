package com.sample.employee.controller.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;

import com.sample.employee.controller.EmployeesApi;
import com.sample.employee.model.EmployeeDetails;
import com.sample.employee.service.EmployeeService;

import io.swagger.annotations.ApiParam;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-21T05:47:53.676Z")

@Controller
@CrossOrigin
public class EmployeesApiController implements EmployeesApi {

	@Autowired
	EmployeeService employeeService; 

	public ResponseEntity<Void> addEmloyee(
			@ApiParam(value = "Employee object that needs to be register", required = true) @Valid @RequestBody EmployeeDetails body) {
		employeeService.createEmployeeRegistration(body);
		return new ResponseEntity<Void>(HttpStatus.OK);
	} 

	public ResponseEntity<List<EmployeeDetails>> getEmployees() {
		List<EmployeeDetails> response = null;
		response = employeeService.getAllEmployees();
		return new ResponseEntity<List<EmployeeDetails>>(response, HttpStatus.OK);
	}

}
