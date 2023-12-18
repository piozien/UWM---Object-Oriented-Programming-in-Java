package Interfejs_Comparator.zad3;

public class Samochod {
    private String marka;
    private int rokProdukcji;
    private double cena;

    public Samochod(String marka, int rokProdukcji, double cena) {
        this.marka = marka;
        this.rokProdukcji = rokProdukcji;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " marka: " + marka +
                ", rokProdukcji: " + rokProdukcji +
                ", cena: " + cena;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }
}
