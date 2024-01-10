package Programowanie_Generyczne.zad22;

public class CarCompare{
    public static <T> boolean compareObjects(T object1, T object2) {

        return object1.getClass().equals(object2.getClass());
    }
}
