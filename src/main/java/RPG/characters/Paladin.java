package RPG.characters;

public class Paladin extends GameCharacter{
    public Paladin(String name) {
        super(name);
        baseHp = 150;
        baseAttack = 11;
        baseDefense = 12;
        abilityName = "Holy Strike";
    }
}
