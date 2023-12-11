package interfejsy.zad17;

public class VATTest {
    public static void main(String[] args) {
        double price1 = 150.25;
        double result = VATCalculator.calculateWithVAT(price1);
        String result1 = String.format("%.2f", result);
        System.out.println(price1 + " 23% VAT : " +  result1);
        double price2 = 1000;
        double result2 = VATCalculator.calculateWithVAT(price2);
        String result2_1 = String.format("%.2f", result2);
        System.out.println(price2 + " 23% VAT: " + result2_1);
    }
}
