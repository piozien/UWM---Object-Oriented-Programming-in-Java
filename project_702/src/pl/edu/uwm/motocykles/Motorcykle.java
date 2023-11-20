package pl.edu.uwm.motocykles;

class Motorcykle {
    private String brand;
    private int yearOfProduction;
    private double fuelConsumption;

    public Motorcykle(String brand, int yearOfProduction, double fuelConsumption) {
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        if (brand == null || brand.isEmpty()) {
            return ("Motocykl." + " Rok prod.: " + yearOfProduction + ", zużycie: " + fuelConsumption + " l/100km.");
        }
        return ("Motocykl." + " Marka: " + brand + ", rok prod.: " + yearOfProduction + ", zużycie: " + fuelConsumption + " l/100km.");
    }
}

