import java.util.Scanner;

public class Main {

    public static int[]inserisciArray(){
        Scanner in = new Scanner(System.in);
        System.out.println("Dimensione array");
        int[] array = new int[in.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Inserire numero "+(i+1));
            array[i] = in.nextInt();
        }

        return array;
    }


    public static void stampaInverso(int[] array){
        for (int i = array.length-1; i >=0 ; i--) {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] array = inserisciArray();
        System.out.println("//Array stampa inverso: ");
        stampaInverso(array);

        System.out.println();
        System.out.println("//Array orginale: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }


    }
}