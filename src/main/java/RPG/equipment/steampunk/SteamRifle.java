package RPG.equipment.steampunk;

import RPG.equipment.Weapon;

public class SteamRifle implements Weapon {
    @Override
    public String getName() {
        return "Steam Rifle";
    }
    @Override
    public int getAttackBonus() {
        return 9;
    }
}
