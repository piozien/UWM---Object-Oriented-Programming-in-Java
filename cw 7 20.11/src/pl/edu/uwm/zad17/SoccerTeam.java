package pl.edu.uwm.zad17;

import java.util.ArrayList;
import java.util.Objects;

class SoccerTeam extends Team{
    private int rankingPosition;

    public SoccerTeam(String name, String city, int rankingPosition) {
        super(name, city);
        this.rankingPosition = rankingPosition;
    }

    public int getRankingPosition() {
        return rankingPosition;
    }

    public void setRankingPosition(int rankingPosition) {
        this.rankingPosition = rankingPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        SoccerTeam that = (SoccerTeam) o;

        return rankingPosition == that.rankingPosition;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + rankingPosition;
        return result;
    }

    @Override
    public String toString() {
        return super.toString() +
                " rankingPosition=" + rankingPosition +
                '}';
    }
}
