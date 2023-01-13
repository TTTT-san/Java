import java.util.Scanner;

public class Main {

    public static int[] inserireArray(){
        Scanner in = new Scanner(System.in);
        System.out.println("Inserire dimensione array: ");
        int[] array = new int[in.nextInt()];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Inserire numero: "+(i+1));
            array[i] = in.nextInt();
        }

        return  array;
    }

    public static void ritornaArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {

        int[] array = inserireArray();

        System.out.println("Array inserito: ");
        ritornaArray(array);
        System.out.println("-Dimensione Array:  "+array.length);
    }
}