package printing.Utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Print {
    public <E> void printEverySecond(Collection<E> arr){
        if (arr == null || arr.isEmpty()) {
            System.out.println("Collection is null or empty.");
            return;
        }

        Iterator<E> iterator = arr.iterator();
        boolean skipNext = true;

        while (iterator.hasNext()) {
            E element = iterator.next();
            if (!skipNext) {
                System.out.println(element);
            }
            skipNext = !skipNext;
        }
    }
}
