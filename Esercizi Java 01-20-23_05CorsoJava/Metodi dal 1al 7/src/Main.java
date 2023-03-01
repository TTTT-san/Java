import java.util.Scanner;

public class Main {


    public static boolean annoBis(int anno) { //metodo 1
        if (anno % 100 == 0)
            return anno % 4 == 0 && anno % 400 == 0;
        else
            return anno % 4 == 0;
    }

    public static String eliminaVocali(String s) { //metodo 2
        return s.replaceAll("[aeiouAEIOU]", "");
    }

    public static String eliminaVocaliManuale(String s) {
        String sI = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a' && s.charAt(i) != 'A' &&
                    s.charAt(i) != 'i' && s.charAt(i) != 'I' &&
                    s.charAt(i) != 'o' && s.charAt(i) != 'O' &&
                    s.charAt(i) != 'e' && s.charAt(i) != 'E' &&
                    s.charAt(i) != 'u' && s.charAt(i) != 'U') {
                sI += s.charAt(i);
            }
        }
        System.out.println("con il for e if -->" + sI);

        return sI;
    }

    public static boolean trovaN(int n, int[] array) { //metodo 3
        for (int i = 0; i < array.length; i++)
            if (n == array[i])
                return true;

        return false;

    }

    public static int trovaArrayMinore(int[] array) { //metodo 4
        int x = array[0];
        for (int i = 0; i < array.length; i++)
            x = x > array[i] ? array[i] : x;


        return x;
    }

    public static int trovaArrayMinoreMath(int[] array) {
        int x = array[0];
        for (int i = 0; i < array.length; i++)
            x = Math.min(x, array[i]);

        System.out.println("il minore con Math --> " + x);

        return x;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = -1;
        do {
            System.out.println("""
                    I metodi:
                     1. anno bisestile
                     2. elimina vocali
                     3. trova n in un array
                     4. valore minimo di un array
                     5. ripeti stringa 
                     6. tutti uguali
                     7. concatena """);

            switch (in.nextInt()) {
                case 1:
                    System.out.println("Inserire anno");
                    System.out.print("-anno:");
                    int anno = in.nextInt();

                    System.out.println("l'anno è bisestile -->" + annoBis(anno));

                    break;
                case 2:
                    System.out.println("Inserire una stringa");
                    System.out.print("-stringa:");
                    in.nextLine();
                    String s = in.nextLine();

                    System.out.println("il risultato:" + "\n" +
                            "prima      -->" + s + "\n" +
                            "dopo       -->" + eliminaVocali(s) + "\n" +
                            "for(if())  -->" + eliminaVocaliManuale(s));
                    break;
                case 3:
                    System.out.println("Inserire dimensione array: ");
                    System.out.print("-dimensione:");
                    int[] array = new int[in.nextInt()];

                    //riempimento random da 1-100

                    randomPrintArray(array);
                    System.out.println();

                    System.out.println("Inserire il numero da cercare ");
                    System.out.print("-numero:");
                    int n = in.nextInt();
                    System.out.println("il numero è presente? --> " + trovaN(n, array));
                    break;
                case 4:
                    System.out.println("Inserire dimensione array: ");
                    System.out.print("-dimensione:");
                    array = new int[in.nextInt()];

                    randomPrintArray(array);

                    System.out.println();
                    System.out.println("il valore minore è: -->" + trovaArrayMinore(array));

                    trovaArrayMinoreMath(array);
                    break;

                case 5:
                    System.out.println("Inserire stringa");
                    System.out.print("-stringa: ");

                    in.nextLine();
                    String s1 = in.nextLine();

                    System.out.println("Inserire un numero");
                    System.out.print("-numero:");
                    int num = in.nextInt();

                    ripetiStringa(s1, num);
                    break;
                case 6:
                    System.out.println("Inserire primo numero:");
                    int n1 = in.nextInt();
                    System.out.println("Inserire secondo numero:");
                    int n2 = in.nextInt();
                    System.out.println("Inserire terzo numero:");
                    int n3 = in.nextInt();
                    System.out.print("-controllo --> ");
                    tuttiUguali(n1, n2, n3);
                    break;
                case 7:
                    in.nextLine();
                    System.out.println("Inserire la prima parola");
                    String p1 = in.nextLine();
                    System.out.println("Inserire la seconda parola");
                    String p2 = in.nextLine();
                    System.out.println("Inserire la terza parola");
                    String p3 = in.nextLine();

                    System.out.println("-risultato finale -->"+concatenaTreParole(p1, p2, p3));

                    break;
                default:
                    System.out.println("!! errore nel inserimento !!");
                    continue;

            }
            System.out.println("---- ---- ----");
            System.out.println("Vuoi continuare? (1 --> Si | 0 --> NO");
            System.out.print("-risposta: ");
            x = in.nextInt();
            System.out.println();
            while (x != 1 && x != 0) {
                System.out.println("!! Errore nel inserimento " + "\n" +
                        "ripova -->");
                System.out.print("-risposta: ");
                x = in.nextInt();
            }

        } while (x != 0);

        System.out.println("-- End Program --");


    }

    private static String concatenaTreParole(String p1, String p2, String p3) {
        return p1 += "*" + p2 + "*" + p3;
    }

    private static void tuttiUguali(int n1, int n2, int n3) {
        if (n1 == n2 && n2 == n3)
            System.out.println("Tutti uguali!");
        else
            System.out.println("Almeno uno è diverso");
    }

    private static void ripetiStringa(String s, int num) { //metodo 5
        if (num > 0)
            for (int i = 0; i < num; i++)
                System.out.println((i + 1) + ". " + s);
        else
            System.out.println("ERRORE numero negativo");
    }

    private static void randomPrintArray(int[] array) {
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);

            System.out.print("| " + array[i] + " |");
        }
    }
}