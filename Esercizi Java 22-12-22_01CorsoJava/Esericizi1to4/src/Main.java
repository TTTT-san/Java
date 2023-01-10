import java.util.Scanner;

public class Main {

    public static String nomeRettangolo(){
        return "+_______+"+"\n"+"|Teshale|"+"\n"+"+_______+";
    }

    public static int perRetQuad(int base, int altezza){  //Perimetro sia del quadrato e sia del rettangolo
        return base*2+altezza*2;
    }

    public static int areaRetQuad(int base, int altezza){//Area sia del quadrato e sia del rettangolo
        return base*altezza;
    }
    public static double perCerchio(int r){ //Perimetro del cerchio
        return r*2*3.14;
    }
    public static double areaCerchio(int r){ //Area del cerchio
        return r*r*3.14;
    }

    public static int perTriangolo(int lato){ // Perimetro Triangolo
        return  lato*3;
    }
    public static double areaTriangolo(int base){ // area Triangolo - calcolo io altezza
        double altezza = (Math.sqrt(3)/2)*base;
        return (base*altezza)/2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("---Esercizio 1:  ");
        System.out.println("Hello world!");

        System.out.println("---Esercizio 2:  ");
        System.out.println(nomeRettangolo());

        System.out.println("---Esercizio 3:  ");
        System.out.println("--Rettangolo: ");
        System.out.print("Inserire base: ");
        int base= input.nextInt();
        System.out.print("Inserire altezza:");
        int altezza= input.nextInt();
        int area=areaRetQuad(base,altezza);
        System.out.println("Area: "+areaRetQuad(base,altezza)+ " Perimetro: "+perRetQuad(base,altezza));

        System.out.println("--Quadrato: ");
        System.out.print("Inserire lato:");
        int lato = input.nextInt();
        System.out.println("Area: "+areaRetQuad(lato,lato)+ " Perimetro: "+perRetQuad(lato,lato));

        System.out.println("--Cerchio: ");
        System.out.print("Inserire raggio:");
        int r = input.nextInt();
        System.out.println("Area: "+areaCerchio(r)+" Perimetro: "+perCerchio(r));


        System.out.println("--Triangolo Equilatero ");
        System.out.print("Inserire base:");
        lato = input.nextInt();
        System.out.println("Area: "+areaTriangolo(lato)+ " Perimetro: "+perTriangolo(lato));

        System.out.println("---Esercizio 4:  ");
        System.out.print("Inserire Giorno: ");
        int g = input.nextInt();
        System.out.print("Inserire Ore: ");
        int ore = input.nextInt();
        System.out.print("Inserire Minuti: ");
        int m = input.nextInt();
        System.out.print("Inserire Secondi: ");
        int s = input.nextInt();
        int stot= (g*24*60*60)+(ore*60*60)+(m*60)+s; //calcolo secondi dei input giorno, ore e minuti
        System.out.println("I secondi sono: "+stot);

    }
}