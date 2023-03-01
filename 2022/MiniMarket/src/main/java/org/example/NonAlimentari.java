package org.example;

public class NonAlimentari extends Prodotto{
String avvertenze;
String tipoUtilizo;

    public NonAlimentari(String name, String codice, String avvertenze) {
        super(name, codice);
        this.avvertenze=avvertenze;
    }

    void Avvertenze(){
        System.out.println("Avvertenze: "+avvertenze);
    }
}
