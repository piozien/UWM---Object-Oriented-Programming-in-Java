package Interfejs_Comparator.zad15;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(1, "Name1", 2.5));
        list.add(new Student(5, "Name2", 4.5));
        list.add(new Student(4, "Name3", 4.5));
        list.add(new Student(3, "Name4", 2.5));
        list.add(new Student(2, "Name5", 3.5));

        for(var elem: list){
            System.out.println(elem);
        }
        Collections.sort(list, new AverageGradeComparator());
        System.out.println("After avgGrade sort:");
        for(var elem: list){
            System.out.println(elem);
        }
        System.out.println("After idsort: ");
        Collections.sort(list, new IdComparator());
        for(var elem: list){
            System.out.println(elem);
        }
    }
}
