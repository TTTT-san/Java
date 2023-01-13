import java.util.Scanner;

public class Main {

    public static  void stampaInserimento(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Quanti caratteri vuoi inserire?");
        int dim = in.nextInt();

        in.nextLine();
        String s;
        for (int i = 1; i < 6; i++) {
            System.out.println("-giro: "+(i));
            for (int j = 0; j!=dim; j++) {
                System.out.println("Inserisic carattere "+ (j+1)+":");
                s=in.nextLine();
                stampaInserimento(s);

            }
        }

    }
}