package RPG.factories;

import RPG.characters.GameCharacter;

public abstract class CharacteFactory {
    public abstract GameCharacter createCharacter(String name);
}
