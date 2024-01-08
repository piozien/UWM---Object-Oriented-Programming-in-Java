package Programowanie_Generyczne.zad2;

public class EqualsCheck {
    public static<T> boolean isEqual(T o1, T o2){
        if(o1 == null && o2 == null){
            return true;
        } else if (o1 == null || o2 == null) {
            return false;
        }
        return o1.equals(o2);
    }
}
