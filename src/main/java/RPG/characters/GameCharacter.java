package RPG.characters;

import RPG.equipment.*;
public abstract class GameCharacter {
    protected final String name;
    protected int baseHp;
    protected int baseAttack;
    protected int baseDefense;
    protected String abilityName;
    protected Weapon weapon;
    protected Armor armor;
    protected GameCharacter(String name){
        this.name=name;
    }
    public void equip(Weapon weapon, Armor armor){
        this.weapon=weapon;
        this.armor=armor;
    }
    public int getTotalAttack(){
        return baseAttack+(weapon != null ? weapon.getAttackBonus(): 0);
    }
    public int getTotalDefense(){
        return baseDefense+(armor!=null ? armor.getDefenseBonus():0);
    }
    public String summary(){
        String w=(weapon==null)? "None":weapon.getName()+" (+" +weapon.getAttackBonus()+"ATK)";
        String a=(armor==null)? "None": armor.getName()+ "(+ "+armor.getDefenseBonus()+"DEF)";
        return String.format(
                name,
                getClass().getSimpleName(),
                baseHp,
                getTotalAttack(),
                getTotalDefense(),
                abilityName,
                w,
                a
        );

    }


}
