package art;

import java.util.ArrayList;

public class ArtGallery {
    private String name;
    private String city;
    private ArrayList<String> paintings;

    public ArtGallery(String name, String city, ArrayList<String> paintings) {
        this.name = name == null ? "" : name;
        this.city = city == null ? "" : city;
        this.paintings = paintings == null ? new ArrayList<>() : new ArrayList<>(paintings);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? "" : name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? "" : city;
    }

    public ArrayList<String> getPaintings() {
        return paintings;
    }

    public void setPaintings(ArrayList<String> paintings) {
        this.paintings = paintings == null ? new ArrayList<>(): new ArrayList<>(paintings);
    }
    public void addPainting(String painting){
        paintings = new ArrayList<>(paintings);
        paintings.add(painting);
    }
    public void removePainting(String painting){
        paintings = new ArrayList<>(paintings);
        paintings.remove(painting);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name: " + name + ", city: " + city + ", paitings: " + paintings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArtGallery that = (ArtGallery) o;

        if (!name.equals(that.name)) return false;
        if (!city.equals(that.city)) return false;
        return paintings.equals(that.paintings);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + paintings.hashCode();
        return result;
    }
}
