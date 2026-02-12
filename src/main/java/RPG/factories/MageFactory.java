package RPG.factories;

import RPG.characters.*;

public class MageFactory extends CharacteFactory{
    @Override
    public GameCharacter createCharacter(String name){
        return new Mage(name);
    }
}
