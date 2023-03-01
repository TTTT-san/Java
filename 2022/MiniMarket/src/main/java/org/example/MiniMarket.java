package org.example;

public class MiniMarket {
   public static void main( String[] args){
       Prodotto x = new Prodotto("G","1234");
       x.print();

       System.out.println("//Alimentare: ");
       Alimentari uva = new Alimentari("Uva","00020","12/08/28");
       uva.print();
       uva.Scadenza();
       System.out.println("//Non alimentare ");
       NonAlimentari Detersivo = new NonAlimentari("Detersivo","01200","Tenere lontano dalla portata dei bambini");
       Detersivo.print();
       Detersivo.Avvertenze();


   }


}
