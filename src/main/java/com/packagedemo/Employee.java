package com.packagedemo;

public class Employee {
    private int id;
    private int daysWorked;
    private int salaryPerDay;
    public Employee(int id, int daysWorked, int salaryPerDay) {
        this.id = id;
        this.daysWorked = daysWorked;
        this.salaryPerDay = salaryPerDay;
    }

    public int getSalaryPerMonthy() {
        return daysWorked*salaryPerDay;
    }
}
