package education;

import java.util.Objects;

public class School {
    private String name;
    private String address;
    private int students;

    public School(String name, String address, int students) {
        this.name = name == null || name.isEmpty() ? "Wydział Matematyki i Informatyki UWM" : name;
        this.address = address == null || address.isEmpty() ? "ul. Słoneczna 54, 10-710 Olsztyn" : address;
        this.students = students > 0 ? students : 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (!address.isEmpty()) {
            this.address = address;
        }
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        if (students > 0) {
            this.students = students;
        }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " Name: " + name + ". Address: " + address + ". Students: " + students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        School school = (School) o;
        return Objects.equals(address, school.address);
    }

    public void recruitment(int arg) {
        students += arg;
        if (students > 500) {
            students = 500;
        }
    }

    public static void checkLimit(School obj) {
        System.out.println(obj.students + " missing the limit: " + (500 - obj.students));
    }

}

