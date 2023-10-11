import java.util.Scanner;

public class B4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź zmienna a: ");
        int a = input.nextInt();
        System.out.println("Wprowadź zmienna b: ");
        int b = input.nextInt();
        System.out.println("Wprowadź zmienna c: ");
        int c = input.nextInt();
        double delta = ((b*b)-4*a*c);
        double delta2 = Math.sqrt(delta);
        if(delta < 0){
            System.out.println("Delta jest ujemna! Nie ma rozwiązań rzeczywistych!");
        }
        else{
          double x1 = ((-b -delta2)/(2*a));
          double x2 = ((-b +delta2)/(2*a));
          if(delta == 0){
              System.out.println("Miejsce zerowe wynosi: " + x1);
          }
          else{
              System.out.println("Miejsca zerowe wynoszą: " +x1 + " i " + x2);
          }
        }
    }
}
