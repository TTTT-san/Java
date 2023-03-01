import java.util.Scanner;

public class MainMio {
    public static void main(String[] args) {
        //Era meglio utilizzare il DO WHILE per evitare di utilizzare StringBuilder

    Scanner in = new Scanner(System.in);
    StringBuilder myString = new StringBuilder(); //Mia solzuione

        String s= ".";
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
