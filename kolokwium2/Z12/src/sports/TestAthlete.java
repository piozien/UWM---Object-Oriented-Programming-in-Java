package sports;

import java.util.Arrays;

public class TestAthlete {
    public static void main(String[] args) {
        Athlete a1 = new Athlete("Name1", new double[]{4.2, 3.9, 3.8, 4.0, 4.1});
        Athlete a2 = a1.clone();
        a1.timeSet(10,3);
        System.out.println("Times for athlete1: " + Arrays.toString(a1.getTimes()));
        System.out.println("Times for athlete2: " + Arrays.toString(a2.getTimes()));
    }
}
