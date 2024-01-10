package Programowanie_Generyczne.zad29;

public class find {
    public static  void findMinMaxHeight(Tree[] array, Pair<? super Tree> result) {
        try {
            if (array == null || array.length < 0) {
                throw new IllegalArgumentException("Array is null or empty");
            }

            Tree minHeightTree = array[0];
            Tree maxHeightTree = array[0];

            for(var elem: array){
                if(elem.compareTo(minHeightTree) < 0){
                    minHeightTree = elem;
                }
                if(elem.compareTo(maxHeightTree) > 0){
                    maxHeightTree = elem;
                }

            }

            result.setFirst(minHeightTree);
            result.setSecond(maxHeightTree);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }
    }
}
