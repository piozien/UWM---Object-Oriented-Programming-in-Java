package pl.edu.uwm.zad21;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jan", "Kowalski", 1000.50);
        Employee e2 = new Employee("Jan", "Kowalski", 1000.50);
        Employee e3 = new Employee("Jan", "Nowak", 1000.50);
        Employee e4 = new Employee(null, "Kowalski", 1000.50);
        Employee e5 = new Employee(new String("Jan"), "Kowalski", 1000.50);
        System.out.println(e1.equals(e1));
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));
        System.out.println(e1.equals(e4));
        System.out.println(e1.equals(e5));
        System.out.println(e1.toString());
        Manager m1 = new Manager("Jan", "Kowalski", 1000.50, 100.5);
        Manager m2 = new Manager("Jan", "Kowalski", 1000.50, 100.5);
        Manager m3 = new Manager("Jan", "Nowak", 1000.50, 100.5);
        Manager m4 = new Manager(null, "Kowalski", 1000.50, 100.5);
        Manager m5 = new Manager(new String("Jan"), "Kowalski", 1000.50, 100.5);
        System.out.println(m1.equals(e1));
        System.out.println(e1.equals(m1));
        System.out.println(m1.equals(m1));
        System.out.println(m1.equals(m2));
        System.out.println(m1.equals(m3));
        System.out.println(m1.equals(m4));
        System.out.println(m1.equals(m5));
        System.out.println(m1.toString());
        Intern i1 = new Intern("Jan", "Kowalski", 1000.50, 1.5);
        Intern i2 = new Intern("Jan", "Kowalski", 1000.50, 1.5);
        Intern i3 = new Intern("Jan", "Nowak", 1000.50, 1.5);
        Intern i4 = new Intern("Jan", "Kowalski", 1000.50, 1.0);
        Intern i5 = new Intern(new String("Jan"), "Kowalski", 1000.50, 1.5);
        System.out.println(e1.equals(i1));
        System.out.println(i1.equals(e1));
        System.out.println(i1.equals(i2));
        System.out.println(i1.equals(i3));
        System.out.println(i1.equals(i4));
        System.out.println(i1.equals(i5));
        System.out.println(i1.toString());

    }
}
