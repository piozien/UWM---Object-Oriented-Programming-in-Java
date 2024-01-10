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

    public void TimeSet(int value, int index){
        this.times = times.clone();
        if(index >=0 && index<= times.length){
            times[index] = value;
        }
    }

    @Override
    public Athlete clone() {
        try {
            Athlete a1 = (Athlete) super.clone();
            a1.times = this.times.clone();
            return a1;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ", name: '" + name +
                ", times: " + Arrays.toString(times);
    }
}
