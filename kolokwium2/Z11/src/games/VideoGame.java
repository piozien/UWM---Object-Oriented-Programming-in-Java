package games;

public class VideoGame implements  Comparable<VideoGame> {
    private String name;
    private String developer;
    private float rating;


    public VideoGame(String name, String developer, float rating) {
        this.name = name;
        this.developer = developer;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ", name: " + name + ", developer: " + developer + ", rating: " + rating + ".";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public int compareTo(VideoGame other) {

        return Integer.compare(other.getName().length(), this.getName().length());
    }
}
