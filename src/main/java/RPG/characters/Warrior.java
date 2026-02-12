package RPG.characters;

public class Warrior extends GameCharacter{
    public Warrior(String name) {
        super(name);
        baseHp = 140;
        baseAttack = 12;
        baseDefense = 10;
        abilityName = "Shield Bash";
    }
}
