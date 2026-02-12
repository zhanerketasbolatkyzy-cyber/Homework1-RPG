package RPG.equipment.magic;

import RPG.equipment.*;


public class MagicEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon(){
        return new Staff();
    }
    @Override
    public Armor createArmor(){
        return new MysticRobe();
    }
    @Override
    public String getThemeName(){
        return "Magic";
    }

}
