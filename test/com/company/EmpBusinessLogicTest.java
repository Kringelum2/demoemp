package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmpBusinessLogicTest {
    //arrange
    EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
    EmployeeDetails employee = new EmployeeDetails();


    @Test
    void calculateYearlySalary() {
        employee.setMonthlySalary(10000);

        double salary = empBusinessLogic.calculateYearlySalary(employee);

        assertEquals(120000, salary, 0.0001);
    }

    @Test
    void calculateAppraisal() {
        employee.setMonthlySalary(20000);

        double appraisal = empBusinessLogic.calculateAppraisal(employee);

        assertEquals(500, appraisal, 0.0001);

    }

    @Test
    void calculatePension() {
        employee.setAge(35);
        employee.setMonthlySalary(100);

        double pension = empBusinessLogic.calculatePension(employee);

        assertEquals(1320, pension, 0.0001);
    }
}