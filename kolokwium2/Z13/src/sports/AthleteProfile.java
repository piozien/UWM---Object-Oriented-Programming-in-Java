package sports;

public class AthleteProfile {
    private String athleteName;
    private String sport;
    private Stadium stadium;

    public AthleteProfile(String athleteName, String sport, Stadium stadium) {
        this.athleteName = athleteName == null ? "" : athleteName;
        this.sport = sport;
        this.stadium = (stadium == null) ? new Stadium() : new Stadium(stadium);
    }


    public String getAthleteName() {
        return athleteName;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName == null ? "" : athleteName;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport == null? "" : sport;
    }

    public Stadium getStadium() {
        return new Stadium(stadium);
    }

    public void setStadium(Stadium stadium) {
        this.stadium = (stadium == null) ? new Stadium() : new Stadium(stadium);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AthleteProfile that = (AthleteProfile) o;

        if (!athleteName.equals(that.athleteName)) return false;
        if (!sport.equals(that.sport)) return false;
        return stadium.equals(that.stadium);
    }

    @Override
    public int hashCode() {
        int result = athleteName.hashCode();
        result = 31 * result + sport.hashCode();
        result = 31 * result + stadium.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "AthleteProfile{" +
                "athleteName='" + athleteName + '\'' +
                ", sport='" + sport + '\'' +
                ", stadium=" + stadium +
                '}';
    }
}
