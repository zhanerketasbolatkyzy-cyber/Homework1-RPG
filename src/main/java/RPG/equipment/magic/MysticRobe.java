package RPG.equipment.magic;

import RPG.equipment.Armor;

public class MysticRobe implements Armor {
    @Override
    public String getName(){
        return "Mystic Robe";
    }
    @Override
    public int getDefenseBonus(){
        return 4;
    }
}
