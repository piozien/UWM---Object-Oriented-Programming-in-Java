package pl.edu.uwm.zad17;

import java.util.ArrayList;
import java.util.Objects;

class Team {
    private String name;
    private String city;
    private ArrayList<Integer> point;

    public Team(String name, String city) {
        this.name = name;
        this.city = city;
        this.point = new ArrayList<>();
    }
    public Team copy() {
        Team newTeam = new Team(this.name, this.city);
        newTeam.getPoint().addAll(this.point);
        return newTeam;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public ArrayList<Integer> getPoint() {
        return point;
    }

    public void setPoint(ArrayList<Integer> point) {
        this.point = point;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team team = (Team) o;

        if (!Objects.equals(name, team.name)) return false;
        if (!Objects.equals(city, team.city)) return false;
        return Objects.equals(point, team.point);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (point != null ? point.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", point=" + point +
                '}';
    }
}
