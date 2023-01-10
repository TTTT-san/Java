import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quanti numeri bisogna inserire: ");
        int dim = in.nextInt();
        int[] array = new int[dim];
        int somma = 0;
        int media = 0;
        for (int i:array) {
            array[i] = (int)(Math.random()*100);
            somma+=array[i];
        }
        System.out.println("La somma del vettore: "+somma +"\n"+
                                "media: "+somma/ array.length);
    }
}