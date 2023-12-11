package pola_metody.zad11;

public class TestImmutablePoint {
    public static void main(String[] args) {
        ImmutablePoint p1 = new ImmutablePoint(1.2,5.8,-10.5);
        //**Wywołanie getterów do każdej zmiennej**//
        System.out.println("Get x: " + p1.getX());
        System.out.println("Get y: " + p1.getY());
        System.out.println("Get z: " + p1.getZ());
        //** Wywołanie metody toString, equals i hashCode**//
        System.out.println("ToString: " + p1.toString());
        System.out.println("Equals: " + p1.equals(new ImmutablePoint(0.0, 0.0, 0.0)));
        System.out.println("Equals2: " + p1.equals(new ImmutablePoint(1.2, 5.8, -10.5)));
        System.out.println("HashCode: " + p1.hashCode());
    }
    /*• Sprawdź, czy taka klasa może być uznana jako niemodyfikowalna (inmutable).
    Klasa jest modyfikowalna. Klasa ta powinna posiadać modyfikator final, przez jego brak mogę zrobić klasę pochodną i modyfikować wartości punktów.
     */


}
