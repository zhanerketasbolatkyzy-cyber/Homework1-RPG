package RPG.factories;

import RPG.characters.GameCharacter;
import RPG.characters.Paladin;
public class PaladinFactories extends CharacteFactory{
    @Override
    public GameCharacter createCharacter(String name) {
        return new Paladin(name);
    }
}
