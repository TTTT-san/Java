import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Car auto = new Car();
        int n = 0;
        System.out.println("""
                1. per guidare
                2. per rifornire carburante
                3. pr visualizzare il carburante 
                0. per uscire""");
        System.out.print("-azione: ");
        n = in.nextInt();
        switch (n) {

            case 1:
                auto.setCarburante(50);
                auto.addGas(14);
                System.out.println("\nQuanti km vuoi fare? ");
                System.out.print("-km: ");
                int km = in.nextInt();
                System.out.println("Stato partenza --> "+auto);
                auto.drive(km);
                System.out.println("Stato arrivo --> " +auto);


        }
        System.out.println("-- End Program --");
        in.close();

    }
}