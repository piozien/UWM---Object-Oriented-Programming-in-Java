package Wyjątki.zad3;

public class TestNiepoprawnyFormat {
    public static void main(String[] args) {
        String poprawnyEmail = "test.email@example.com";
        String niepoprawnyEmail = "testemail.examplecom";

        try {
            sprawdzFormatDanych(poprawnyEmail);
            System.out.println("Format danych jest poprawny.");
        } catch (NiepoprawnyFormatDanychException e) {
            System.out.println("Błąd: " + e.getMessage());
        }

        try {
            sprawdzFormatDanych(niepoprawnyEmail);
            System.out.println("Format danych jest poprawny.");
        } catch (NiepoprawnyFormatDanychException e) {
            System.out.println("Błąd: " + e.getMessage());
        }
    }
        public static void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException {

            if (!dane.contains("@")) {
                throw new NiepoprawnyFormatDanychException("Niepoprawny format danych. Brak znaku '@'.");
            }
        }


}
