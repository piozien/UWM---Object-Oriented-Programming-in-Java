package pl.people.zad1;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("First");
        Person p2 = new Person("Second");
        Person p3 = new Person("Third");
        System.out.println("Number of instances: " + Person.getCounter());
    }
}
