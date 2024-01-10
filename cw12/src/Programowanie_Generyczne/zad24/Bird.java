package Programowanie_Generyczne.zad24;

class Bird {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ", name: " + name;
    }
}
