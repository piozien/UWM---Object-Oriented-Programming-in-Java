package interfejsy_Comparable.zad21;

import java.util.ArrayList;

public class TestClient {
    public static void main(String[] args) {
        ArrayList<Client> list = new ArrayList<>();
        list.add(new Client("AA",10.0));
        list.add(new Client("AA",80.0));
        list.add(new Client("AA",8.0));
        list.add(new Company("BB", 10.0, 10));
        list.add(new Company("BB", 10.0, 20));
        list.add(new Company("AA", 10.0, 10));

        for(var element: list){
            System.out.println(element);
        }
        list.sort(null);
        System.out.println("After sort: ");
        for(var element: list){
            System.out.println(element);
        }
    }
}
