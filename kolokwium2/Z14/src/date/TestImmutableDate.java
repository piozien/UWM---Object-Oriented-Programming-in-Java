package date;

public class TestImmutableDate {
    public static void main(String[] args) {
        ImmutableDate d1 = new ImmutableDate(2024, 01,11);
        ImmutableDate d2 = new ImmutableDate(2024, 01, 12);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1.equals(d2));
        System.out.println(d1.hashCode());
        System.out.println(d2.hashCode());
    }
}
