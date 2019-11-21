package com.sample.employee.repo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class EmployeeEntity {

	@Id
	@Column
	private String first_name;
	@Column
	private String last_name;
	@Column
	private String gender;
	@Column
	private String department;
	@Column
	private String birthdate;

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDateOfBirth() {
		return birthdate;
	}

	public void setDateOfBirth(String birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [ first_name=" + first_name + ", last_name=" + last_name + ", gender=" + gender
				+ ", department=" + department + ", dateOfBirth=" + birthdate + "]";
	}

}
