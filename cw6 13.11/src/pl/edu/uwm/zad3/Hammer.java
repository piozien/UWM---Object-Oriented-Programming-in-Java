package pl.edu.uwm.zad3;

public class Hammer extends Tool{
    // najlepiej żeby konstruktor miał ten sam typ co classa bazowa
    protected Hammer(String name) {
        super(name);
    }
    public static Hammer createHammer(String name){
        return new Hammer(name);
    }
}
// Dla private konstuktora w Tool nie byłoby to możliwe przez
// znajdowanie sie klasy Hammer w innym pliku,
// musiałym użyć getInstance()
