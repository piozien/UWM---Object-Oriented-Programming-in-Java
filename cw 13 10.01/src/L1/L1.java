package L1;

import java.util.TreeMap;

public class L1 {
    public <K extends Comparable<K>, V> TreeMap subMapInRange(TreeMap<K,V> map, K startKey, K endKey){
        TreeMap<K, V> temp = new TreeMap<>();
        for( var entry: map.entrySet()){
            K key = entry.getKey();
            if(key.compareTo(startKey) >=0 && key.compareTo(endKey) <=0){
                temp.put(key, entry.getValue());
            }
        }

        return temp;
    }
}
