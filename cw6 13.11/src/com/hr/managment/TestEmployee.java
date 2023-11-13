package com.hr.managment;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee(-10);
        Employee e2 = new Employee(50);
        Employee e3 = new Employee(80);
        System.out.println(e1.getWorkHours());
        System.out.println(e2.getWorkHours());
        System.out.println(e3.getWorkHours());
        System.out.println("-------------");
        e1.setWorkHours(33);
        e2.setWorkHours(-40);
        e3.setWorkHours(100);
        System.out.println(e1.getWorkHours());
        System.out.println(e2.getWorkHours());
        System.out.println(e3.getWorkHours());

    }



}
