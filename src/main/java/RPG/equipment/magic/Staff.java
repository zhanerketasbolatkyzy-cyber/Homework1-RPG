package RPG.equipment.magic;

import RPG.equipment.Weapon;
public class Staff implements Weapon {
    @Override
    public String getName(){
        return "Arcane Staff";
    }
    @Override
    public int getAttackBonus(){
        return 6;
    }
}
