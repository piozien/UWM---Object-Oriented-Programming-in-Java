package złożone.zad1;

import java.util.ArrayList;

public class TestMusicAlbum {
    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<>();
        lista.add(4.5);
        lista.add(11.4);
        lista.add(-9.65);
        MusicAlbum m1 = new MusicAlbum("Title", "Artist", lista);
        System.out.println(m1);
        m1.addRating(10.0);
        System.out.println(m1);
        m1.removeRating(0);
        System.out.println(m1);
    }
}
