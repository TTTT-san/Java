import java.util.Scanner;

public class Main {

    public static int[] arrayInverso(int[] array){
        int[] arrayI =new int[array.length];

        for (int i = 0, j = array.length-1; i < array.length; i++,j--) {
            arrayI[i]=array[j];

        }

        return arrayI;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[10];
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Inserire il numero "+ (i+1));
            array[i] = in.nextInt();

        }

        int[] arrayI = arrayInverso(array);

        System.out.print("-Array originale: ");

        for (int i = 0; i< array.length; i++)
            System.out.print(array[i]+" ");

        System.out.println();
        System.out.print("-Array inverso: ");
        for (int i = 0; i<arrayI.length;i++)
            System.out.print(arrayI[i]+" ");


    }
}