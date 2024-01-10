package Programowanie_Generyczne.zad24;

public class TestTriple {
    public static void main(String[] args) {
        Triple<Bird> birdTriple = new Triple<>(new Bird("Anjawfnjk"), new Bird("Pigeon"), new Bird("Eagle"));
        Triple<Bird> birdAndEagle = new Triple<>(new Bird("Xkaf"), new Bird("Bird"), new Eagle("AEagle"));
        Triple<Eagle> eagle = new Triple<>(new Eagle("Eagle"), new Eagle("Angle"), new Eagle("Eg"));
        Bird minBird = BirdCompare.findMin(birdTriple);
        Bird minBird2 = BirdCompare.findMin(birdAndEagle);
        Eagle minEagle = BirdCompare.findMin(eagle);
        System.out.println(minBird);
        System.out.println(minBird2);
        System.out.println(minEagle);

    }
}
