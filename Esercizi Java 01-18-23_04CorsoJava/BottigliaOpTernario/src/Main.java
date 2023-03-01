import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Bottiglia[] lista = new Bottiglia[2];
        lista[0] = new Bottiglia("Coca Cola");
        lista[1] = new Bottiglia("Fanta", 20);

        boolean stop = false;

        System.out.println("---Dati iniziali--");
        do {
            stampaStato(lista[0], lista[1]);
            System.out.println("""
                    Azioni:
                        1. riempi
                        2. bevi
                        3. stampa stato
                        4. esci
                    """);
            System.out.print("azione -->");
            switch (in.nextInt()) {

                case 1:
                    int sel = menuSelezione();

                    System.out.println("\nInserire la quantita da riempire nella bottiglia --> " + (sel+1));
                    System.out.print("-quantià: ");
                    lista[sel].riempi(in.nextInt());
                    break;
                case 2:
                    sel = menuSelezione();

                    System.out.println("Inserire la quantità da bere dalla bottiglia --> " + (sel+1));
                    System.out.print("-quantità: ");
                    lista[sel].bevi(in.nextInt());
                    break;
                case 3:
                    System.out.println(lista[menuSelezione()].stato());
                    break;
                case 4:
                    stop = true;
                    break;
                default:
                    System.out.println("!! azione non esistente ");
            }
            System.out.println("------------------");
            System.out.println("Vuoi continuare? (1 --> Si | 0 --> No)");
            int sel = in.nextInt();
                    stop = sel == 0;


        } while (!stop);


        System.out.println("----Fine programma!!----");
    }

    private static int menuSelezione() {
        Scanner in = new Scanner(System.in);
        System.out.println("Seleziona bottiglia ( 1 per coca | 2 per fanta)");
        int ris;
        do{
            System.out.print("-bottiglia: ");
            ris = in.nextInt();
            if(ris!=1 && ris!=2)
                System.out.println("!! Bottiglia non esistente !!  \n" +
                        "riprova ");
        }while (ris!=1 && ris!=2);
        return ris-1;
    }

    private static void stampaStato(Bottiglia bot1, Bottiglia bot2) {
        System.out.println("----Stato---- " + "\n" +
                "Bottiglia 1 --> " + bot1.stato() + "\n" +
                "Bottiglia 2 --> " + bot2.stato());
    }
}