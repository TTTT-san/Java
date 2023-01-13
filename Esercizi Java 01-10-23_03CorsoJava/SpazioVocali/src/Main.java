import java.util.Scanner;

public class Main {

    public static int spazioVocali(String s){
        int sp = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i!=0) {
                if ((s.charAt(i) == 'i' && s.charAt(i - 1) == ' ') || (s.charAt(i) == 'o' && s.charAt(i - 1) == ' ') ||
                        (s.charAt(i) == 'u' && s.charAt(i - 1) == ' ') || (s.charAt(i) == 'A' && s.charAt(i - 1) == ' ') ||
                        (s.charAt(i) == 'E' && s.charAt(i - 1) == ' ') || (s.charAt(i) == 'I' && s.charAt(i - 1) == ' ') ||
                        (s.charAt(i) == 'O' && s.charAt(i - 1) == ' ') || (s.charAt(i) == 'U' && s.charAt(i - 1) == ' ')) {
                    sp++;
                }
            }
        }
        return sp;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inserire stringa: ");
        String s = in.nextLine();
       int totSp= spazioVocali(s);
        System.out.println("Gli spazi totali sono --> "+totSp);
    }
}