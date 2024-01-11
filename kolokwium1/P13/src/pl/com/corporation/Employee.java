package pl.com.corporation;

class Employee {
    private String name;
    private double salary;
    private static int totalEmployeeCount;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        totalEmployeeCount++;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static int getTotalEmployeeCount() {
        return totalEmployeeCount;
    }
}
