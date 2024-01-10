package E2;


import java.util.HashSet;

public class AlgorytmE2 {
    public <T>boolean hasCommonElements(HashSet<T> set1, HashSet<T> set2){
        for(var elem: set1){
            if(set2.contains(elem)){
                return true;
            }
        }
        return false;
    }
}
