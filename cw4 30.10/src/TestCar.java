public class TestCar {
    public static void main(String[] args) {
        Car carA = null;
        if(carA!= null){
            carA.getBrand();
        }
        else{
            System.out.println("It's NullPointerException");
        }
    }
}
class Car{
    public String brand;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
