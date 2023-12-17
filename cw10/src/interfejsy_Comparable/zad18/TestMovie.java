package interfejsy_Comparable.zad18;

import java.util.ArrayList;
import java.util.Collections;

public class TestMovie {
    public static void main(String[] args) {
        ArrayList<Movie> lista = new ArrayList<>();
        lista.add(new Movie("1234567", "director0", "genre0"));
        lista.add(new Movie("qwe", "director1", "genre1"));
        lista.add(new Movie("qwerty", "director2", "genre2"));
        lista.add(new Movie("w", "director3", "genre3"));
        for (var elem: lista){
            System.out.println(elem);
        }
        System.out.println("After Sort: ");
        Collections.sort(lista);
        for (var elem: lista){
            System.out.println(elem);
        }
    }
}
