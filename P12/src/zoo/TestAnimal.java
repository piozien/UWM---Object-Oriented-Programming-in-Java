package zoo;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Dog();
        animals[3] = new Cat();
        animals[4] = new Dog();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }
    }
}

