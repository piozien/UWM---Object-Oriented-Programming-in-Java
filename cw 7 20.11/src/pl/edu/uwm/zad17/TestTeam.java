package pl.edu.uwm.zad17;

public class TestTeam {
    public static void main(String[] args) {
        SoccerTeam soccerTeam1 = new SoccerTeam("TeamA", "CityA", 1);
        soccerTeam1.getPoint().add(3);
        soccerTeam1.getPoint().add(1);
        soccerTeam1.getPoint().add(0);

        SoccerTeam soccerTeam2 = new SoccerTeam("TeamA", "CityA", 1);
        soccerTeam2.getPoint().add(3);
        soccerTeam2.getPoint().add(1);
        soccerTeam2.getPoint().add(0);

        System.out.println(soccerTeam1.equals(soccerTeam2));
        System.out.println(soccerTeam1.hashCode());
        System.out.println(soccerTeam2.hashCode());

        VolleyballTeam volleyballTeam1 = new VolleyballTeam("TeamB", "CityB", 10);
        volleyballTeam1.getPoint().add(25);
        volleyballTeam1.getPoint().add(20);
        volleyballTeam1.getPoint().add(15);

        VolleyballTeam volleyballTeam2 = new VolleyballTeam("TeamB", "CityB", 10);
        volleyballTeam2.getPoint().add(25);
        volleyballTeam2.getPoint().add(20);
        volleyballTeam2.getPoint().add(15);

        System.out.println(volleyballTeam1.equals(volleyballTeam2));
        System.out.println(volleyballTeam1.hashCode());
        System.out.println(volleyballTeam2.hashCode());
    }
}
