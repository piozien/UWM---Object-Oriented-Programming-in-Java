package music;

import java.util.Comparator;

public class ArtistTitleComparator implements Comparator<Song> {

    @Override
    public int compare(Song o1, Song o2) {
        int artistComparison = o1.getArtist().compareTo(o2.getArtist());
        if (artistComparison != 0) {
            return o2.getArtist().compareTo(o1.getArtist());
        }
        return o2.getTitle().compareTo(o1.getTitle());
    }
}
