package pl.edu.uwm.zad1;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName.isEmpty() ? "null" : null;
        this.lastName = lastName;
        this.age = (age < 0) ? 0 : age;
    }
}
