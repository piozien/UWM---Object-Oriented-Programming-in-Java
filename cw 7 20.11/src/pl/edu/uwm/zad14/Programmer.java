package pl.edu.uwm.zad14;

import java.util.Objects;

public class Programmer extends Employee{
    private String programmingLanguage;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public Programmer(String firstName, String lastName, int salary, String programmingLanguage) {
        super(firstName, lastName, salary);
        this.programmingLanguage = programmingLanguage;

    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        Programmer that = (Programmer) o;

        return programmingLanguage == that.programmingLanguage;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (programmingLanguage != null ? programmingLanguage.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                "programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
