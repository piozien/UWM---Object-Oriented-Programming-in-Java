package interfejsy_Comparable.zad1;

public class Student implements Comparable<Student> {
    String name;
    double averageGrade;
    int yearOfBirth;
    public Student(String name, double averageGrade, int yearOfBirth) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+
                " name: " + name + ", averageGrade: " + averageGrade + ", yearOfBirth: " + yearOfBirth + " .";
    }

    @Override
    public int compareTo(Student obj) {
        return Double.compare(obj.averageGrade, this.averageGrade);
    }
}

