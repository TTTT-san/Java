import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserire stringa: ");
        String s = in.nextLine();
        s = s.replaceAll("[a,e,i,o,u,A,E,I,O,U]","");
        System.out.println("Risultato: "+s);
    }
}