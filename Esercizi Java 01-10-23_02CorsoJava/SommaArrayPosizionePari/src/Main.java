public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];
        int sommP = 0;
        for(int i = 0 ; i< array.length; i++){
            array[i] = (int)(Math.random()*100);
            if(i%2==0){
                sommP+=array[i];
            }
        }

        System.out.println("La somma dei numeri in posizione pari è: "+sommP);
    }
}