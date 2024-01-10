package E2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicLong;

public class TestE2 {
    public static void main(String[] args) {
        HashSet<Double> h1 = new HashSet<>();
        h1.add(1.2);
        h1.add(67.2);
        HashSet<Double> h2 = new HashSet<>();
        h2.add(1.1+0.1);
        h2.add(-22.3);
        AlgorytmE2 a1 = new AlgorytmE2();
        HashSet<Double> h3 = new HashSet<>();
        h3.add(1.2);
        h3.add(167.2);
        System.out.println(a1.hasCommonElements(h1,h2));
        System.out.println(a1.hasCommonElements(h1,h3));
    }
}
