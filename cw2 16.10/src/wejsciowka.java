import java.sql.SQLOutput;
import java.util.Scanner;

public class wejsciowka {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź numer miesiąca od 1 do 12: ");
        int miesiac = input.nextInt();
        if( miesiac>= 1 && miesiac <= 12){
            if(miesiac >= 1 && miesiac <= 2){
                System.out.println("Podany miesiąc "+ miesiac + " to pora roku: zima");
            } else if (miesiac >= 3 && miesiac <= 5) {
                System.out.println("Podany miesiąc "+ miesiac + " to pora roku: wiosna");
            } else if (miesiac >= 6 && miesiac <= 8) {
                System.out.println("Podany miesiąc "+ miesiac + " to pora roku: lato");
            } else if (miesiac == 12) {
                System.out.println("Podany miesiąc "+ miesiac + " to pora roku: zima");

            } else{
                System.out.println("Podany miesiąc "+ miesiac + " to pora roku: jesień");
            }
        }
        else{
            System.out.println("Wprowadzony miesiąc jest nieprawidłowy!");
        }


    }
}
