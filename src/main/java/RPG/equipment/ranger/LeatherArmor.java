package RPG.equipment.ranger;

import RPG.equipment.Armor;
public class LeatherArmor implements Armor{
    @Override
    public String getName(){
        return "Leather Armor";
    }
    @Override
    public int getDefenseBonus(){
        return 6;
    }
}
