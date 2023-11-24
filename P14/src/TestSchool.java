import education.*;

public class TestSchool {
    public static void main(String[] args) {
        School s1 = new School("WMII", null, -10);
        University u1 = new University("WMII", null, -10, "", -5);
        School s2 = new School(null,"test", 480);
        University u2 = new University(null,"test",480,"test_type",12);
        System.out.println(s1.toString());
        System.out.println(u1.toString());
        System.out.println(s2.toString());
        System.out.println(u2.toString());
        System.out.println(s1.hashCode());
        System.out.println(u1.hashCode());
        System.out.println("s1 equals u1 : " + s1.equals(u1));
        System.out.println("s2 equals u2 : " + s2.equals(u2));
        System.out.println("u1 equals s1 : " + u1.equals(s1));
        System.out.println("u2 equals s2 : " + u2.equals(s2));
        System.out.println("s1 equals s1 : " + s1.equals(s1));
        s1.recruitment(100);
        s2.recruitment(400);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        u2.recruitment(19);
        System.out.println(u2.toString());
    }
}
