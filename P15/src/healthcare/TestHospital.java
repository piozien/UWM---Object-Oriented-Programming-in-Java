package healthcare;

public class TestHospital {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("", "", -10.0);
        Hospital h2 = new Hospital("", null, 50.0);
        Hospital h3 = new Hospital("test_name", "test_location", 999.9);

        Clinic c1 = new Clinic("", "", -10.0, "test_spec", -10.0);
        Clinic c2 = new Clinic("", null, -10.0, "test_spec", 3.0);

        System.out.println("h1 equals h2: " + h1.equals(h2));
        System.out.println("h1 equals h3: " + h1.equals(h3));
        System.out.println("h1 equals c1: " + h1.equals(c1));
        System.out.println("h1 equals c2: " + h1.equals(c2));
        System.out.println("h2 equals c1: " + h2.equals(c1));
        System.out.println("h2 equals c2: " + h2.equals(c2));
        System.out.println("h3 equals c1: " + h3.equals(c1));
        System.out.println("h3 equals c2: " + h3.equals(c2));
        System.out.println("c1 equals h1: " + c1.equals(h1));
        System.out.println("c1 equals c2: " + c1.equals(c2));
    }
}
