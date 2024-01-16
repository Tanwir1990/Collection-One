package com.javaguides.service;

import com.javaguides.dao.EmployeeDAO;
import com.javaguides.dao.EmployeeDAOImpl;
import com.javaguides.entities.EmployeeEntity;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{
   private static EmployeeDAO employeeDAO;
    public EmployeeServiceImpl(){
        super();
        employeeDAO=new EmployeeDAOImpl();
    }
    @Override
    public List<EmployeeEntity> getAllEmployee() {
        return employeeDAO.findAllEmployee();
    }

    @Override
    public EmployeeEntity getEmployeeById() {
        return null;
    }

    @Override
    public List<EmployeeEntity> getEmployeeByName() {
        return null;
    }

    @Override
    public List<EmployeeEntity> getEmployeeByEmail() {
        return null;
    }
}
