package com.cg.fms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import com.cg.fms.dto.EmployeeDto;
import com.cg.fms.entites.Employee;
import com.cg.fms.exception.EmployeeNotFoundException;
import com.cg.fms.service.ITrainerManagementService;
import com.cg.fms.util.EmployeeUtil;

@RestController
@RequestMapping("api/v1/facultymanagementsystem")
public class EmployeeController {
	@Autowired
	ITrainerManagementService service;
     @PostMapping
	public ResponseEntity<EmployeeDto> addTrainer(@RequestBody EmployeeDto empdto) {
		return new ResponseEntity<EmployeeDto>(service.addTrainer(empdto), HttpStatus.OK);
	}
     @PutMapping
	public ResponseEntity<EmployeeDto> updateTrainer(@RequestBody EmployeeDto empdto) {
		return new ResponseEntity<EmployeeDto>(service.updateTrainer(empdto),HttpStatus.OK);
	}
     @DeleteMapping
	public ResponseEntity<EmployeeDto> removeTrainer(Employee emp) throws EmployeeNotFoundException {
		return new ResponseEntity<EmployeeDto>(service.removeTrainer(emp),HttpStatus.OK);
	}
     @GetMapping("{/Employee}")
	public ResponseEntity<EmployeeDto> viewTrainer(@PathVariable("{/Employee}") Employee emp) {
		return new ResponseEntity<EmployeeDto>(service.viewTrainer(emp),HttpStatus.OK);
	}
      @GetMapping("{/Skills}")
	public ResponseEntity<List<EmployeeDto>> viewAllTrainers(@PathVariable("{/Skills}") String skill) throws EmployeeNotFoundException {
		List<Employee> elist = service.viewAllTrainers(skill);
		List<EmployeeDto> dtolist = EmployeeUtil.toDtoList(elist);
		ResponseEntity<List<EmployeeDto>> response = new ResponseEntity<List<EmployeeDto>>(dtolist,HttpStatus.OK);
    	  return response;
	}
    @GetMapping
	ResponseEntity<List<EmployeeDto>> viewAllTrainers() {
    	List<EmployeeDto> elist = service.viewAllTrainers();
    	ResponseEntity<List<EmployeeDto>> response = new ResponseEntity<List<EmployeeDto>>(elist,HttpStatus.OK);
        return response;
	}

}
