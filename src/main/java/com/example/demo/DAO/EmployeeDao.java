package com.example.demo.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.MODEL.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer>{

}
