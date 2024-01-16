package com.javaguides.controller;

import com.javaguides.dto.EmployeeDTO;
import com.javaguides.entities.EmployeeEntity;
import com.javaguides.service.EmployeeService;
import com.javaguides.service.EmployeeServiceImpl;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeController {

    private static EmployeeService employeeService;

    public EmployeeController() {
        super();
        employeeService = new EmployeeServiceImpl();

    }

    public List<EmployeeDTO> getAllEmployee() {
        List<EmployeeEntity> employeeObtained = employeeService.getAllEmployee();
        ModelMapper modelMapper = new ModelMapper();
        return employeeObtained
                .stream()
                .map(emp -> modelMapper.map(emp, EmployeeDTO.class)).collect(Collectors.toList());
    }
}
