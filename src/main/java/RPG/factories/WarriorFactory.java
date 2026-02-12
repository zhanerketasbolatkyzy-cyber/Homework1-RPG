package RPG.factories;

import RPG.characters.GameCharacter;
import RPG.characters.Warrior;

public class WarriorFactory extends CharacteFactory{
    @Override public GameCharacter createCharacter(String name){
        return new Warrior(name);
    }
}
