package com.company;

public class EmpBusinessLogic {

    public double calculateYearlySalary(EmployeeDetails employeeDetails) {
        double yearlySalary;

        yearlySalary = employeeDetails.getMonthlySalary() * 12;
        return yearlySalary;
    }

    public double calculateAppraisal(EmployeeDetails employeeDetails) {
        double appraisal = 0;

        if (employeeDetails.getMonthlySalary() < 40000) {
            appraisal = 500;
        } else {
            appraisal = 1000;
        }

        return appraisal;
    }

    public double calculatePension(EmployeeDetails employee) {
        double pension;
        int age = employee.getAge();
        double pensionPercentage = -1;

        if (age == 25) {
            pensionPercentage = 1.0;
        } else if (age > 25 && age < 40) {
            pensionPercentage = 1.10;
        } else if (age >= 40) {
            pensionPercentage = 1.20;
        }

        pension = (calculateYearlySalary(employee) * pensionPercentage);

        return pension;
    }

}
