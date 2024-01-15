package sports;

import java.util.Arrays;

public class Athlete implements Cloneable{
    private String name;
    private double[] times;

    public Athlete(String name, double[] times) {
        this.name = name;
        this.times = times == null ? new double[0] : times.clone();
    }

    public double[] getTimes() {
        return times.clone();
    }

    public void timeSet(int value, int index){
        this.times = times.clone();
        if(index >=0 && index<= times.length){
            times[index] = value;
        }
        else{
            throw new IllegalArgumentException("Index is out of the array");
        }
    }

    /*@Override
    public Athlete clone() {
        try {
            Athlete athlete = (Athlete) super.clone();
            athlete.times = this.times.clone();
            return athlete;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }*/

    //}

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ", name: '" + name +
                ", times: " + Arrays.toString(times);
    }

    @Override
    public Athlete clone() {
        try {
            Athlete clone = (Athlete) super.clone();
           clone.times = this.times.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
