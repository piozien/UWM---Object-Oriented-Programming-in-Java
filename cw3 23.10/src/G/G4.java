package G;

import java.util.ArrayList;
import java.util.Random;

public class G4 {
    public static void main(String[] args){
        ArrayList<Double> lista = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            Random random = new Random();
            lista.add(random.nextDouble(6.0));
        }
        System.out.printf("Lista: %s%n", lista);
        System.out.printf("Najmniejszy element listy wynosi: %f", minimumValue(lista));
    }
    public static double minimumValue(ArrayList<Double> lista){
        double min = lista.get(0);
        for(double elem: lista){
            if(min > elem){
                min = elem;
            }
        }
        return min;
    }
}
