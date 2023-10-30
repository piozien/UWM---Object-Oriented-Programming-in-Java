import java.sql.SQLOutput;

public class TestCat {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Cat c2 = c1.createCat(null);
        Cat c3 = c1.createCat("Puu");
        System.out.println(c3.name);
        // System.out.println(c2.name); //Dla c2 string name nie istnieje
    }
}
class Cat{
    String name;
    Cat createCat(String value) {
        if (value == null) {
            return null;
        }
        Cat temp = new Cat();
        temp.name = value;
        return temp;
    }
}

