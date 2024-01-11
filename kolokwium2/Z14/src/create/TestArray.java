package create;

public class TestArray {
    public static <T> void createArray(T first, T second, T[] arr){
        if(arr.length == 2){
           arr[0]= first;
           arr[1]= second;
        }
        else {

            throw new IllegalArgumentException("The required length of the board is 2");
        }

    }

    public static void main(String[] args) {
        Integer[] tab = new Integer[2];
        createArray(10, 2, tab);
        for(var x: tab){
            System.out.println(x);
        }

    }
}
