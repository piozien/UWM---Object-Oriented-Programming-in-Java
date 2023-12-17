package interfejsy_Comparable.zad12;

public class Order implements Comparable<Order>{
    private String productName;
    private int quantity;
    private double unitPrice;

    public Order(String productName, int quantity, double unitPrice) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                '}';
    }

    @Override
    public int compareTo(Order other) {
        int unit = Double.compare(other.unitPrice, this.unitPrice);
        if (unit != 0) {
            return unit;
        } else {
            return Integer.compare(this.quantity, other.quantity);
        }
    }
}
