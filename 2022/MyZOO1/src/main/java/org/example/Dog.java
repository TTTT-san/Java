package org.example;

public class Dog extends Animal {
    String colore;

    public Dog(String name, double weight, String colore) {
        super(name, weight);
        this.colore = colore;
    }


    @Override
    void print(){
        System.out.println("Dog: "+name+ " KG: "+weight+" colore: "+colore);
    }


    static  void makeNoise(){
        System.out.println("BAU");
    }
}


