package Interfejs_Comparator.zad10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestStudnet {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1,"EE", 4.5));
        list.add(new Student(2,"BB", 3.5));
        list.add(new Student(3,"CC", 4.5));
        list.add(new Student(4,"DD", 3.0));
        list.add(new Student(5,"AA", 4.5));
        for(var elem: list){
            System.out.println(elem);
        }
        System.out.println("After sort: ");
        Collections.sort(list, new AverageGradeComparator());
        for(var elem: list){
            System.out.println(elem);
        }
    }
}
