import education.*;

public class TestSchool {
    public static void main(String[] args) {
        School s1 = new School("", "", -10);
        School s2 = new School("Politechnika", "Gdańsk", 499);
        System.out.println(s1.toString());
        System.out.println(s1.equals(s2));
        s1.recruitment(10);
        System.out.println(s1.toString());
        System.out.println("-------------------------------------------------------------------");
        University u1 = new University("", "", -10, "", -1);
        University u2 = new University("Uniwersytet", "Warszawa", 100, "agricultural", 20);
        System.out.println(u1.toString());
        System.out.println(u2.toString());
        System.out.println(u1.equals(u2));
        System.out.println(u1.equals(u1));
        u2.recruitment(5);
        u1.recruitment(10);
        System.out.println(u1.toString());
        System.out.println(u2.toString());
    }
}
