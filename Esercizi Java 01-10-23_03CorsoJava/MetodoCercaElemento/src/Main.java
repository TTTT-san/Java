public class Main {

    public static boolean cercaElemento(int[] array,int num){
        for (int i = 0; i < array.length; i++) {
            if(array[i]==num){
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {1,2,4,5,6};

        int num = 1; //numero da cercare

        boolean risposta = cercaElemento(array,num);

        if(risposta){
            System.out.println("Elemento trovato:  "+risposta);
        }else{
            System.out.println("Elemento non presente:  "+risposta);
        }

    }
}