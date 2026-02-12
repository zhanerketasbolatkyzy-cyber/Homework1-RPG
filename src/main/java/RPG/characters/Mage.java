package RPG.characters;

public class Mage extends GameCharacter{
    public Mage(String name) {
        super(name);
        baseHp = 90;
        baseAttack = 16;
        baseDefense = 4;
        abilityName = "Fireball";
    }
}
