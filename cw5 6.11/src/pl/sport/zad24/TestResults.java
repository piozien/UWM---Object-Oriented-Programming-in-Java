package pl.sport.zad24;

public class TestResults {
    public static void main(String[] args) {
        Results r1 = new Results("Asas", "Afawfaw", 5);
        for(int i =0; i <5; i++){
            r1.addResult(i, 2 + i);
        }
        double result = r1.averageResult();
        System.out.println("Average result: "+ result);
    }
}
