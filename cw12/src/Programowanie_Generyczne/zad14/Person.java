package Programowanie_Generyczne.zad14;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name == null || name.isEmpty() ? "default": name;
        this.age = age < 0 ? 0 : age;
    }
    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " name: " + name +", age: " + age + ".";
    }
}

