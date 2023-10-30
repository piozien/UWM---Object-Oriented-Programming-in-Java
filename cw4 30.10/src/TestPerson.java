import java.util.ArrayList;

// Exception: IndexOutOfBoundsException, błąd zwiazany z brakiem obiektu

public class TestPerson {
    public static void main(String[] args) {
        ArrayList<Person> nameList = new ArrayList<>();
        Person person = nameList.get(0);
    }
}
class Person{
    public String name;
}
