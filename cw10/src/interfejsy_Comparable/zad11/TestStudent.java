package interfejsy_Comparable.zad11;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Student0", 4.5,2020));
        list.add(new Student("Student1", 3.9,2022));
        list.add(new Student("Student2", 4.0,2021));
        list.add(new Student("Student3", 4.5,2019));
        list.add(new Student("Student4", 4.5,2015));
        list.add(new Student("Student5", 4.2,2000));
        for (var elem: list){
            System.out.println(elem);
        }
        Collections.sort(list);
        System.out.println("After sort");
        for (var elem: list){
            System.out.println(elem);
        }
    }
}
