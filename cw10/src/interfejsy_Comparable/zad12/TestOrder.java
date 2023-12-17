package interfejsy_Comparable.zad12;

import java.util.ArrayList;
import java.util.Collections;

public class TestOrder {
    public static void main(String[] args) {
        ArrayList<Order> lista = new ArrayList<>();
        lista.add(new Order("Product0", 10, 60.0));
        lista.add(new Order("Product1", 1100, 21.0));
        lista.add(new Order("Product2", 200, 21.0));
        lista.add(new Order("Product3", 8, 60.0));
        for (var elem: lista){
            System.out.println(elem);
        }
        Collections.sort(lista);
        System.out.println("After sort:");
        for (var elem : lista) {
            System.out.println(elem);
        }
    }
}

