import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder myString = new StringBuilder(); //meotdo per costuire una stringa nel for causa loop con +=
        System.out.println("Inserire Stringa");
        String s = input.next();
        s=s.toLowerCase(); //rendere tutti i caratteri minuscoli

        for(int i = 0; i<s.length(); i++){      //Ciclo per crerare una stringa di soli VOCALI
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i'|| c == 'o' || c == 'u'){
                myString.append(s.charAt(i));

            }
        }
        System.out.println("Risultato: " + myString);
    }
}