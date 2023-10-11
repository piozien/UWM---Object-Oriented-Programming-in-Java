import java.util.Scanner;

public class B5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź swój wiek: ");
        int age = input.nextInt();
        if (age < 18) {
            System.out.println("Jesteś niepełnoletni");
        }
        else if(age>=18 && age < 65){
            System.out.println("Jesteś pełoletni");
        }
        else{
            System.out.println("Jesteś emerytem");
        }
    }

}
