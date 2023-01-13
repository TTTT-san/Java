import java.util.Scanner;

public class Main {

    public static int[] inserisciRandom(){
        Scanner in = new Scanner(System.in);
        System.out.println("Inserire dimensione array: ");
        int[] array = new int[in.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random()*-100)-50;

        }
        return array;
    }

    public static void stampaPositivi(int[] array){
        System.out.println("//Numeri Postivi nell'array: ");
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>=0) {
                System.out.print(array[i] + " ");
                cont++;
            }


        }

        if(cont == 0){
            System.out.println("!!L'array non presenta numeri positivi!!");
        }


    }

    public static void stampaArray(int[] array){
        System.out.println("//Array originale");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) {

        int[] array = inserisciRandom();
        stampaPositivi(array);
        stampaArray(array);

    }
}