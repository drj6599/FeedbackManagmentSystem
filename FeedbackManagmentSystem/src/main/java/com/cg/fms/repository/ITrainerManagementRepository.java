package com.cg.fms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.fms.entites.Employee;
@Repository
public interface ITrainerManagementRepository extends JpaRepository<Employee, Integer> {

	public Employee addTrainer(Employee emp);
    public Employee updateTrainer(Employee emp);
    public Employee removeTrainer(Employee emp);
    public Employee viewTrainer(Employee emp);
    
    @Query("SELECT * FROM Employee e WHERE e.skills=skill")
    public List<Employee> viewAllTrainers(String skill);
    public List<Employee> viewAllTrainers();

}
