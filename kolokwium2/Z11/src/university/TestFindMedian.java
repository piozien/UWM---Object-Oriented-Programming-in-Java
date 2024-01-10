package university;

import java.util.Collections;

public class TestFindMedian {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", 85.5f),
                new Student("Bob", 90.0f),
                new Student("Charlie", 78.3f),
                new Student("David", 95.2f),
                new Student("John", 70.2f)
        };

        Student student = FindMedian.findMedian(students);
        System.out.println("Median Student: " + student.getName() + ", Grade: " + student.getGrade());
    }
}