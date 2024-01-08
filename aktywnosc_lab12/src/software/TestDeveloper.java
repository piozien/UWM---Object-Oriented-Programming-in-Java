package software;

public class TestDeveloper {
    public static void main(String[] args) {
        Developer d1 = new Developer("John", "Java", 10);
        Developer d2 = null;
        try {
            d2 = d1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("Before changes: ");
        System.out.println("Number of developer 1 projects: " + d1.getProjectsCompleted());
        System.out.println("Number of developer 2 projects: " + d2.getProjectsCompleted());
        System.out.println("After changes: ");
        d1.setProjectsCompleted(15);
        System.out.println("Number of developer 1 projects: " + d1.getProjectsCompleted());
        System.out.println("Number of developer 2 projects: " + d2.getProjectsCompleted());
    }
}
