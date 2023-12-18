package Kopiowanie_obiektów.zad2;

public class TestTeacher {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("John", "IT",10);
        Teacher t2 = null;
        try {
            t2 = t1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("t1: " + t1);
        System.out.println("t2: " + t2);
        t2.setExperience(20);
        System.out.println(t1);
        System.out.println(t2);

    }
}
