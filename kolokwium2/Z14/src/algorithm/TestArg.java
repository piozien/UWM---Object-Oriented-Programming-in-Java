package algorithm;

import java.util.HashMap;
import java.util.Map;

public class TestArg {
    public static <K, V> Map<K, V> mergeMaps(Map<K, V> map1, Map<K, V> map2) {
        if(map1 == null || map2 == null){
            throw new IllegalArgumentException("Maps can't be blank");
        }
        Map<K,V> result = new HashMap<>(map1);
        result.putAll(map2);
        return result;
    }

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("map1A", 10);
        map1.put("map1B", 11);
        map1.put("map1C", 12);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("map1A", 21);
        map2.put("map2B", 22);
        map2.put("map2C", 23);
        Map<String,Integer> result = mergeMaps(map1,map2);
        for(Map.Entry<String,Integer> x : result.entrySet()){
            System.out.println(x.getKey() +" " +  x.getValue());
        }
    }
}
