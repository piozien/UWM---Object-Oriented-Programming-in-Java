package H;

public class H10 {
    public static void main(String[] args){
        String s1 = "bananowy";
        StringBuilder sb = new StringBuilder();
        String s2="";
        for(int i=0; i < s1.length(); i++){
            char znak = s1.charAt(i);
            if(sb.indexOf(String.valueOf(znak))== -1){
                sb.append(znak);
            }
            s2 = sb.toString();
        }
        System.out.printf("Napis przed usunieciem powtarzajacych sie znaków: %s%n", s1);
        System.out.printf("Napis po usunięciu powtarzających sie znaków: %s", s2);
    }

}
