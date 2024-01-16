package com.javaguides.dao;

import com.javaguides.entities.EmployeeEntity;

import java.util.List;

public interface EmployeeDAO {

    public List<EmployeeEntity> findAllEmployee();

    public EmployeeEntity findEmployeeById();

    public List<EmployeeEntity> findEmployeeByName();

    public List<EmployeeEntity> findEmployeeByEmail();
}
