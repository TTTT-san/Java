package it.cfpvigorelli;

public class Quadrato {

        //proprieta-field-campi di un quadrato:
    int lato; // dimensione lato

    //metodo costruttore
    public Quadrato(int lato){
        this.lato = lato;
    }
    //meotdi standard
    public int area(){ //meotodo per calcolare l'area
        return lato*lato;
    }

    public int perimetro(){//meotodo per calcolare il perimetro
        return lato*4;
    }

    @Override
    public String toString(){
        return "-lato: "+lato;
    }
}




