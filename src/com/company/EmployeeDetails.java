package com.company;

public class EmployeeDetails {
    //att
    private String name;
    private double monthlySalary;
    private int age;

    //name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //monthly salary
    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    //age
    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
