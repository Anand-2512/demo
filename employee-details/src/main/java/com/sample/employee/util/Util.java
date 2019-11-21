package com.sample.employee.util;

import java.util.ArrayList;
import java.util.List;

import com.sample.employee.model.EmployeeDetails;
import com.sample.employee.repo.model.EmployeeEntity;

public class Util {

	public static EmployeeEntity mapEmployeePojo(EmployeeDetails body) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setDateOfBirth(body.getDateOfBirth());
		employeeEntity.setDepartment(body.getDepartment());
		employeeEntity.setFirst_name(body.getFirstName());
		employeeEntity.setGender(body.getGender());
		employeeEntity.setLast_name(body.getLastName());
		return employeeEntity;
	}

	public static List<EmployeeDetails> mapEntity(List<EmployeeEntity> entityResponse) {
		List<EmployeeDetails> details = new ArrayList<EmployeeDetails>();
		entityResponse.stream().forEach(response -> {
			EmployeeDetails employeeDetails = new EmployeeDetails();
			employeeDetails.setDateOfBirth(response.getDateOfBirth());
			employeeDetails.setDepartment(response.getDepartment());
			employeeDetails.setFirstName(response.getFirst_name());
			employeeDetails.setGender(response.getGender());
			employeeDetails.setLastName(response.getLast_name());
			details.add(employeeDetails);
		});
		return details;
	}

}
