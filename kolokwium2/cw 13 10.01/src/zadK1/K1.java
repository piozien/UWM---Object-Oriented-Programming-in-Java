package zadK1;

import java.util.HashMap;

public class K1 {
    public <K, V> HashMap<V, Integer> countValueOccurrences(HashMap<K, V> map) {
        HashMap<V, Integer> temp = new HashMap<>();
        for (var values : map.values()) {
            int counter = 0;
            for(var val: map.values()){
                if(values.equals(val)){
                    counter++;
                }
            }
            temp.put(values,counter);
        }
        return temp;
    }
}
