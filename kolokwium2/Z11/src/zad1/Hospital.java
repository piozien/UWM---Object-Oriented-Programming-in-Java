package zad1;

public class Hospital implements Cloneable{
    private String name;
    private double capacity;

    public Hospital(String name, double capacity) {
        this.name = name == null ? "" : name;
        this.capacity = capacity < 0 ? 50: capacity;
    }

    @Override
    public String toString() {

        return getClass().getSimpleName() + ", name: " + name +", capacity: " + capacity + ". ";
    }

    @Override
    protected Hospital clone() throws CloneNotSupportedException {
        return (Hospital) super.clone();
    }
}
