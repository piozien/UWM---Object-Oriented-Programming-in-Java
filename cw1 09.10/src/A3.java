import java.util.Scanner;

public class A3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbę wymierną: ");
        float a = input.nextFloat();
        System.out.println("Podaj druga liczbę wymierną: ");
        float b = input.nextFloat();
        System.out.println("Podaj trzecia liczbę wymierną: ");
        float c = input.nextFloat();
        System.out.println("Podaj czwarta liczbę wymierną: ");
        float d = input.nextFloat();

        double suma = a+b+c+d;
        System.out.println("Suma wynosi: " + suma);
    }
}
