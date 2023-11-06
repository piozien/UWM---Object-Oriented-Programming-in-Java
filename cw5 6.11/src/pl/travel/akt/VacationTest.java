package pl.travel.akt;

public class VacationTest {
    public static void main(String[] args) {
        Vacation v1 = new Vacation("Polska", 1500.50);
        System.out.println("Location: " + v1.getLocation() + " Cost: " + v1.getCost());
        v1.setCost(-15);
        System.out.println("Location: " + v1.getLocation() + " Cost: " + v1.getCost());
        v1.setCost(200000);
        System.out.println("Location: " + v1.getLocation() + " Cost: " + v1.getCost());
        // Test wywołania dla ujemnej wartości w konstruktorze
        Vacation v2 = new Vacation("Niemcy", -1500.50);
        System.out.println("Location: " + v2.getLocation() + " Cost: " + v2.getCost());
    }
}
