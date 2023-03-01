import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Bottiglia> frigo = new ArrayList<Bottiglia>();

        frigo.add(new Bottiglia(10, 100, "Acqua 1"));
        frigo.add(new Bottiglia(10, 100, "Acqua 2"));
        frigo.add(new Bottiglia(50, 100, "Acqua 3"));
        frigo.add(new Bottiglia(80, 100, "Coca Cola"));
        frigo.add(new Bottiglia(90, 100, "Fanta"));

        System.out.println("-- Elneco bottiglie base --");
        for (int i = 0; i < frigo.size(); i++) {
            System.out.println("Bottiglia " + (i + 1) + ":\n-" + frigo.get(i));
        }
        int az = -1;
        int n;
        boolean scelta = false;
        do {
            try {
                System.out.println("\n-- Azioni bottiglie --");
                System.out.println("""
                        1. per riempire
                        2. per bere
                        3. per stampare
                        0. usicre""");
                do {
                    az = in.nextInt();
                    if(az <0 || az >4){
                        System.out.println("!! Azioni non eisstente, ripovare !!");
                        continue;
                    }
                    scelta = true;

                }while (!scelta);

                scelta = false;
                switch (az) {

                    case 1:
                        System.out.println("Quale bottiglia vouoi modificare? (da 1 a "+frigo.size()+")");

                        do {
                            scelta = false;

                            System.out.print("-bottiglia: ");

                            n = in.nextInt() - 1;
                            if (n < 0 || n > frigo.size()-1){
                                System.out.println("!! Bottiglia inesistente, ripovare !!");
                                continue;
                            }
                            scelta =true;
                        }while (!scelta);

                        System.out.println("Quanto vuoi riempire bere?");
                        System.out.print("-litri: ");
                        int l = in.nextInt();

                        System.out.println("\nBottiglia di: " + frigo.get(n).getContenuto());
                        System.out.println("Stato old -->" + frigo.get(n));
                        frigo.get(n).riempi(l);
                        System.out.println("Stato new -->" + frigo.get(n));

                        break;
                    case 2:
                        System.out.println("Quale bottiglia vouoi modificare? (da 1 a "+frigo.size()+")");
                        do {
                            System.out.print("-bottiglia: ");

                            n = in.nextInt() - 1;
                            if (n < 0 || n > frigo.size()-1){
                                System.out.println("!! Bottiglia inesistente,ripovare !!");
                                continue;
                            }
                            scelta =true;

                        }while (!scelta);System.out.println("Quanto vuoi bere?");
                        System.out.print("-litri: ");
                        l = in.nextInt();

                        System.out.println("\nBottiglia di: " + frigo.get(n).getContenuto());

                        System.out.println("Stato old -->" + frigo.get(n));
                        frigo.get(n).bevi(l);
                        System.out.println("Stato new -->" + frigo.get(n));


                        break;
                    case 3:
                        System.out.println("-- Elneco bottiglie --");
                        for (int i = 0; i<frigo.size(); i++) {
                            System.out.println("Bottiglia " + (i+1) + ":\n-" + frigo.get(i));
                        }
                }
            } catch (InputMismatchException e) {
                System.out.println("!! Error, input musts be Integer !!\nripova");
                in.next();
            }
        } while (az != 0);

        System.out.println("\n-- End Program --");
    }
}