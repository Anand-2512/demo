package com.sample.employee.service.impl.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.dao.DataRetrievalFailureException;

import com.sample.employee.model.EmployeeDetails;
import com.sample.employee.repo.EmployeeRepo;
import com.sample.employee.repo.model.EmployeeEntity;
import com.sample.employee.service.impl.EmployeeServiceImpl;
import com.sample.employee.util.Util;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceImplTest {

	@InjectMocks
	EmployeeServiceImpl employeeServiceImpl;

	@Mock
	private EmployeeRepo employeeRepo;

	EmployeeDetails employeeDetails;
	List<EmployeeDetails> employeeList;
	EmployeeEntity entity;
	List<EmployeeEntity> entityResponse;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		entityResponse = new ArrayList<EmployeeEntity>();
		entity = new EmployeeEntity();
		entity.setFirst_name("Anand");
		entity.setDateOfBirth("12-07-1993");
		entity.setDepartment("Software");
		entity.setGender("Male");
		entity.setLast_name("Tiwari");
		entityResponse.add(entity);
		employeeList = new ArrayList<EmployeeDetails>();
		employeeDetails = new EmployeeDetails();
		employeeDetails.setFirstName("Anand");
		employeeDetails.setDateOfBirth("12-07-1993");
		employeeDetails.setDepartment("Software");
		employeeDetails.setGender("Male");
		employeeDetails.setLastName("Tiwari");
		employeeList.add(employeeDetails);
	}

	@Test
	public void getAllEmployeesTest() throws Exception {
		employeeList = Util.mapEntity(entityResponse);
		Mockito.doReturn(entityResponse).when(employeeRepo).findAll();
		List<EmployeeDetails> response = employeeServiceImpl.getAllEmployees();
		Mockito.verify(employeeRepo).findAll();
		assertEquals("Anand", response.get(0).getFirstName());
	}

	@Test
	public void createEmployeeRegistrationTest() throws Exception {
		employeeServiceImpl.createEmployeeRegistration(employeeDetails);
	}

	@Test(expected = DataRetrievalFailureException.class)
	public void getAllEmployeesTestException() throws Exception {
		Mockito.doThrow(new DataRetrievalFailureException("")).when(employeeRepo).findAll();
		List<EmployeeDetails> response = employeeServiceImpl.getAllEmployees();
		assertEquals("Anand", response.get(0).getFirstName());
	}
}
