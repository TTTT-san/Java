package org.example;

/**
 * Hello world!
 *
 */
public class Zoo
{

    public static void main( String[] args )
    {
        Animal a = new Animal("Sergio",4.3);
        Animal a2 = new Animal("Giorgio",55);
        Dog fido = new Dog("Fido",12,"white");
        Dog pluto = new Dog("Pluto",12,"red");

        a.print();
        a2.print();

        fido.print(); //abbiamo fattto un Override del metodo print()
        pluto.print();




    }
}













