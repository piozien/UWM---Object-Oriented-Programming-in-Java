package sports;

public class Stadium {
    private String name;
    private String location;
    private  int capacity;
    private String homeTeam;

    public Stadium(String name, String location, int capacity, String homeTeam) {
        this.name = name == null ? "" : name;
        this.location = location  == null ? "" : location;
        this.capacity = capacity;
        this.homeTeam = homeTeam  == null ? "none" : name;
    }

    public Stadium() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? "" : name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? "" : location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam == null ? "none" : homeTeam;
    }

    @Override
    public String toString() {
        return "Stadium{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", capacity=" + capacity +
                ", homeTeam='" + homeTeam + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Stadium stadium = (Stadium) o;

        if (capacity != stadium.capacity) return false;
        if (!name.equals(stadium.name)) return false;
        if (!location.equals(stadium.location)) return false;
        return homeTeam.equals(stadium.homeTeam);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + location.hashCode();
        result = 31 * result + capacity;
        result = 31 * result + homeTeam.hashCode();
        return result;
    }
}
