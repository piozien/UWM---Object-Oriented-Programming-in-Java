package healthcare;

public class TestHospital {
    public static void main(String[] args) {
        Hospital h1 = new Hospital("","",-10);
        Hospital h2 = new Hospital("Cos", "Adres",999);
        System.out.println(h1.toString());
        System.out.println(h2.toString());
        h1.setPatients(-10);
        System.out.println(h1.toString());
        Hospital h3 = new Hospital("","",200);
        System.out.println(h1.equals(h3));
        System.out.println(h1.hashCode() == h3.hashCode());
        h2.admitPatient(20);
        h2.checkCapacity(h2);

        Clinic c1 = new Clinic("","",-20,"awda",-10);
        Clinic c2 = new Clinic("Clinic2","Address",200,"general",20);
        c1.setDoctors(-10);
        c1.setSpecjalization("");
        System.out.println(c1.toString());
        c1.admitPatient(400);
        System.out.println(c1.toString());
        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());
    }
}
