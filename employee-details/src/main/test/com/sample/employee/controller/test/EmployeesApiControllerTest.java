package com.sample.employee.controller.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.sample.employee.controller.impl.EmployeesApiController;
import com.sample.employee.model.EmployeeDetails;
import com.sample.employee.service.EmployeeService;


@RunWith(MockitoJUnitRunner.class)
public class EmployeesApiControllerTest {

	@Mock
	EmployeeService employeeService;
	
	@InjectMocks
	EmployeesApiController apiController;
	
	EmployeeDetails employeeDetails; 
	List<EmployeeDetails> employeeList;
	
	@Test
	public void employeeRegistration() {
		employeeDetails= new EmployeeDetails();
		employeeDetails.setFirstName("Anand");
		Mockito.doNothing().when(employeeService).createEmployeeRegistration(employeeDetails);
		apiController.addEmloyee(employeeDetails);
		assertEquals("Anand", employeeDetails.getFirstName());
	}
	
	
	@Test
	public void findAllemployeeRegistration() {
		employeeList = new ArrayList<EmployeeDetails>();
		employeeDetails= new EmployeeDetails();
		employeeDetails.setFirstName("Anand");
		employeeList.add(employeeDetails);
		Mockito.doReturn(employeeList).when(employeeService).getAllEmployees();
		ResponseEntity<List<EmployeeDetails>> response = apiController.getEmployees();
		assertEquals("Anand", response.getBody().get(0).getFirstName());
	}
}
