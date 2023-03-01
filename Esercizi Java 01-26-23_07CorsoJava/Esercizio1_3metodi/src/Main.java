import java.util.*;

public class Main {

    public static ArrayList<Integer> riempiArray() {
        ArrayList<Integer> collezione = new ArrayList<Integer>();


        return collezione;
    }


    public static int[] soloMaggioriZero(ArrayList<Integer> collezione) {
        int dim = 0;
        for (Integer x :
                collezione) {
            if (x >= 0)
                dim++;

        }

        int[] magZero = new int[dim];
        for (Integer x :
                collezione) {
            if (x >= 0) {
                magZero[dim - 1] = x;
                dim--;
            }
        }
        return magZero;
    }

    public static int[] soloMinoriZero(ArrayList<Integer> collezione) {
        int dim = 0;
        for (Integer x :
                collezione) {
            if (x < 0)
                dim++;

        }

        int[] minZero = new int[dim];
        for (Integer x :
                collezione) {
            if (x < 0) {
                minZero[dim - 1] = x;
                dim--;
            }
        }
        return minZero;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> collezione = new ArrayList<Integer>();
        boolean stop = false;
        int c = -1;
        do {
            try {
                System.out.println("Vuoi dare una capacità minima all'array?\n" +
                        "1 --> Si \n" +
                        "0 --> No");
                System.out.print("-risposta: ");
                c = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("!! Error, input must be Integer!!");
                in.next();
            }

        } while (c != 1 && c != 0);
        boolean cap = c == 1;
        int dim = 0;
        if (cap) {
            System.out.println("Inserire dimensione:");
            System.out.print("-dimensione:");
            try {
                dim = in.nextInt();
                collezione = new ArrayList<Integer>(dim);
                dim--;
            } catch (InputMismatchException e) {
                System.out.println("!! Errore, input must be integer !!");
            }
        }
        System.out.println("--Riempiere l'array di interi --");
        while (!stop) {

            try {
                System.out.println("inserire numero pos " + collezione.size() + ":");
                System.out.print("-numero: ");
                collezione.add(in.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("!! Errore, input must be integer !!");
                in.next();
                dim++;
            }


            if (dim == 0) {
                System.out.println("-- fine della capacità --");
                int x = -1;
                do {
                    try {
                        System.out.println("Vuoi continuare?\n" +
                                "1 --> Si \n" +
                                "0 --> No");
                        System.out.print("-risposta: ");
                        x = in.nextInt();
                        stop = x == 0;
                    } catch (InputMismatchException e) {
                        System.out.println("!! Error, input must be Integer!!");
                        in.next();
                    }


                    if (x != 1 && x != 0)
                        System.out.println("!! opzioni non esistente!! \n -- riprovare --");
                } while (x != 1 && x != 0);

            }


            dim = dim > 0 ? dim - 1 : dim;
        }

        System.out.print("ArrayList base: ");
        for (Integer x :
                collezione) {
            System.out.print("| " + x + " |");
        }
        System.out.print("\nArray solo >= 0: ");
        int[] magZero = soloMaggioriZero(collezione);
        for (int x :
                magZero) {
            System.out.print("| " + x + " |");

        }

        System.out.print("\nArray solo < 0: ");
        int[] minZero = soloMinoriZero(collezione);
        for (int x :
                minZero) {
            System.out.print("| " + x + " |");

        }

        int prodotto = prodottoArrayPositivi(magZero);


        int somma = sommaArrayNegativi(minZero);

        System.out.println("\n-il prodotto dei numeri positivi --> " + prodotto);
        System.out.println("-la somma dei numeri negativi --> " + somma);

        System.out.println("\n-- End Program --");

    }

    private static int prodottoArrayPositivi(int[] magZero) {
        int prodotto = 1;
        for (int i = 0; i < magZero.length; i++) {
            prodotto *= magZero[i];
        }
        return prodotto;
    }

    private static int sommaArrayNegativi(int[] minZero) {
        int somma = 0;
        for (int i = 0; i < minZero.length; i++) {
            somma += minZero[i];
        }
        return somma;
    }
}