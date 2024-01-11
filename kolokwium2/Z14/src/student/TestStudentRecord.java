package student;

public class TestStudentRecord {
    public static void main(String[] args) {

        try{
            StudentRecord s1 = new StudentRecord("John", "1", 3.9);
            s1.printDetails();
            System.out.println(s1.name() + " is honor student: " + s1.isHonorStudent());
            StudentRecord s2 = new StudentRecord("Andy","2",5.0);
            s2.printDetails();
            System.out.println(s2.isHonorStudent());
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
