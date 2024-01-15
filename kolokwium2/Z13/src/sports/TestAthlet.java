package sports;

public class TestAthlet {
    public static void main(String[] args) {
        Stadium s1 = new Stadium("Name1", "Location1", 100, "Team1");
        Stadium s2 = null;
        AthleteProfile a1 = new AthleteProfile("Athlete1", "sport1", s1);
        AthleteProfile a2 = new AthleteProfile("Athlete2", "sport2", s1);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(a1);
        System.out.println(a2);
    }
}
