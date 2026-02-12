package RPG.factories;

import RPG.characters.*;

public class ArcherFactory extends CharacteFactory{
    @Override
    public GameCharacter createCharacter(String name){
        return new Archer(name);
    }
}
