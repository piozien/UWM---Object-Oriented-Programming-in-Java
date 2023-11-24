package pl.com.corporation;

public class TestEmployee {
    public static void main(String[] args) {
        Employee[] em = new Employee[5];
        em[0] = new Employee("0", 0.0);
        em[1] = new Employee("1", 1.0);
        em[2] = new Employee("2", 2.0);
        em[3] = new Employee("3", 3.0);
        em[4] = new Employee("4", 4.0);
        System.out.println(Employee.getTotalEmployeeCount());
    }

}
