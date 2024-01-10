package university;

class Student implements Comparable<Student> {
    private String name;
    private float grade;

    public Student(String name, float grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public float getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Student other) {

        return Float.compare(this.grade, other.grade);
    }
}
