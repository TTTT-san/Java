import java.util.Scanner;

public class Main {


    public static String ContrarioString(String s){
        String sI = "";
        for (int i = s.length()-1; i>=0; i--) {
            sI+=s.charAt(i);
        }

        return  sI;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserire una stringa: ");
        String s = in.nextLine();
        String sI = ContrarioString(s);
        System.out.println("String orginale -->"+s+"\n" +
                "String inversa --> "+sI);
    }
}