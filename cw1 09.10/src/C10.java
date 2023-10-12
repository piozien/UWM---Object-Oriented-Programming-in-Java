import java.util.Scanner;

public class C10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz liczbę: ");
        int a = input.nextInt();
        int suma = 0;

        for(int i =1; i <= a; i++){
            suma += i*i;
        }
        System.out.println("Suma od 1 do " + a + " wynosi: " + suma);
    }
}
