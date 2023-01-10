import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array1 = new int[10];
        
        int x = 0;
        System.out.println("Inserire 10 numeri");
        for(int i = 0; i<array1.length; i++){
            System.out.println("Numero "+(i+1)+":");
            array1[i]= in.nextInt();
            if(array1[i]>=0){
                x++;
            }
        }
        int[] array2 = new int [x];

        int j = array2.length-1;
        for(int i = 0; i<array1.length; i++){
            if(array1[i]>=0) {
                array2[j] = array1[i];
                j--;
            }
        }

        System.out.println("//Nuovo array >=0 : ");
        for (int i = 0; i<array2.length;i++) {
            System.out.print(array2[i]);
            
        }
        System.out.println();
        System.out.println("//Array originale :");
        for (int i = 0; i<array1.length;i++) {
            System.out.print(array1[i]);

        }

    }
}