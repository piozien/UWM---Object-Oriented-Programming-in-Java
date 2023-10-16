import java.util.Random;

public class E3 {
    public static void main(String[] args) {
        System.out.println(generateRandomIntInRange(5, 10));
        System.out.println(generateRandomIntInRange(1, 100));
    }

    public static int generateRandomIntInRange(int a, int b) {
        Random random = new Random();
        int zmienna = random.nextInt(b + 1 - a);
        return zmienna + a;
    }
}
