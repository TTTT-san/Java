import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean verifica = false;
        Scanner in = new Scanner(System.in);
        int num = -1;
        System.out.println("Inserire n° " + ":");
        int past = in.nextInt();
        while (num!=0) {
            System.out.println("Inserire n° " + ":");
            num = in.nextInt();
            if(num>0 && past<0){
                verifica = true;
            }else{
                past=num;
            }


        }
        if(verifica){
            System.out.println("OK");
        }else{
            System.out.println("NO");
        }


    }
}