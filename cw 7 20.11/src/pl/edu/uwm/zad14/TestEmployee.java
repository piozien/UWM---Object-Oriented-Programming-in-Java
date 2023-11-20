package pl.edu.uwm.zad14;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jan", "Kowalski", 1000);
        Employee e2 = new Employee("", "Kowalski", 1000);
        Employee e3 = new Employee(null, "Kowalski", 1000);
        Employee e4 = new Employee(new String("Jan"), "Kowalski", 100000);
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e4));
        System.out.println(e2.equals(e3));
        System.out.println(e1==e2);
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());
        System.out.println(e4.hashCode());
        Programmer p1 = new Programmer("Jan", "Kowalski", 1000, "Java");
        Programmer p2 = new Programmer("", "Kowalski", 1000, "Python");
        Programmer p3 = new Programmer(null, "Kowalski", 1000, "Python");
        Programmer p4 = new Programmer(new String("Jan"), "Kowalski", 1000, "Java");
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p4));
        System.out.println(p2.equals(p3));
        System.out.println(p1==p4);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p4.toString());
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p4.hashCode());


    }
}
