package com.cg.fms.dto;

import org.springframework.stereotype.Component;

import com.cg.fms.entites.Role;
import com.cg.fms.entites.Skills;


@Component
public class EmployeeDto {
	
	private int employeeId;
	private String empName;
	private String password;
	private Role role;
	private Skills skills;
	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeDto(int employeeId, String empName, String password, Role role, Skills skills) {
		super();
		this.employeeId = employeeId;
		this.empName = empName;
		this.password = password;
		this.role = role;
		this.skills = skills;
	}
	@Override
	public String toString() {
		return "EmployeeDto [employeeId=" + employeeId + ", empName=" + empName + ", password=" + password + ", role="
				+ role + ", skills=" + skills + "]";
	}
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
	
}
