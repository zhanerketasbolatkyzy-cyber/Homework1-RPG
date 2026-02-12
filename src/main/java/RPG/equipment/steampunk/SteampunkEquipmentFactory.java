package RPG.equipment.steampunk;

import RPG.equipment.Armor;
import RPG.equipment.EquipmentFactory;
import RPG.equipment.Weapon;
public class SteampunkEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new SteamRifle();
    }
    @Override
    public Armor createArmor() {
        return new BrassArmor();
    }
    @Override
    public String getThemeName() {
        return "Steampunk";
    }
}
