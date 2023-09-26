public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setAbility("Barrier");
        boss.setDamage(99);
        boss.setHealth(1000);

        Weapon weapon = new Weapon();
        weapon.setWeaponName("Ak47");
        weapon.setWeaponType("Огнестрельный");


        System.out.println("Boss Ability - " + boss.getAbility());
        System.out.println("Boss Damage - " + boss.getDamage());
        System.out.println("Boss Health - " + boss.getHealth());
        System.out.println("Boss WeaponName - " + weapon.getWeaponName());
        System.out.println("Boss WeaponType - " + weapon.getWeaponType());
    }
}