import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        //Bottiglie
        Bottiglia[] list = new Bottiglia[3];
        list[0] = new Bottiglia(10, "Coca Cola");
        list[1] = new Bottiglia(20, "Fanta");
        list[2] = new Bottiglia(15, "Acqua");

        int tipo, sel, quant;
        boolean stop = false;
        do{
            System.out.println("""
                    Scegliere  tipo di bottiglia : \s
                    1 --> Coca Cola
                    2 --> Fanta
                    3 --> Acqua
                    """);
            tipo = in.nextInt()-1;

            System.out.println("""
                    Azioni che puoi fare:\s
                    1 --> bevi
                    2 --> riempi
                    3 --> stato bottiglia
                    """);
            sel = in.nextInt();

            switch (sel) {
                case 1:
                    System.out.println("Inserire quantià: ");
                    quant = in.nextInt();
                    list[tipo].bevi(quant);
                    break;

                case 2:
                    System.out.println("Inserire quantià: ");
                    quant = in.nextInt();
                    list[tipo].riempi(quant);
                    break;

                case 3:
                    System.out.println("Stato bottiglia:");
                    System.out.println("-Tipo --> " + list[tipo].getTipo() + "\n" +
                            "-Quantià --> " + list[tipo].getQuantita()+"l");

                    System.out.println("-----------------------------------------");
                    break;
                case 4:
                    stop = true;

            }

        }while(!stop);


        System.out.println("!! Fine programma  !!");
    }
}