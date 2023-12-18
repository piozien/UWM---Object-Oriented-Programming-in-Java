package Kopiowanie_obiektów.zad1;

public class Student implements Cloneable{
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " name= " + name  +
                ", age= " + age +
                ", grade= " + grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }
}
