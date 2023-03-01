import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String parola = null;
        int tot = 0;

       do {
           System.out.println("Inserire la parola: ");
           parola = in.nextLine();


           if (parola.length() > 0) {
               char c = parola.charAt(0);
                   if (c >= 'A' && c <= 'Z') {
                       tot += parola.length();

                   }
           }

       }while (parola.length()>0);


        System.out.println("Lunghezza totale: "+tot);


    }
}