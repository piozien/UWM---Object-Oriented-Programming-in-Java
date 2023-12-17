package interfejsy_Comparable.zad11;

public class Student implements Comparable<Student> {
    private String name;
    private double averageGrade;
    private int yearOfStudy;

    public Student(String name, double averageGrade, int yearOfStudy) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfStudy = yearOfStudy;
    }

    @Override
    public int compareTo(Student other) {
        int grade = Double.compare(other.averageGrade, this.averageGrade);
        if (grade != 0) {
            return grade;
        } else {
            return Integer.compare(this.yearOfStudy, other.yearOfStudy);
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " Name: " + name + ". Average grade: " + averageGrade + ". yearOfStudy: " + yearOfStudy;
    }
}

