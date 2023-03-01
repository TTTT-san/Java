import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x;
        do {
            System.out.println("""
                    Metodi:
                     1. Array Inverso
                     2. Array stampa Zig-Zag
                     3. Non ???
                     4. Array media ponderata voti
                     5. Array solo dispari
                     6. Array trovare l'elemento più ripetuto
                     7. Array elemento == posizione
                     8. Stampa Istogramma
                     9. Somma di 2 Array
                     10.Prodotto di 2 Array
                     11.Stampa tabelline
                     12.Array Non in ordine crescente
                     13.Parola palindroma
                     0. Uscire""");

            System.out.print("-metodo: ");
            switch (x = in.nextInt()) {

                case 1:
                    int[] array = riempiArray(in, "numero");
                    System.out.print("Array Inverso -->");
                    stampaArrayInverso(array);

                    System.out.println();
                    System.out.print("Array Originale -->");
                    stampaArray(array);

                    System.out.println();

                    break;

                case 2:
                    int[] array2 = riempiArray(in, "numero");

                    System.out.print("Array Orginiale -->");
                    stampaArray(array2);

                    System.out.println();
                    System.out.print("Array Zig-Zag   -->");
                    stampaArrayZigZag(array2);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Non capito");
                    break;
                case 4:

                    System.out.println("Inserire dimensione array: ");
                    System.out.print("-dimensione");
                    int dim = in.nextInt();
                    int[] arrayVoto = new int[dim];
                    int[] arrayPeso = new int[dim];

                    System.out.println();
                    for (int i = 0; i < arrayVoto.length; i++) {
                        System.out.println("Inserire voto " + (i + 1) + ":");
                        System.out.print("-voto: ");
                        arrayVoto[i] = in.nextInt();

                        System.out.println("Inserire peso voto " + (i + 1) + ":");
                        System.out.print("-peso: ");
                        arrayPeso[i] = in.nextInt();
                    }

                    double mediaP = mediaPonderata(arrayVoto, arrayPeso);
                    System.out.println("Media ponderata dei voti --> " + mediaP);
                    System.out.print("Array voti:        ");
                    stampaArray(arrayVoto);

                    System.out.print("\nArray peso voti: ");
                    stampaArray(arrayPeso);
                    break;
                case 5:
                    int[] arrayInter = riempiArray(in, "numero");

                    int[] arrayDisp = arraySoloDisp(arrayInter);

                    System.out.print("Array tutti Interi: ");
                    stampaArray(arrayInter);
                    System.out.print("\nArray solo Dispari: ");
                    stampaArray(arrayDisp);
                    break;

                case 6:

                    int[] array3 = riempiArray(in, "numero");
                    int posMax = elementoPiuRipetiivo(array3);
                    System.out.print("Array: ");
                    stampaArray(array3);
                    System.out.println("\nil numero che si ripete di più --> " + array3[posMax]);
                    break;
                case 7:
                    int[] array4 = riempiArray(in, "numero");
                    // frequenzaIndiciElementi(arry4);

                    int[] arrayFreqInd = contaIndiciUgualiElementi(array4);

                    /*
                     * for (int i = 0; i < arrayFreqInd.length; i++) {
                     * for (int k = i + 1; k < array4.length; k++) {
                     * if (i == array4[k]) {
                     * if (i == k - 1)
                     * arrayFreqInd[i] = 1;
                     * 
                     * arrayFreqInd[i]++;
                     * }
                     * 
                     * }
                     * }
                     */

                    System.out.print("Array: ");
                    stampaArray(array4);
                    System.out.print("\nArray Elem == Pos: ");
                    stampaArray(arrayFreqInd);

                    break;
                case 8:
                    int[] array5 = riempiArray(in, "numero");
                    stampaIstogrammaArray(array5);

                    break;

                case 9:

                    System.out.println("--Array a---");
                    int[] a = riempiArray(in, "numero");
                    System.out.println("--Array b--");

                    int[] b;
                    do {

                        b = riempiArray(in, "numero");
                        if (a.length != b.length)
                            System.out.println("!! Errore dimensione degli array b diffrenetei !!" +
                                    "\nInserire-->" + a.length);
                    } while (a.length != b.length);

                    int[] somma = sommaArray(a, b);
                    System.out.print("Array a:     ");
                    stampaArray(a);

                    System.out.print("\nArray b:     ");
                    stampaArray(b);
                    System.out.print("\nArray somma: ");
                    stampaArray(somma);

                    break;
                case 10:
                    int[] fat1 = riempiArray(in, "numero");
                    int[] fat2;
                    do {

                        fat2 = riempiArray(in, "numero");
                        if (fat1.length != fat2.length)
                            System.out.println("!! Errore dimensione degli array b diffrenetei !!" +
                                    "\nInserire-->" + fat1.length);
                    } while (fat1.length != fat2.length);

                    int[] prodotto = prodottoArray(fat1, fat2);

                    System.out.print("Array fattore 1:      ");
                    stampaArray(fat1);

                    System.out.print("\nArray fattore 2:      ");
                    stampaArray(fat2);
                    System.out.print("\nArray prodotto:       ");
                    stampaArray(prodotto);

                    break;
                case 11:
                    System.out.println("Inserire numero base");
                    System.out.print("-numero:");
                    int n = in.nextInt();
                    stampaTabellina(n);

                    break;
                case 12:
                    int[] array6 = riempiArray(in, "numero");
                    System.out.print("Array: ");
                    stampaArray(array6);
                    System.out.println(
                            "\nl'ordine dell'array non è crescente? -->" + controlloOrdineNonCrescente(array6));
                    break;
                case 13:
                    System.out.println("Inserire una parola: ");
                    System.out.print("-parola:");
                    String p = in.next();

                    System.out.println("La parola " + p + " è palindroma? -->" + palindroma(p));
                    break;
                case 14:
                    int[] g = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
                    // quando è verificata la posizione con il contenuto
                    stampaArray(g);
                    int cont = -1;
                
                    for (int p1 = 0; p1 < g.length; p1++) {
                        System.out.println();
                        stampaArray(g);

                        for (int i = 0; i < g.length; i++) {

                            for (int k = 0; k < g.length; k++) {
                                if (i == g[k]) {
                                    cont++;

                                }

                            }

                            g[i] = cont;
                            cont = 0;

                            
                            
                        }
                        
                    }
                    System.out.println("\nrisulato finale: ");
                    stampaArray(g);
                    break;
                case 0:
                    break;

                default:
                    System.out.println("!! Metodo inesistente !!");
                    break;

            }

            if (x != 0) {
                System.out.println("\nVuoi continuare? 1 --> Si | 0 --> No\n");
                System.out.print("-rispota: ");
                x = in.nextInt();
            }

            System.out.println("\n--- fine ciclo ---\n");

        } while (x != 0);

        System.out.println("End Program!");
    }

    private static boolean palindroma(String p) {
        for (int i = 0, j = p.length() - 1; i < j; i++, j--) {
            if (p.toLowerCase().charAt(i) != p.toLowerCase().charAt(j))
                return false;

        }
        return true;
    }

    private static boolean controlloOrdineNonCrescente(int[] array6) {
        for (int i = 0; i < array6.length - 1; i++) {
            if (array6[i] > array6[i + 1])
                return false;
        }
        return true;
    }

    private static void stampaTabellina(int n) {
        System.out.println("\ntabellina del " + n + ":");
        for (int i = 0; i < 11; i++) {
            System.out.print("|" + (n * i) + "|");
        }
    }

    private static int[] prodottoArray(int[] fat1, int[] fat2) {
        int[] prodotto = new int[fat1.length];
        for (int i = 0; i < prodotto.length; i++) {
            prodotto[i] = fat1[i] * fat2[i];
        }
        return prodotto;
    }

    private static int[] sommaArray(int[] a, int[] b) {
        int[] somma = new int[a.length];

        for (int i = 0; i < somma.length; i++) {
            somma[i] = a[i] + b[i];
        }
        return somma;
    }

    private static void stampaIstogrammaArray(int[] array5) {
        for (int i = 0; i < array5.length; i++) {
            System.out.print("n: " + (array5[i]) + "\n-> ");
            for (int j = 1; j <= array5[i]; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    private static int[] contaIndiciUgualiElementi(int[] array4) {
        int max = array4[0];
        for (int i = 1; i < array4.length; i++) {
            if (array4[i] > max)
                max = array4[i];

        }

        int[] arrayFreqInd = new int[max + 1];

        for (int i = 0; i < arrayFreqInd.length; i++) {
            for (int k = 0; k < array4.length; k++) {
                if (i == array4[k]) {
                    arrayFreqInd[i]++;
                }
            }
        }
        return arrayFreqInd;
    }
    
    private static int elementoPiuRipetiivo(int[] array3) {
        int[] contArray = new int[array3.length];
        for (int i = 0, j = 0; i < array3.length; i++, j++) {
            int cont = array3[i];
            for (int k = i + 1; k < array3.length; k++) {
                if (cont == array3[k])
                    contArray[j]++;
            }

        }
        int max = contArray[0], posMax = 0;
        for (int i = 1; i < contArray.length; i++) {
            if (contArray[i] > max)
                posMax = i;

        }
        return posMax;
    }

    private static int[] arraySoloDisp(int[] arrayInter) {
        int numDisp = 0;
        for (int i = 0; i < arrayInter.length; i++)
            numDisp = arrayInter[i] % 2 != 0 ? numDisp + 1 : numDisp;

        int[] arrayDisp = new int[numDisp];

        for (int i = 0, j = 0; i < arrayInter.length; i++) {
            if (arrayInter[i] % 2 != 0) {
                arrayDisp[j] = arrayInter[i];
                j++;
            }
        }
        return arrayDisp;
    }

    private static double mediaPonderata(int[] arrayVoto, int[] arrayPeso) {
        double mediaP = 0, sommaPeso = 0;
        for (int i = 0; i < arrayVoto.length; i++) {

            mediaP += arrayVoto[i] * arrayPeso[i];

            sommaPeso += arrayPeso[i];

        }
        return mediaP / sommaPeso;
    }

    private static void stampaArrayZigZag(int[] array2) {
        for (int i = 0, j = array2.length - 1; i <= j; i++, j--) {

            if (array2.length % 2 != 0 && i == j) {
                System.out.print(array2[i] + "|");
                break;
            }
            System.out.print(array2[i] + "|" + array2[j] + "|");

        }
    }

    private static int[] riempiArray(Scanner in, String input) {
        System.out.println("Inserire dimensione array:");
        System.out.print("-dimensione:");
        int[] array = new int[in.nextInt()];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Inserire " + input + " " + (i + 1) + ":");
            System.out.print("-" + input + ":");
            array[i] = in.nextInt();
        }
        return array;
    }

    private static void stampaArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print("|" + array[i] + "|");
    }

    private static void stampaArrayInverso(int[] array) {
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print("|" + array[i] + "|");
    }
}