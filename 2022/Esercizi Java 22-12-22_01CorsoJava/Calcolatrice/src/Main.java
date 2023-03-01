import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("!Non inserire il valore 0!");
        System.out.println("Inserire il primo valore: ");
        float val1= input.nextInt();
        System.out.println("Inserire il secondo valore: ");
        float val2 = input.nextInt();
        System.out.println("-Addizione: "+(val1+val2));
        System.out.println("-Differenza: "+(val1-val2));
        System.out.println("-Moltiplicazione: "+(val1*val2));
        System.out.println("-Divisione: "+val1/val2);

    }
}