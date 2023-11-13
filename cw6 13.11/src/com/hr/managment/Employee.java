package com.hr.managment;

public class Employee {
    private int workHours;

    public Employee(int workHours) {
        this.workHours = (0 <= workHours && workHours <= 60) ? workHours : 40;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        if (workHours >= 0 && workHours <= 60) {
            this.workHours = workHours;
        }
    }
}
