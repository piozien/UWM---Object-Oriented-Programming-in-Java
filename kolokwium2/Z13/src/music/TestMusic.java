package music;

import java.util.Arrays;

public class TestMusic {
    public static void main(String[] args) {
        Song[] songs = {
                new Song("Song3", "Artist2", 200),
                new Song("Song1", "Artist1", 150),
                new Song("Song2", "Artist1", 150),
                new Song("Song4", "Artist2", 300)
        };

        Arrays.sort(songs, new DurationComparator().thenComparing(new ArtistTitleComparator()));

        System.out.println("Posortowana lista utworów:");
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}
