package aktywnosc;

public class TestElem {
    public static void main(String[] args) {
        Integer[] arrInt = {10, 2, 4 ,5 ,6, 8};
        String[] arrString = {"apple", "banana", "orange", "peach"};
        logElements(arrInt);
        logElements(arrString);

    }

    public static <T> void logElements(T[] tab) {
        String str = "\"";
        for (int i = 0; i < tab.length; i++) {
            if(i != tab.length - 1){
                str += "Element " + (i+1) + ": " + tab[i] +", ";
            }
            if(i == tab.length-1){
                str += "Element " + (i+1) + ": " + tab[i] +"\". ";
            }

        }
        System.out.println(str);
    }
}
