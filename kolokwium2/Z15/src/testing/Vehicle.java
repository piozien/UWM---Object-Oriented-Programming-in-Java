package testing;

import java.util.Objects;

public class Vehicle {
    private String model;
    private int speed;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vehicle vehicle = (Vehicle) o;

        if (speed != vehicle.speed) return false;
        return Objects.equals(model, vehicle.model);
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + speed;
        return result;
    }
}
