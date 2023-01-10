public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        int somP = 0;//somma numeri posizione Pari
        int somD = 0; //somma numeri posizione Dispari

        for(int i = 0; i< array.length; i++){
            array[i]=(int)(Math.random()*100);

            if(i%2==0)
                somP+=array[i];
            else
                somD+=array[i];
        }

        if(somD == somP)
            System.out.println("Pari e Disapri sono uguali" +"\n"+
                        "PozP: "+somP + "\nPozD: "+somD);
        else
            System.out.println("Pari e Disapri diversi" +"\n"+
                    "PozP: "+somP + "\nPozD: "+somD);

    }
}