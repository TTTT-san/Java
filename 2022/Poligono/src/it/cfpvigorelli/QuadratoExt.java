package it.cfpvigorelli;

public class QuadratoExt extends Rettangolo{

    public QuadratoExt(int lato){
        super(lato,lato);
    }

    //i metodi perimetro e l'area si possono usare quelle del Rettangolo


    @Override
    public String toString() {
        return "QuadratoEx di lato: "+h;
    }

    public void add(){}

}
