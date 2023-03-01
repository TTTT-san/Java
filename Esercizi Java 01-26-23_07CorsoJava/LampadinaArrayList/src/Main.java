import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Qunate lampadine vuoi creare?");
        System.out.print("-numero:");
        int dim = in.nextInt();
        ArrayList<Lampadina> scatola = new ArrayList<Lampadina>(dim);
        for (int i = 0; i < dim; i++) {
            scatola.add(i, new Lampadina(0));
        }

        System.out.println("Elenco lampadine iniziale:");
        for (int i = 0; i < scatola.size(); i++) {
            System.out.println("-Lampadina " + (i + 1) + " stato:" + scatola.get(i).toString());
        }

        int risp, l = -1;
        do {
            System.out.println("""
                    Vuoi modificare stato delle lampadine?
                        1. per accendere / spegnere 
                        2. per stampare l'elenco delle lampadine
                        3. per aggiungere una lampadina
                        4. per rimuovere una lampadina
                        0. per uscire""");

            risp = in.nextInt();

            switch (risp) {

                case 1:
                    System.out.println("Sceglire la lampadina (da 1 a " + scatola.size() + ")");
                    System.out.print(".lampadina: ");
                    l = in.nextInt()-1;
                    if (l < 0 || l > scatola.size()) {
                        System.out.println("!! La lampadina non esiste !!");
                        break;
                    }
                    System.out.println("-Scelta: 1 --> per accendere | 0 --> per spegnere");
                    int r = in.nextInt();

                    if (r == 1 || r == 0) {

                        scatola.get(l).setStato(r);
                        System.out.println("!! Cambio è avvenuto !!");
                        break;
                    }
                    System.out.println(" !! Errore nella scelta stato !!");


                    break;

                case 2:
                    System.out.println("Elenco lampadine:");
                    for (int i = 0; i < scatola.size(); i++) {
                        System.out.println("-Lampadina " + (i + 1) + " stato:" + scatola.get(i).toString());
                    }
                    break;
                case 3:
                    System.out.println("Scelta stato lampadina");
                    System.out.println("-Scelta: 1 --> accesa | 0 --> spenta");
                    System.out.print("-stato: ");

                    r = in.nextInt();

                    if (r == 1 || r == 0) {

                        scatola.add(new Lampadina(r));
                        System.out.println("!! Aggiunto è avvenuto !!");
                        break;
                    }

                    System.out.println("!! Errore scelta stato !!");
                    break;

                case 4:
                    System.out.println("Quale lampadine vuoi rimuovere? (da 1 a " + scatola.size() + ")");
                    scatola.remove(in.nextInt()-1);

                    break;

                default:
                    System.out.println("!! Non esiste azione !!");
            }
        } while (risp != 0);

        System.out.println("-- edn Program --");
    }
}