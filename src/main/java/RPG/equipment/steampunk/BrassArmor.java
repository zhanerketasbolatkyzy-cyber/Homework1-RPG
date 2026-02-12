package RPG.equipment.steampunk;

import RPG.equipment.Armor;
public class BrassArmor implements Armor {
    @Override
    public String getName() {
        return "Brass Armor";
    }
    @Override
    public int getDefenseBonus() {
        return 8;
    }
}
