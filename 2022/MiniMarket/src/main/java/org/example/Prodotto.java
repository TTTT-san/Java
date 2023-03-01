package org.example;


public class Prodotto {
    String name;
    String codice;
    public Prodotto(String name, String codice){
        this.name = name;
        this.codice=codice;
    }

    void print(){
        System.out.println("Nome: "+name+"\n"+
                            "Codice: "+codice);
    }
}
