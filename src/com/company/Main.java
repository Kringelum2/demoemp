package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
        EmployeeDetails employee = new EmployeeDetails();

        //data
        employee.setName("Tue");
        employee.setAge(25);
        employee.setMonthlySalary(45000);

        //business logic
        double salary = empBusinessLogic.calculateYearlySalary(employee);
        double appraisal = empBusinessLogic.calculateAppraisal(employee);

        //print
        System.out.printf("%s har en månedlig løn på %,.0f hvilket giver en årlig løn på %,.0f. Tilæg er på %,.0f",
                employee.getName(),employee.getMonthlySalary(), salary, appraisal);

    }
}
