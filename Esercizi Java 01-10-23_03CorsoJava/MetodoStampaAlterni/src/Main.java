import java.util.Scanner;

public class Main {

    public static int[] randomArray(int dim){
        int[] array = new int[dim];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*100);
        }
        return array;
    }
    
    public static void stampaArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
            
        }
    }

    public static void stampaAlterni(int[] array){
        for (int i = 0; i < array.length; i+=2) {
            System.out.print("-pos "+i+ ": "+array[i] +"\n") ;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserire dimensione array: ");
        int dim = in.nextInt();
        int[] array = randomArray(dim);
        System.out.println("Array posto pari: ");
        stampaAlterni(array);
        System.out.println();
        System.out.println("-Array: ");
        stampaArray(array);
    }
}