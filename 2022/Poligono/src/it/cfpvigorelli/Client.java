package it.cfpvigorelli;

public class Client {
    public static void main(String[] args){
        Quadrato q = new Quadrato(10);

        System.out.println("Quadrato:");
        System.out.println("-Perimetro: "+q.perimetro());
        System.out.println("-Area: "+q.area());
        System.out.println("-"+q.toString());

        System.out.println(); //salta riga vuota

        System.out.println("Rettangolo:");
        Rettangolo r = new Rettangolo(5,8);
        System.out.println("-Perimetro: "+r.perimetro());
        System.out.println("-Area: "+r.area());
        System.out.println(r.toString());

        System.out.println("");

        QuadratoExt qe = new QuadratoExt(10);
        Rettangolo qe2 = new QuadratoExt(10) //OK


        qe.add();
       /* qe2.add();  non vale */

        System.out.println(qe);




    }

}
