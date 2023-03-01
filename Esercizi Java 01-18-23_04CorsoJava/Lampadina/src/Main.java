import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Quanti lampadine vuoi creare? ");
        Lampadina[]  arrayLamp = new Lampadina[in.nextInt()];

        for (int i = 0; i < arrayLamp.length; i++) { //ciclo di inizializzazione dell'arrayLamp
           arrayLamp[i] = new Lampadina(0);
        }

        boolean stop = false;
        int x, pos;
        do{ //azioni di Get/Set
            System.out.println("""
                    azioni che puoi fare:\s
                    1 --> Vedere lo stato
                    2 --> Cambiare lo stato
                    3 --> Stampare tutte le lampadine
                    4 --> Uscire""");
            x = in.nextInt();
            switch (x){
                case 1:
                    System.out.println("Quale lampadine vuoi vedere lo stato: (da "+"1-"+arrayLamp.length+")");
                    pos = in.nextInt()-1;
                    System.out.println("Lampadina "+pos+":"+arrayLamp[pos].statoLamp());
                    System.out.println("__________________________________");
                    break;
                case 2:
                    System.out.println("Inserire quale lampadina si desidera modifcare:(da 1-"+arrayLamp.length+")");
                    pos = in.nextInt()-1;
                    System.out.println("""
                            1 --> acceso 
                            0 --> spento""");
                   arrayLamp[pos].setStato(in.nextInt());
                   System.out.println("__________________________________");
                   break;
                case 3:
                    System.out.println("Lampadine stato:");
                    for (int j = 0; j < arrayLamp.length; j++) {
                        System.out.println("-Lampadina "+(1+j)+": "+arrayLamp[j].statoLamp());
                    }
                    System.out.println("__________________________________");
                    break;
                case 4:
                    stop = true;
                default:
                   System.out.println("!!! Azione non presente !!!");
                   System.out.println("__________________________________");


}
        }while(!stop);
    }
}