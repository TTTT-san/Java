package it.cfpvigorelli;


public class Rettangolo {

    int h,b;
    public Rettangolo(int altezza, int base){
        h=altezza;
        b=base;

    }

    public int perimetro(){
        return h*2+b*2;
    }

    public int area(){
        return h*b;
    }

    @Override
    public String toString(){
        return "--Altezza: "+h+"\n--Base: "+b;
    }
}
