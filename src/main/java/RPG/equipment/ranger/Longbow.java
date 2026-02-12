package RPG.equipment.ranger;

import RPG.equipment.Weapon;
public class Longbow implements Weapon{
    @Override
    public String getName(){
        return "Renger Longbow";
    }
    @Override
    public int getAttackBonus(){
        return 7;
    }
}
