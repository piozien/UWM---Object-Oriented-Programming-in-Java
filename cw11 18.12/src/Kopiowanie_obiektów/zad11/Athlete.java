package Kopiowanie_obiektów.zad11;

import java.util.Arrays;

public class Athlete implements Cloneable{
    private String name;
    private double[] times;

    public Athlete(String name, double[] times) throws CloneNotSupportedException{
        this.name = name;
        this.times = times == null ? new double[0] : times.clone();
    }
    public double[] getTimes() throws CloneNotSupportedException {
        return times.clone();
    }
    public void setTimes(int index, double newTime) {
        this.times = times.clone();
        if(index >= 0 && index <= times.length){
            times[index] = newTime;
        }

    }
    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", times=" + Arrays.toString(times) +
                '}';
    }

    @Override
    public Athlete clone() throws CloneNotSupportedException{
        Athlete temp = (Athlete) super.clone();
        temp.times = times.clone();
        return temp;

    }
}
