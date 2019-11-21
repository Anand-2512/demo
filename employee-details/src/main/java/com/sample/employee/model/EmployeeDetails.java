package com.sample.employee.model;

import java.util.Objects;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * EmployeeDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-11-21T05:47:53.676Z")

public class EmployeeDetails {

	@NotNull
	@JsonProperty("First Name")
	private String firstName;

	@NotNull
	@JsonProperty("Last Name")
	private String lastName;

	@NotNull
	@JsonProperty("Gender")
	private String gender;

	@NotNull
	@JsonProperty("DateOfBirth")
	private String dateOfBirth;

	@NotNull
	@JsonProperty("Department")
	private String department;

	public EmployeeDetails firstName(String firstName) {
		this.firstName = firstName;
		return this;
	}

	/**
	 * Get firstName
	 * 
	 * @return firstName
	 **/
	@ApiModelProperty(value = "")

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public EmployeeDetails lastName(String lastName) {
		this.lastName = lastName;
		return this;
	}

	/**
	 * Get lastName
	 * 
	 * @return lastName
	 **/
	@ApiModelProperty(value = "")

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public EmployeeDetails gender(String gender) {
		this.gender = gender;
		return this;
	}

	/**
	 * Get gender
	 * 
	 * @return gender
	 **/
	@ApiModelProperty(value = "")

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public EmployeeDetails dateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
		return this;
	}

	/**
	 * Get dateOfBirth
	 * 
	 * @return dateOfBirth
	 **/
	@ApiModelProperty(value = "")

	@Valid

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public EmployeeDetails department(String department) {
		this.department = department;
		return this;
	}

	/**
	 * Order Status
	 * 
	 * @return department
	 **/
	@ApiModelProperty(value = "Order Status")

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		EmployeeDetails employeeDetails = (EmployeeDetails) o;
		return Objects.equals(this.firstName, employeeDetails.firstName)
				&& Objects.equals(this.lastName, employeeDetails.lastName)
				&& Objects.equals(this.gender, employeeDetails.gender)
				&& Objects.equals(this.dateOfBirth, employeeDetails.dateOfBirth)
				&& Objects.equals(this.department, employeeDetails.department);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, gender, dateOfBirth, department);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class EmployeeDetails {\n");

		sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
		sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
		sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
		sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
		sb.append("    department: ").append(toIndentedString(department)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
