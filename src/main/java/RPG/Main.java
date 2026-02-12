package RPG;

import RPG.characters.GameCharacter;
import RPG.equipment.EquipmentFactory;
import RPG.equipment.magic.MagicEquipmentFactory;
import RPG.equipment.medieval.MedievalEquipmentFactory;
import RPG.equipment.ranger.RangerEquipmentFactory;
import RPG.factories.*;
import RPG.equipment.steampunk.SteampunkEquipmentFactory;


public class Main {
    public static void main(String[] args) {
        CharacteFactory WarriorFactory = new WarriorFactory();
        CharacteFactory MageFactory = new MageFactory();
        CharacteFactory ArcherFactory = new ArcherFactory();
        CharacteFactory paladinFactory = new PaladinFactories();
        GameCharacter p = paladinFactory.createCharacter("Ernar");
        GameCharacter w = WarriorFactory.createCharacter("Aldar");
        GameCharacter m = MageFactory.createCharacter("Aruzhan");
        GameCharacter a = ArcherFactory.createCharacter("Daniyar");
        EquipmentFactory steam = new SteampunkEquipmentFactory();
        EquipmentFactory medieval = new MedievalEquipmentFactory();
        EquipmentFactory magic = new MagicEquipmentFactory();
        EquipmentFactory ranger = new RangerEquipmentFactory();

        w.equip(medieval.createWeapon(), medieval.createArmor());
        m.equip(magic.createWeapon(), magic.createArmor());
        a.equip(ranger.createWeapon(), ranger.createArmor());
        p.equip(steam.createWeapon(), steam.createArmor());
        System.out.println(p.summary());
        System.out.println(w.summary());
        System.out.println(m.summary());
        System.out.println(a.summary());
    }
}
