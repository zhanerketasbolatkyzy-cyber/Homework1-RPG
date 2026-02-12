package RPG.equipment;

public interface EquipmentFactory {
    Weapon createWeapon();
    Armor createArmor();
    String getThemeName();
}
