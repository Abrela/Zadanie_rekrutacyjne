package Horus;

import java.util.List;

/**
* Interfejs CompositeBlock wraz z interfejsem Block, który rozszerza, określa zachowania dla przygotowywanej
* struktury listy obiektów implementujących go.
*
* @author Aleksandra Brela
*/
interface CompositeBlock extends Block {

    List<Block> getBlocks();

}

