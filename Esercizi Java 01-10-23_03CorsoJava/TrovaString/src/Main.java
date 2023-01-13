import java.util.Scanner;

public class Main {

    public static boolean trovaEasy(String testo, String s){

       return testo.contains(s);
    }
    public static boolean trovaString(String s,String testo){
        int x = 0, y;
        for (int i = 0; i < testo.length(); i++) {
             if(testo.charAt(i)==s.charAt(0)){
                 y=i+1;
                 for (int j = 1; j < s.length(); j++) {

                     if(s.charAt(j)==testo.charAt(y)){
                         x++;
                         y++;
                         if(x==s.length()-1)
                             return true;
                     }else{

                         break;
                     }

                 }

             }else{
                 x=0;

             }

        }

        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserire testo: ");
        String testo = in.nextLine();
        System.out.println("Inserire parola da cercare");
        String s = in.nextLine();
        boolean trova= trovaString(s,testo);
        System.out.println("Verifica presenza --> "+trova);

        trova= trovaEasy(testo,s);
        System.out.println("Verifica presenza cointans()--> "+trova);
    }
}