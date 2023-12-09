package rekord.zad6;

public record Car(String brand, String model, double fuelConsuptionPer100km) {
    public double fuelCost(double fuelPrice,double distance){
        return ((distance) * (fuelConsuptionPer100km/100)) * fuelPrice ;
    }
}
