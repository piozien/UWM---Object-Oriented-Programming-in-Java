package Interfejs_Comparator.zad3;

import java.util.Arrays;

public class TestSamochod {
    public static void main(String[] args) {
        Samochod[] tab = new Samochod[5];
        tab[0] = new Samochod("A",2010, 12.345);
        tab[1] = new Samochod("B",2006, 12.345);
        tab[2] = new Samochod("C",2015, 12.345);
        tab[3] = new Samochod("D",2010, 12.345);
        tab[4] = new Samochod("E",2022, 12.345);

        for(var elem:tab){
            System.out.println(elem);
        }
        Arrays.sort(tab, new RokProdukcjiComparator());
        System.out.println("After sort: ");
        for(var elem:tab){
            System.out.println(elem);
        }
    }
}
