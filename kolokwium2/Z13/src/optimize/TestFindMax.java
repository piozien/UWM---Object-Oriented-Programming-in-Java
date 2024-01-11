package optimize;

public class TestFindMax {
    public static void main(String[] args) {
        Find result = new Find();
        int wynik = result.findMax(10,5,7);
        int wynik2 = result.findMax(5,20,7);
        int wynik3 = result.findMax(1, 5 ,30);
        System.out.println(wynik);
        System.out.println(wynik2);
        System.out.println(wynik3);
        var res = result.findMax("AA", "xe","Bb");
        System.out.println(res);

    }
}
