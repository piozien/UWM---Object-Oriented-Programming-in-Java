package Kopiowanie_obiektów.zad17;

import Kopiowanie_obiektów.zad19.Car;

public class Developer implements Cloneable {
    private String name;
    private int age;
    private double salary;

    public Developer(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " name: " + name + ", age: " + age + ", salary: " + salary + ".";
    }

    @Override
    public Developer clone() throws CloneNotSupportedException{
        Developer temp = (Developer) super.clone();
        return temp;

    }

}
