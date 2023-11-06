package pl.people.zad1;

class Person {
    private String name;
    private static int counter;


    public Person(String name) {
        this.name = name;
        counter++;
    }
    public static int getCounter() {
        return counter;
    }
}
