package books;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Collections;


public class TestBook {
    public static void main(String[] args) {
        ArrayList<Book> b1 = new ArrayList<>();
        b1.add(new Book("abc", "Author3", 2020));
        b1.add(new Book("title", "Author1", 2000));
        b1.add(new Book("a", "Author4", 2005));
        b1.add(new Book("abcd", "Author2", 1995));



        System.out.println("Array before sort: ");
        for(Book b : b1){
            System.out.println(b);
        }
        System.out.println("Array after sort: ");
        Collections.sort(b1);
        for(Book b : b1){
            System.out.println(b);
        }
    }


}
