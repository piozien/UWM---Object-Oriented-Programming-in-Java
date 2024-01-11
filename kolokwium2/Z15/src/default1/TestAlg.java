package default1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestAlg {
    public static<T> void fillWithDefaultValue(Collection<T> arr, T arg){
        if (arr == null) {
            throw new IllegalArgumentException("Collection can't be null");
        }
        int size = arr.size();
        arr.clear();
        arr.addAll(Collections.nCopies(size, arg));
    }

    public static void main(String[] args) {
        List<String> c1 = new ArrayList<String>();
        c1.add("wasd");
        c1.add("wasd");
        c1.add("wasd");
        c1.add("wasd");
        c1.add("wasd");
        c1.add("wasd");
        String def = "new_value";
        fillWithDefaultValue(c1,def);
        for(String x : c1){
            System.out.println(x);
        }
    }
}
