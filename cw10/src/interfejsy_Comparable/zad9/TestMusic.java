package interfejsy_Comparable.zad9;

import java.util.ArrayList;
import java.util.Collections;

public class TestMusic {
    public static void main(String[] args) {
        ArrayList<Music> lista = new ArrayList<>();
        lista.add(new Music("Title0","Artist0", 2022 ));
        lista.add(new Music("Title1","Artist1", 2023 ));
        lista.add(new Music("Title2","Artist2", 2010 ));
        lista.add(new Music("Title3","Artist3", 2021 ));
        for (var elem: lista){
            System.out.println(elem);
        }
        Collections.sort(lista);
        System.out.println("After sort");
        for (var elem: lista){
            System.out.println(elem);
        }
    }
}
