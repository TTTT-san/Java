import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num ,som = 0;
        int n = 0, p = 0;
        while(1>0){
            System.out.println("Inserire numero :");
            num = in.nextInt();
            if(num<0 && num%2 ==0 ){
                n= num+n;
                som+=num;
            }else if(num>=0 && num%3 == 0){
               p = num+p;
                som+=num;
            }else{

                    System.out.println("!!Errore il numero non è corretto per la condizione");
                    System.out.println("La somma --> "+som);
                System.out.println("Somma n: "+n+"\n" +
                        "Somma p: "+p);
                    break;

            }




        }



    }
}