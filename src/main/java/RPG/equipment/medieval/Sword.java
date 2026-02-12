package RPG.equipment.medieval;

import RPG.equipment.Weapon;

public class Sword implements Weapon {
    @Override
    public String getName(){
        return "Steel Sword";
    }
    @Override
    public int getAttackBonus(){
        return 8;
    }
}
