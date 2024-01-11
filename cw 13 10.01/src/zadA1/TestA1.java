package zadA1;

import java.util.ArrayList;
import java.util.Collection;

public class TestA1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(10);
        list1.add(20);
        list1.add(1);
        list1.add(10);
        list1.add(-100);
        list1.add(13);
        list1.add(-100);
        printUnique(list1);

    }
    public static <T> void printUnique(Collection<T> items){
        ArrayList<T> temp = new ArrayList<>();
        for(var elem: items){
            if(!temp.contains(elem)){
                temp.add(elem);
            }
        }
        for(var elem: temp){
            System.out.println(elem);
        }
    }

}
