package electronics;

public class TestAppliance {
    public static void main(String[] args) {
        Appliance fridge = Appliance.createFridge("test","test_model", 2.5 );
        Appliance app = new Appliance();
        app =  app.createAppliance("test1", "test_model2", 2.65);
    }
}
