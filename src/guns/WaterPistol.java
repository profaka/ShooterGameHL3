package guns;

import guns.Weapon;

public class WaterPistol extends Weapon {
    @Override
    public void shot() {
        System.out.println("Water Pistol делает пиу-пиу!");
    }
}
