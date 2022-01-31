package Horus;

import java.util.List;


/**
* Klasa Main służy do testowania napisanego programu. Program wykonuje się w metodzie main.
 *
 * @author Aleksandra Brela
*/
public class Main {

    public static void main(String[] args) {


        Block ob1 = new OneBlock("rozowy","metal");
        Block ob2 = new OneBlock("niebieski","metal");
        Block ob3 = new OneBlock("zolty","drewno");
        Block ob4 = new OneBlock("zielony","plastik");
        Block ob5 = new OneBlock("brazowy","drewno");
        Block ob6 = new OneBlock("zolty","plastik");
        Block ob7 = new OneBlock("zielony","drewno");
        Block ob8 = new OneBlock("czerwony","metal");


        Wall wall = new Wall();
        List<Block> list = wall.getBlocks();

        list.add(ob1);
        list.add(ob2);
        list.add(ob3);
        list.add(ob4);
        list.add(ob5);
        list.add(ob6);
        list.add(ob7);
        list.add(ob8);


        try {

            System.out.println("Lista blokow zawierajacych się w obiekcie Wall: ");
            list.stream().forEach(s -> System.out.println(s));
            System.out.println("");

            System.out.println("Ilosc elementow w liscie: " + wall.count());
            System.out.println("");

            System.out.println("Elementy z podanego materialu: " + wall.findBlocksByMaterial("plastik"));
            System.out.println("");

            System.out.println("Dowolny element z podanego koloru: " + wall.findBlockByColor("zielony"));
            System.out.println("");

            System.out.println("KONIEC PROGRAMU");

        }
        catch (Exception e) {

            System.out.println("\nException: " + e);

        }



    }

}
