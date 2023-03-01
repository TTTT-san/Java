package org.example;

public class Animal {
    String name;
    double weight;


    public Animal(String name, double weight) {
        this.name = name;
        this.weight = weight;

    }

    void print(){ // stampare nome e peso
        System.out.println("Animal: "+name+ " KG: "+weight);
    }

    static void makeNoise(){

    }


}
