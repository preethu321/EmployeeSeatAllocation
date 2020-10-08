package com.example.demo.MODEL;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name="employee")
@ApiModel(description = "Details about the employees")
public class Employee {
	 @Id
	 @GeneratedValue
	 @ApiModelProperty(notes = "The unique id")
     private Integer id;
	 @ApiModelProperty(notes = "The employees Code")
     private String employeecode;
	 @ApiModelProperty(notes = "The employees Name")
     private String employeename;
	 @ApiModelProperty(notes = "The employees Designation")
     private String employeedesign;
	 @ApiModelProperty(notes = "The employees Department")
     private String employeedept;
	 @ApiModelProperty(notes = "The employees Address")
     private String employeeaddress;
     
	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeecode=" + employeecode + ", employeename=" + employeename
				+ ", employeedesign=" + employeedesign + ", employeedept=" + employeedept + ", employeeaddress="
				+ employeeaddress + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmployeecode() {
		return employeecode;
	}
	public void setEmployeecode(String employeecode) {
		this.employeecode = employeecode;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getEmployeedesign() {
		return employeedesign;
	}
	public void setEmployeedesign(String employeedesign) {
		this.employeedesign = employeedesign;
	}
	public String getEmployeedept() {
		return employeedept;
	}
	public void setEmployeedept(String employeedept) {
		this.employeedept = employeedept;
	}
	public String getEmployeeaddress() {
		return employeeaddress;
	}
	public void setEmployeeaddress(String employeeaddress) {
		this.employeeaddress = employeeaddress;
	}
     
     
     
}
