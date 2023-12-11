package interfejsy.zad17;

public interface VATCalculator {
    double vatRate = 1.23;
    static double calculateWithVAT(double price){
        return price * vatRate;
    }
}
