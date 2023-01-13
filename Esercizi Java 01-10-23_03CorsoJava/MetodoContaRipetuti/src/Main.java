public class Main {

    public static int contaRipetuti(int[] array,int num){
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==num){
                cont++;

            }
        }
        return cont;
    }
    public static void main(String[] args) {
        int[] array = {1,1,1,3,4,5,6,6,7,1};
        int num = 1; //numero da cercare
        int cont = contaRipetuti(array,num);
        System.out.println("Il numero: "+num+"\n" +
                "-Viene ripetuto: "+cont);
    }
}