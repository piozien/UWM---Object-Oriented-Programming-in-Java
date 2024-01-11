package student;

public record StudentRecord(String name, String id, double gpa) {
    public StudentRecord {
        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("gpa is outside the range of 0.0 to 4.0 ");
        }
    }

    public boolean isHonorStudent() {
        if (gpa >= 3.5) {
            return true;
        }
        return false;
    }

    public void printDetails() {
        System.out.println("Student Name: " + name + ", id: " + id + ", gpa: " + gpa);
    }
}
