package Horus;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
* Klasa Wall wykonuje logike programu, rozszerza klase OneBlock oraz implementuje dwa interfejsy:
* Structure oraz CompositeBlock.
*
* @author Aleksandra Brela
*/
public class Wall extends OneBlock implements Structure, CompositeBlock{

    // zadeklarowanie listy zawierającej obiekty, ktore implementuja interfejs Block
    private List<Block> blocks;

    // wywołując konstruktor bezargumentowy klasy Wall, zostaje utworzona lista typu ArrayList
    public Wall(){

        blocks = new ArrayList<Block>();

    }

    /**
     * Nadpisana metoda interfejsu Structure.
     *
     * @param color Kolor, po którego wartości, zostanie wyszukany element w liście.
     * @return Dowolny element o podanym kolorze w postaci obietu Optional.
     */
    @Override
    public Optional<Block> findBlockByColor(String color) {

        return blocks.stream().filter(b -> color == b.getColor()).findAny();

    }

    /**
     * Nadpisana metoda interfejsu Structure.
     *
     * @param material Materiał, po którego wartości, zostanie wyszukany element w liście.
     * @return Wszystkie elementy z danego materiału w postaci obiektu ArrayList.
     */
    @Override
    public List<Block> findBlocksByMaterial(String material) {

        List<Block> temp = new ArrayList<Block>();

        for(Block next: blocks){
            if(material == next.getMaterial()){
                temp.add(next);
            }
        }

        return temp;
    }

    /**
     * Nadpisana metoda interfejsu Structure.
     *
     * @return Liczba wszystkich elementów tworzących strukturę w postaci typu prymitywnego int.
     */
    @Override
    public int count() {
        return blocks.size();
    }


    /**
     * Nadpisana metoda interfejsu CompositeBlock.
     *
     * @return Zadeklarowaną lista z danej instacji obiektu.
     */
    @Override
    public List<Block> getBlocks() {
        return blocks;
    }
}
