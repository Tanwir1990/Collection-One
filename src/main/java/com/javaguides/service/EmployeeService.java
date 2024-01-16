package com.javaguides.service;

import com.javaguides.entities.EmployeeEntity;

import java.util.List;

public interface EmployeeService {

    public List<EmployeeEntity> getAllEmployee();

    public EmployeeEntity getEmployeeById();

    public List<EmployeeEntity> getEmployeeByName();

    public List<EmployeeEntity> getEmployeeByEmail();
}
