package RPG.characters;

public class Archer extends GameCharacter{
    public Archer(String name) {
        super(name);
        baseHp = 110;
        baseAttack = 13;
        baseDefense = 6;
        abilityName = "Piercing Shot";
    }
}
