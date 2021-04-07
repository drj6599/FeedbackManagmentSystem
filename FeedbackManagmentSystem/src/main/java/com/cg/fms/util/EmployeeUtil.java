package com.cg.fms.util;
import java.util.ArrayList;
import java.util.List;
import com.cg.fms.dto.*;
import com.cg.fms.entites.*;

public class EmployeeUtil {
	

	public static EmployeeDto toDto(Employee emp) {
		EmployeeDto empdto = new EmployeeDto();
		empdto.setEmployeeId(emp.getEmployeeId());
		empdto.setEmpName(emp.getEmpName());
		empdto.setPassword(emp.getPassword());
		empdto.setRole(emp.getRole());
		return empdto;
	}

	public static Employee toEntity(EmployeeDto empdto) {
		Employee emp = new Employee();
		emp.setEmployeeId(empdto.getEmployeeId());
		emp.setEmpName(empdto.getEmpName());
		emp.setPassword(empdto.getPassword());
		emp.setRole(empdto.getRole());
		return emp;
	}

	public static List<EmployeeDto> toDtoList(List<Employee> emps) {
		List<EmployeeDto> dtolist = new ArrayList<EmployeeDto>();
		for (Employee emp : emps) {
			dtolist.add(toDto(emp));
		}
		return dtolist;
	}
	
	
}
