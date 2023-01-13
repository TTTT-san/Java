import java.util.Scanner;

public class Main {

    public static int mediaTre(int somT,int contT){

        return somT/contT;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Quanti numeri vuoi inserire? ");
       // int ris =MediaMultipliDiTre(in.nextInt());
        int dim = in.nextInt();
        int somT = 0;
        int cont = 0;
        int input = 0;
        for (int i = 1; i <= dim; i++) {
            System.out.println("Inserisci numero "+i+":");
            input = in.nextInt();
            if(input%3==0){
                somT+=input;
                cont++;
            }
        }


        System.out.println("//La media dei multipli di tre --> "+mediaTre(somT,cont) +"\n" +
               "--Somma dei multipli di tre --> "+somT +"\n" +
                "--I multipli di tre inseriti sono --> "+cont);
    }
}