package furniture;

class Table {
    private double price;

    private Table(double price) {
        this.price = price;
    }

    public static Table create(double price) {
      return new Table(price);
    }
}
