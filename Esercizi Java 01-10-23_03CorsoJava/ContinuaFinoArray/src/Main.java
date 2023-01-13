import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int p = 0,n = 0, som =0;
        Scanner in = new Scanner(System.in);
        int[] array = new int[100];
        for (int i = 0; i <array.length ; i++) {
            System.out.println("Inserire numero  "+(i+1)+" (negativo divisibile per 2 o postivo divisibile 3):");
            array[i] = in.nextInt();

            if((array[i]%2 == 0 && array[i]<0) ||(array[i]%3==0 && array[i]>=0)){
                som+=array[i];
            }else{
                System.out.println("!!Errore numero non rispetta la condizione");
                System.out.println("La somma è --> "+som);

                break;
            }
        }




    }
}