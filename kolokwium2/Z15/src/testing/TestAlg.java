package testing;

public class TestAlg {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Model1", 150);
        Vehicle v2 = new Vehicle("Model1", 150);
        Vehicle v3 = new Vehicle("Model2", 150);
        comPrint.compareAndPrint(v1,v2);
        comPrint.compareAndPrint(v1,v3);
    }
}
