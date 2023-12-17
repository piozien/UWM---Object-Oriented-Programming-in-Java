package interfejsy_Comparable.zad9;

public class Music implements Comparable<Music> {
    String title;
    String artist;
    int relaseYear;

    public Music(String title, String artist, int relaseYear) {
        this.title = title;
        this.artist = artist;
        this.relaseYear = relaseYear;
    }

    @Override
    public String toString() {
        return "Music{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", relaseYear=" + relaseYear +
                '}';
    }

    @Override
    public int compareTo(Music o) {
        return Integer.compare(o.relaseYear, this.relaseYear);
    }
}
