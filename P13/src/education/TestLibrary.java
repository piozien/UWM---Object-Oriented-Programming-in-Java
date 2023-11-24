package education;

public class TestLibrary {
    public static void main(String[] args) {
        Library[] lib = new Library[5];
        lib[0] = new Library("Biblioteka", "Olsztyn", 350);
        lib[1] = new Library(null, "", -100);
        lib[2] = new Library("LibTest2", "Gdańsk", 4999);
        lib[3] = new SchoolLibrary("Biblioteka","Olsztyn", 350, "High", 10);
        lib[4] = new SchoolLibrary("", "", -100, "", 1);

        for(Library l : lib){
            System.out.println(l.toString());
            l.addBooks(100);
            System.out.println(l.toString());
        }
    }
}
