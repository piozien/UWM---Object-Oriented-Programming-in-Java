package złożone.zad1.tablica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class MusicAlbum {
    private String title;
    private String artist;
    private double[] ratings;

    public MusicAlbum(String title, String artist, double[] ratings) {
        this.title = title == null ? "" : title;
        this.artist = artist == null ? "" : artist;
        this.ratings = ratings == null ? new double[0] : ratings.clone();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double[] getRatings() {
        return ratings.clone();
    }

    public void setRatings(double[] ratings) {
        this.ratings = ratings == null ? new double[0] : ratings.clone();
    }
    public void addRatings(double rating){
        double[] ratingsCopy = Arrays.copyOf(ratings, ratings.length + 1);
        ratingsCopy[ratings.length] = rating;
        ratings = ratingsCopy;
    }
    public void removeRatings(double rating){
        int index = -1;
        for (int i = 0; i < ratings.length; i++) {
            if (ratings[i] == rating) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            double[] ratingsCopy = new double[ratings.length - 1];
            System.arraycopy(ratings, 0, ratingsCopy, 0, index);
            System.arraycopy(ratings, index + 1, ratingsCopy, index, ratings.length - index - 1);
            ratings = ratingsCopy;
        }
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", ratings=" + Arrays.toString(ratings);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MusicAlbum that = (MusicAlbum) o;

        if (!Objects.equals(title, that.title)) return false;
        if (!Objects.equals(artist, that.artist)) return false;
        return Arrays.equals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (artist != null ? artist.hashCode() : 0);
        result = 31 * result + (ratings != null ? Arrays.hashCode(ratings) : 0);
        return result;
    }
}
