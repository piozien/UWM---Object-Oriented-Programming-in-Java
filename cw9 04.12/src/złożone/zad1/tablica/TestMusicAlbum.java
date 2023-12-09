package złożone.zad1.tablica;

public class TestMusicAlbum {

    public static void main(String[] args) {
        double[] tablica = {4,5,-8.3, 7, 23};
        MusicAlbum m2 = new MusicAlbum("Title","Artist", tablica);
        MusicAlbum m1 = new MusicAlbum("Title2","Artist2", new double[]{4, 5, -8.3, 7, 23});
        System.out.println(m1);
        System.out.println(m1.equals(m2));
        m1.addRatings(5.7);
        System.out.println(m1);
        m1.removeRatings(-8.3);
        System.out.println(m1);
    }
}
