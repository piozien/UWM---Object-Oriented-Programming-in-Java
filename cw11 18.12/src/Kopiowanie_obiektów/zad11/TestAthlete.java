package Kopiowanie_obiektów.zad11;

public class TestAthlete {
        public static void main(String[] args) {
            try {
                Athlete a1 = new Athlete("John Doe", new double[]{10.5, 11.2, 10.8, 10.9, 11.1});


                Athlete a2 = a1.clone();

                a1.setTimes(3, 111.7);

                System.out.println("Original Athlete:");
                System.out.println(a1.toString());

                System.out.println("\nCloned Athlete:");
                System.out.println(a2.toString());

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
}
