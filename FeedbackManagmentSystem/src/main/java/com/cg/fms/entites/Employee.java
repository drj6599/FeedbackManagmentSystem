package com.cg.fms.entites;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int employeeId;
	private String empName;
	private String password;
	private Role role;
	private Skills skills;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Skills getSkills() {
		return skills;
	}
	public void setSkills(Skills skills) {
		this.skills = skills;
	}
	public Employee(int employeeId, String empName, String password, Role role, Skills skills) {
		super();
		this.employeeId = employeeId;
		this.empName = empName;
		this.password = password;
		this.role = role;
		this.skills = skills;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
