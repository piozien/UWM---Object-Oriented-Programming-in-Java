package gadget;

import java.util.ArrayList;

public class TestGadget {
    public static void main(String[] args) {
        ArrayList<Gadget> lista = new ArrayList<>();
        lista.add(new Gadget("0", 10, 12.5));
        lista.add(new Gadget("1", 20, 20.5));
        lista.add(new Gadget("2", 8, 100.5));
        lista.add(new Gadget("3", 12, 11.5));
        for(var elem: lista){
            System.out.println(elem);
        }
        System.out.println("After sort:");
        lista.sort(null);
        for(var elem: lista){
            System.out.println(elem);
        }
    }
}
