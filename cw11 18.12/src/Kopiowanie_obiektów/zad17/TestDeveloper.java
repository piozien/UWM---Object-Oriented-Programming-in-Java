package Kopiowanie_obiektów.zad17;

public class TestDeveloper {
    public static void main(String[] args) throws CloneNotSupportedException {
        Developer d1 = new Developer("Name", 30, 20.0);
        Developer d2 = d1.clone();
        SeniorDeveloper sd1 = new SeniorDeveloper("Name2", 40, 40.5, 20.1);
        SeniorDeveloper sd2 =  sd1.clone();
        System.out.println("Developer d1: " + d1.toString());
        System.out.println("Developer d2: " + d2.toString());
        System.out.println("Developer sd1: " + sd1.toString());
        System.out.println("Developer sd2: " + sd2.toString());
        System.out.println("After set salary or bonus:");
        d1.setSalary(100);
        sd2.setBonus(100);
        System.out.println("Developer d1: " + d1.toString());
        System.out.println("Developer d2: " + d2.toString());
        System.out.println("Developer sd1: " + sd1.toString());
        System.out.println("Developer sd2: " + sd2.toString());
    }
}
