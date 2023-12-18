package Kopiowanie_obiektów.zad1;

public class TestStudnet {
    public static void main(String[] args) {
        Student s1 = new Student("Name1", 18, 4.5);
        Student s2 = null;
        try {
            s2 = s1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        s2.setGrade(3.5);
        System.out.println(s2);
    }
}
