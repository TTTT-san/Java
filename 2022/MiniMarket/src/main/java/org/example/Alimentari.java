package org.example;

public class Alimentari extends Prodotto{
    String dataScadenza;
    public Alimentari(String name, String codice, String dataScadenza){
        super(name,codice);
        this.dataScadenza=dataScadenza;
    }

    void Scadenza(){
        System.out.println("Data di scadenza: " + dataScadenza);
    }
}
