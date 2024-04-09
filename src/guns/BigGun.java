package guns;

import guns.Weapon;

public class BigGun extends Weapon {
    @Override
    public void shot() {
        System.out.println("Big Gun делает бам бам!");
    }
}
