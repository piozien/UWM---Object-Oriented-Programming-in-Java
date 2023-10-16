public class D1 {
    public static void main(String[] args){
        int[] tab = {2,7,10};
        for(int i = 0; i < tab.length; ++i) {
            int wynik = sum(tab[i]);
            System.out.printf("Suma dla %d wynosi: %d%n",tab[i], wynik);
        }

    }
        public static int sum(int n) {
            int suma = 0;
            int znak = 1;

            for (int i = 1; i <= n; i++) {
                suma += znak * i;
                znak = -znak;
            }

            return suma;
        }
}
