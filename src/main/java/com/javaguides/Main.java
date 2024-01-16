package com.javaguides;


import com.javaguides.controller.EmployeeController;

public class Main {
    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>>>>>>>>>Main Started<<<<<<<<<<<<<<<<<<<<<");
        EmployeeController employeeController=new EmployeeController();
        employeeController.getAllEmployee().forEach(System.out::println);
    }
}