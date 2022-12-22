import java.util.Scanner;

public class Main {


    public static String convertSecondi(int s){
        String risult = " ";

        int secM= 60;
        int secH = 3600;
        int secD = 86400;

       /* int d=s/secD;
        int h=s/secH;
        int m=s/secM;

        s = s - d*secD+h*secH+m*secM;
        */

        int d = s/secD;
        int stot = s%secD;
        int h= stot/secH;
        stot=stot%secH;
        int m = stot/secM;
        stot= stot%secM;



        return "-DD: "+ d+" -HH: "+h +" -mm: " + m+ " -s: "+stot;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("---Esercizio 5");
        System.out.print("Inserire Secondi:");
        int s = in.nextInt();
        System.out.println(convertSecondi(s));
    }
}
