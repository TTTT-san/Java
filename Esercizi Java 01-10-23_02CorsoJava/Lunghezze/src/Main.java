import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder myString = new StringBuilder();
        String s=".";
        String vuoto ="";
        while(!s.equals(vuoto)){
            System.out.println("Inserire la stringa: " +
                    "\n solo INVIO per Terminare ");
            s = in.nextLine();
            if(s.length()>0){
                if(Character.isUpperCase(s.charAt(0))){
                    myString.append(s);

                }
            }

        }

        System.out.println("La lunghezza dei caratteri delle parole con inizile Maiuscola: "+myString.length());



    }
}