package RPG.equipment.ranger;

import RPG.equipment.*;

public class RangerEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() {
        return new Longbow();
    }
    @Override
    public Armor createArmor(){
        return new LeatherArmor();
    }
    @Override
    public String getThemeName(){
        return "Ranger";
    }
}
