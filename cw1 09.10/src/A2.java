import java.util.Scanner;

public class A2 {
    public static void main(String[] args){
        System.out.println("Łańcuchy znaków");
        System.out.println("Podaj pierwszy łańcuch znaków: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        //System.out.print("Twój pierwszy łańcuch znaków: " +a);
        System.out.println("\nPodaj drugi łańcuch znaków: ");
        String b = sc.nextLine();
        //System.out.print("Twój drugi łańcuch znaków: " +b);
        System.out.println(a);
        System.out.println(b);
    }
}
