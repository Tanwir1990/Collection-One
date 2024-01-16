package com.javaguides.dao;

import com.javaguides.entities.EmployeeEntity;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    private static List<EmployeeEntity> getEmployeeFromDB() {
        List<EmployeeEntity> employees = new ArrayList<>();
        employees.add(new EmployeeEntity(1001L, "Tanwir Ahmad", "tanwir@gmail.com"));
        employees.add(new EmployeeEntity(1002L, "Sonu Shahi", "sonu@tia.com"));
        employees.add(new EmployeeEntity(1002L, "Allie Randy", "tanwir@gmail.com"));
        employees.add(new EmployeeEntity(1004L, "Jackson Xavier", "jackosn@glic.com"));
        employees.add(new EmployeeEntity(1005L, "Asraf Ali", "asraf@glic.com"));
        employees.add(new EmployeeEntity(1006L, "Imran Khan", "imran@tcs.com"));
        employees.add(new EmployeeEntity(1007L, "Mohan Gandhi", "mohan@outlook.com"));
        employees.add(new EmployeeEntity(1008L, "Rahul Singh", "rahul@gmail.com"));
        employees.add(new EmployeeEntity(1009L, "Jamie Andy", "jamie@tia.com"));
        employees.add(new EmployeeEntity(1020L, "Adam Shawn", "adam@yahoo.com"));
        return employees;
    }


    @Override
    public List<EmployeeEntity> findAllEmployee() {
        return EmployeeDAOImpl.getEmployeeFromDB();
    }

    @Override
    public EmployeeEntity findEmployeeById() {
        return null;
    }

    @Override
    public List<EmployeeEntity> findEmployeeByName() {
        return null;
    }

    @Override
    public List<EmployeeEntity> findEmployeeByEmail() {
        return null;
    }
}
