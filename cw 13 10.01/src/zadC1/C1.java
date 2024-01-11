package zadC1;

import java.util.ArrayList;
import java.util.List;

public class C1 {
    public static <T> List<T> mergeLists(ArrayList<T> list1, ArrayList<T> list2) {

        ArrayList<T> mergedList = new ArrayList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        return mergedList;
    }

}
