package RPG.equipment.medieval;

import RPG.equipment.*;

import java.security.spec.ECField;

public class MedievalEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon(){
        return new Sword();
    }
    @Override
    public  Armor createArmor(){
        return new PlateArmor();
    }
    @Override
    public String getThemeName(){
        return "Medieval";
    }

}
