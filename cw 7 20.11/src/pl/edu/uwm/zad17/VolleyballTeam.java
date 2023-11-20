package pl.edu.uwm.zad17;

import java.util.ArrayList;

class VolleyballTeam extends Team{
    private int numberOfVictories;

    public VolleyballTeam(String name, String city, int numberOfVictories) {
        super(name, city);
        this.numberOfVictories = numberOfVictories;
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        VolleyballTeam that = (VolleyballTeam) o;

        return numberOfVictories == that.numberOfVictories;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberOfVictories;
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                "numberOfVictories=" + numberOfVictories +
                '}';
    }
}
