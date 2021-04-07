package com.cg.fms.service;

import com.cg.fms.dto.*;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.cg.fms.entites.Employee;
import com.cg.fms.exception.EmployeeNotFoundException;
import com.cg.fms.repository.ITrainerManagementRepository;
import com.cg.fms.util.EmployeeUtil;

public class ITrainerManagementService {
	@Autowired
	ITrainerManagementRepository repo;

	public EmployeeDto getEmployee(int id) throws EmployeeNotFoundException {
		Optional<Employee> empOpt = repo.findById(id);
		if (empOpt.isPresent()) {
			Employee emp = empOpt.get();
			return EmployeeUtil.toDto(emp);
		} else {
			throw new EmployeeNotFoundException("Employee with id " + id + " Not Found");
		}
	}

	public EmployeeDto addTrainer(EmployeeDto empdto) {
		Employee emp = EmployeeUtil.toEntity(empdto);
		Employee empsaved = repo.save(emp);
		return EmployeeUtil.toDto(empsaved);

	}

	public EmployeeDto updateTrainer(EmployeeDto empdto) {
		Employee emp = EmployeeUtil.toEntity(empdto);
		Employee empsaved = repo.save(emp);
		return EmployeeUtil.toDto(empsaved);

	}

	public EmployeeDto removeTrainer(Employee emp) throws EmployeeNotFoundException {
		int id = emp.getEmployeeId();
		EmployeeDto empdto = getEmployee(id);
		if (id != 0) {
			repo.delete(emp);
			return empdto;
		} else {
			throw new EmployeeNotFoundException("Employee doesn't Exist");
		}

	}

	public EmployeeDto viewTrainer(Employee emp) {

		EmployeeDto empdto = EmployeeUtil.toDto(emp);
		System.out.println(empdto);
		return empdto;
	}

	public List<Employee> viewAllTrainers(String skill) throws EmployeeNotFoundException {
		List<Employee> employees = repo.viewAllTrainers(skill);
		if (employees.isEmpty()) {
			throw new EmployeeNotFoundException("Employee with these skills doesn't exist");
		} else {
			return employees;
		}
	}

	public List<EmployeeDto> viewAllTrainers() {

		List<Employee> emps = repo.findAll();
		List<EmployeeDto> trainerlist = EmployeeUtil.toDtoList(emps);
		return trainerlist;

	}

}
