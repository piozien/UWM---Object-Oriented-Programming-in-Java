package rekord.zad2;

public class TestPerson {
    public static void main(String[] args) {
        Address a1 = new Address("Street1", 10,"10-000","City1");
        Person p1 = new Person("Test-Name", "TestLName",a1);
        System.out.println(a1);
        System.out.println(p1);
        Address a2 = new Address(new String("Street1"), 10,"10-000","City1");
        Address a3 = new Address(null,11,"10-001", "City2");
        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));
        Person p2 = new Person("Test-Name", "TestLName",a2);
        System.out.println(p1.equals(p2));
    }
}
