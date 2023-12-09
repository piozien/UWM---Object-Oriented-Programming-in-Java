package rekord.zad1;

import java.awt.print.Book;

public class TestBookDTO {
    public static void main(String[] args) {
        BookDTO b1 = new BookDTO("Pan Tadeusz", "Adam Mickiewicz", 30.55,2020);
        System.out.println(b1);
        BookDTO b2 = new BookDTO("Pan Tadeusz", "Adam Mickiewicz", 30.55,2020);
        System.out.println(b1.equals(b2));
        BookDTO b3 = new BookDTO(new String("Pan Tadeusz"), "Adam Mickiewicz", 30.55,2020);
        System.out.println(b1.equals(b3));
        BookDTO b4 = new BookDTO(null, "Adam Mickiewicz", 30.55,2020);
        System.out.println(b4);
        System.out.println(b1.price());
        //b1.price() = 56.96; // rekordy to metody bez seterów
        //BookDTO = new BookDTO(); // takiej instancji nie stworze domyślnie brak konstuktora "pustego"
    }
}
