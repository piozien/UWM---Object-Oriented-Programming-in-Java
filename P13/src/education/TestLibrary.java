package education;

import java.util.ArrayList;

public class TestLibrary {
    public static void main(String[] args) {
        ArrayList<Library> libraries = new ArrayList<>();

        libraries.add(new Library("Biblioteka", "Olsztyn", 350));
        libraries.add(new Library(null, "", -100));
        libraries.add(new Library("LibTest2", "Gdańsk", 4999));
        libraries.add(new SchoolLibrary("Biblioteka", "Olsztyn", 350, "High", 10));
        libraries.add(new SchoolLibrary("", "", -100, "", 1));

        for (Library l : libraries) {
            System.out.println(l.toString());
            l.addBooks(100);
            System.out.println(l.toString());
        }
    }
}

