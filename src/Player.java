import guns.*;

public class Player {
    private Weapon[] weaponSlots;

    public Player() {
        // Снаряжаем нашего игрока
        weaponSlots = new Weapon[] {
                new BigGun(),
                new WaterPistol(),
                new Rpg(),
                new Pistol(),
                new Slingshot(),
                new Colt()
        };
    }

    public int getSlotsCount() {
        // length - позволяет узнать, сколько всего слотов с оружием у игрока
        return weaponSlots.length;
    }

    public void shotWithWeapon(int slot) {
        // если значение slot больше значения последнего элемента массива, то
        // выйти из метода написав об этом в консоль
        if (slot >= getSlotsCount() ){
            System.out.println("Вели неправильное число, повторите попытку!");
            return;
        }else if(slot < -1){
            System.out.println("Вели неправильное число, повторите попытку!");
            return;
        }
        // Получаем оружие из выбранного слота
        Weapon weapon = weaponSlots[slot];
        // Огонь!
        weapon.shot();
    }
}
