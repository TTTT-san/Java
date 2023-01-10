import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire il primo valore: ");
        int val1 = input.nextInt();
        System.out.println("Inserire il secondo valore: ");
        int val2 = input.nextInt();

        System.out.println("Somma: "+(val1+val2));
    }
}