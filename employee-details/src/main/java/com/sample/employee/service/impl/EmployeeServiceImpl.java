package com.sample.employee.service.impl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataRetrievalFailureException;
import org.springframework.stereotype.Service;

import com.sample.employee.model.EmployeeDetails;
import com.sample.employee.repo.EmployeeRepo;
import com.sample.employee.repo.model.EmployeeEntity;
import com.sample.employee.service.EmployeeService;
import com.sample.employee.util.Util;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public List<EmployeeDetails> getAllEmployees() {
		List<EmployeeDetails> modelResponse = new ArrayList<EmployeeDetails>();
		List<EmployeeDetails> sortedResponse=null;
		try {
			List<EmployeeEntity> entityResponse = employeeRepo.findAll();
			modelResponse = Util.mapEntity(entityResponse);
			sortedResponse=modelResponse.stream().sorted((o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName())).collect(Collectors.toList()); 
		} catch (Exception accessException) {
			throw new DataRetrievalFailureException("not able to fetch employees records" + accessException.getMessage().toString());
		}
		return sortedResponse;
	}
 
	@Override
	public void createEmployeeRegistration(EmployeeDetails body) {
			EmployeeEntity entity = Util.mapEmployeePojo(body);
			employeeRepo.save(entity);
	} 

}
