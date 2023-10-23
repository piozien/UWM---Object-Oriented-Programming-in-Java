package H;

import java.util.Scanner;

public class H2 {
    public static void main(String[] args){
        /*System.out.println("Wprowadź napis: ");
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();*/
        String s1 = "kajak";
        if(palindrom(s1)){
            System.out.printf("Napis %s jest palindromem!%n", s1);
        }
        else{
            System.out.printf("Napis %s nie jest palindromem!%n", s1);
        }
        if(Czypalindrom(s1)){
            System.out.printf("Napis %s jest palindromem!%n", s1);
        }
        else{
            System.out.printf("Napis %s nie jest palindromem!%n", s1);
        }
    }
    public static boolean Czypalindrom(String str){
        int size = str.length();
        for(int i=0; i < size/2; i++){
            if(str.charAt(i) != str.charAt(size -1 -i)){
                return false;
            }
        }
        return true;
    }
    public static boolean palindrom(String str){
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        return  str.equals(rev);
    }
}
