public class Main {

    public static int  somma(int x, int y){
        return x+y;
    }
    public static void main(String[] args) {

        int x = (int)(Math.random()*100);
        int y = (int)(Math.random()*100);

        int som = somma(x,y);
        System.out.println("Somma di due valore Random: "+ som+"\n" +
                "-valore 1: "+x+ "\n" +
                "-valore 2: "+y);
    }
}