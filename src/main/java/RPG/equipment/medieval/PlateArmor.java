package RPG.equipment.medieval;

import RPG.equipment.Armor;

public class PlateArmor implements Armor {
    @Override
    public String getName(){
        return "Plate Armor";
    }
    @Override
    public int getDefenseBonus(){
        return 10;
    }
}
