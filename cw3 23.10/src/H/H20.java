package H;

import java.util.Scanner;

public class H20 {
    public static void main(String[] args){
       /* Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź napis: ");
        String napis = scan.next();
        System.out.println("Wprowadź liczbę całkowitą: ");
        int n = scan.nextInt();*/
        String napis = "1476382467";
        int n = 5;
        StringBuffer sb = new StringBuffer(napis);
        trimToSize(sb, n);
        System.out.printf("Napis po zmianie: %s", sb.toString());
    }
    public static void trimToSize(StringBuffer sb, int n){
        int len = sb.length();
        if(len > n){
            sb.setLength(n);
        }
    }
}
