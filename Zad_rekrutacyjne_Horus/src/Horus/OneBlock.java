package Horus;

import java.util.Objects;

/**
* Klasa OneBlock służy zdefiniowaniu instancji pojedynczego bloku. Implementuje interfejsc Block
* oraz nadpisuje metodę toString().
*
* @author Aleksandra Brela
*/
public class OneBlock implements Block{

    // zmienna przechowujaca wartosc koloru
    private String color;
    // zmienna przechowujaca rodzaj materialu
    private String material;

    public OneBlock(){
    }

    public OneBlock(String color, String material) {
        this.color = color;
        this.material = material;
    }

    /**
    * Napdisana metoda interfejsu Block.
    *
    * @return Kolor przypisany danej instancji obiektu.
    */
    @Override
    public String getColor() {
        return color;
    }

    /**
     * Napdisana metoda interfejsu Block.
     *
     * @return Rodzaj materiału przypisany danej instancji obiektu.
     */
    @Override
    public String getMaterial() {
        return material;
    }

    /**
     * Nadpisanie metody equals().
     *
     * @return True jeśli porównywane obiekty mają takie same wartości parametrów Color oraz Material.
     * */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OneBlock)) return false;
        OneBlock oneBlock = (OneBlock) o;
        return Objects.equals(color, oneBlock.color) &&
                Objects.equals(material, oneBlock.material);
    }

    /**
     * Nadpisanie metody toString().
     *
     * @return Tekstowa reprezentacja obiektu.
     */
    @Override
    public String toString() {
        return "Block{" +
                "color='" + color + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
}

