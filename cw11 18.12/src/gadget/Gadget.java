package gadget;

public class Gadget implements Comparable<Gadget>{
    private String type;
    private int batteryLife;
    private double price;

    public Gadget(String type, int batteryLife, double price) {
        this.type = type;
        this.batteryLife = batteryLife;
        this.price = price;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " type: " + type  +
                ", batteryLife: " + batteryLife +
                ", price: " + price;
    }

    @Override
    public int compareTo(Gadget o) {
        return Integer.compare(o.batteryLife, this.batteryLife);
    }
}
