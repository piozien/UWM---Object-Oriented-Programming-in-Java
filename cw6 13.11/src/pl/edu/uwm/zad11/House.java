package pl.edu.uwm.zad11;

class House extends Building{
    private int numberOfRooms;

    public House(int height, String color, int numberOfRooms) {
        super(height, color);
        this.numberOfRooms = numberOfRooms;
    }
}
