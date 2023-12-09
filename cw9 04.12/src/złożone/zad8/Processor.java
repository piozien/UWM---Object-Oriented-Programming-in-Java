package złożone.zad8;

import java.util.Objects;

public class Processor {
    private String frequency;
    private int cores;
    private String manufacturer;

    public Processor(String frequency, int cores, String manufacturer) {
        this.frequency = frequency;
        this.cores = cores;
        this.manufacturer = manufacturer;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Processor processor = (Processor) o;

        if (cores != processor.cores) return false;
        if (!Objects.equals(frequency, processor.frequency)) return false;
        return Objects.equals(manufacturer, processor.manufacturer);
    }

    @Override
    public int hashCode() {
        int result = frequency != null ? frequency.hashCode() : 0;
        result = 31 * result + cores;
        result = 31 * result + (manufacturer != null ? manufacturer.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " frequency= '" + frequency + ", cores= " + cores + ", manufacturer= " + manufacturer +".";
    }
}
