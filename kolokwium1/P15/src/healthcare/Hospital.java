package healthcare;

import java.util.Objects;

public class Hospital {
    private String name;
    private String location;
    private double capacity;

    public Hospital(String name, String location, double capacity) {
        this.name = name;
        this.location = location == null || location.isEmpty() ? "ul. Zdrowia 123, 00-999 Warszawa" : location;
        this.capacity = capacity <= 0 ? 50.0 : capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if(location != null && !location.isEmpty()){
            this.location = location;
        }
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        if(capacity > 0){
            this.capacity = capacity;
        }

    }

    @Override
    public String toString() {
        if(name == null || name.isEmpty()){
            return getClass().getSimpleName() + " Location: " + location+". Capacity: " + capacity+".";
        }
        return getClass().getSimpleName() + " Name: " + name +". Location: " + location + ". Capacity: " + capacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hospital hospital = (Hospital) o;

        if (Double.compare(capacity, hospital.capacity) != 0) return false;
        if (!Objects.equals(name, hospital.name)) return false;
        return location.equals(hospital.location);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + location.hashCode();
        temp = Double.doubleToLongBits(capacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    public void expand(double add){
        capacity+=add;
        if(capacity > 1000.0){
            setCapacity(1000.0);
        }
    }
}
