package pola_metody;

public class Planet {
    final String name;
    public Planet(String name) {
        this.name = name;
    }
    public void changeName(String name2) {
        //this.name = name2;
        // powduje to błąd kompilacji nie moge ingerować w zmienną z parametrem final
    }
}
