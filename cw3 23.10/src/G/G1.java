package G;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class G1 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            System.out.printf("Wprowadz %d element do listy: ", i+1);
            int liczba = scan.nextInt();
            list.add(liczba);
        }
        //Collections.reverse(list);
        System.out.println("Lista w odwrotnej kolejności: ");
        for(int i=list.size()-1; i>=0; i--){
            System.out.printf(list.get(i) + " ");
        }

    }
}
