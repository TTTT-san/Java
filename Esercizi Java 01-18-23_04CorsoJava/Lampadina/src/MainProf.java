import java.util.Scanner;

public class MainProf {


    public static void menu() {
        System.out.println("Menu: ");
        System.out.println("1) accendi");
        System.out.println("2) spegni");
        System.out.println("3) esci");
    }

    public static void stampaArray(LampadinaProf[] scatola) {
        for (int i = 0; i < scatola.length; i++) {
            System.out.println("-Lampadina " + (i) + "--> " + scatola[i].infoSuperEasy());
        }
    }

    public static void main(String[] args) {

        /*
        LampadinaProf cucina = new LampadinaProf(50);
        LampadinaProf sala = new LampadinaProf();

        System.out.println("-Cucina "+cucina.info());
        System.out.println("-Sala  "+sala.info());


        cucina.accendi(100);
        sala.accendi(-50);

        System.out.println(".....dopo aver modifcato lum....");
        System.out.println("-Cucina "+cucina.info());
        System.out.println("-Sala  "+sala.info());

        System.out.println("........");
        System.out.println("Accendi sala --> porta a 20 di lum");
        sala.accendi(20);

        System.out.println("-Sala "+sala.info()); */
        /** */
        Scanner in = new Scanner(System.in);
        System.out.println("Quante lampadine voi creare?");
        System.out.print("dato:");
        int n = in.nextInt();

        LampadinaProf[] scatola = new LampadinaProf[n]; //ho creato n° puntatori che non punatno a nulla
        for (int i = 0; i < scatola.length; i++) {
            scatola[i] = new LampadinaProf(); // --> Tutte le lampadine sono spente
        }

        System.out.println("Tutte le lampadine");
        stampaArray(scatola);
        System.out.println("Quale vuoi accendere");
        int scelta = in.nextInt();

        System.out.println("A quanto di lum");
        System.out.print("lum:");
        int lum = in.nextInt();

        scatola[scelta].accendi(lum);
        System.out.println("---stato finale---");
        stampaArray(scatola);


    }
}
