package Programowanie_Generyczne.zad29;

public class TestPair {
    public static void main(String[] args) {
        Tree[] tre = {
                new Tree(10.0),
                new Tree(20.0),
                new Tree(5.0)
        };

        Pair<? super Tree> result = new Pair<>();
        find.findMinMaxHeight(tre, result);
        if (result.getFirst() != null && result.getSecond() != null) {
            System.out.println("Minimum height tree: " + result.getFirst());
            System.out.println("Maximum height tree: " + result.getSecond());
        }
        Tree[] trees = null;
        Pair<? super Tree> result2 = new Pair<>();
        find.findMinMaxHeight(trees, result2);

    }
}
