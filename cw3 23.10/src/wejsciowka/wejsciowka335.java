package wejsciowka;

public class wejsciowka335 {
    public static void main(String[] args){
        double[] km = {78.24, 10.0, 8348.1321};
        for(int i =0; i < km.length; i++) {
            System.out.printf("%.4f kilometrów to %.4f mil%n", km[i], kilometryNaMile(km[i]));
        }
    }
    public static double kilometryNaMile(double km){
        double mile = km * 0.621371;
        return mile;
    }
}
