import java.util.Scanner;

public class Main {


    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Insrire secondi: ");
        int s = in.nextInt();
        int d,h,m,mth;
        mth=s/2500000; //secondS average month
        d= (s-mth*2500000)/86400;
        h=(s-mth*2500000-d*86400)/3600;
        m=(s-mth*2500000-d*86400-h*3600)/60;
        s-=(mth*2500000+d*86400+h*3600+m*60);


       System.out.print("//Il risultato --> ");

        System.out.println("| Month: "+mth
                                    +"| Day: "+d
                                    +"| Hour: "+h 
                                    +"| min: "+m
                                    +"| sec: "+s);
    }
}
