package złożone.zad8;

public class TestComputer {
    public static void main(String[] args) {
        Processor processor = new Processor("2.4", 4, "Intel");

        Computer computer = new Computer("Dell", "Inspiron", processor);

        System.out.println(computer.toString());
        System.out.println(processor.toString());
        System.out.println(computer.equals(processor));

    }
}
