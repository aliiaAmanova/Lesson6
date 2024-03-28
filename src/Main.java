public class Main {
    public static void main(String[] args) {
   Boss boss = new Boss();
   boss.setDamage(700);
   boss.setHealth(1000);
   boss.setWeapon(new Weapon(WeaponType.NUCLEAR, "Nuclear Bomb"));


   System.out.println(boss.printInfo());

   Skeleton skeleton = new Skeleton();
   skeleton.setDamage(400);
   skeleton.setHealth(600);
   skeleton.setWeapon(new Weapon(WeaponType.ARROWS, "Arrows: "));
   skeleton.setNumberOfArrows(20);

   Skeleton skeleton1 = new Skeleton();
   skeleton1.setDamage(500);
   skeleton1.setHealth(700);
   skeleton1.setWeapon(new Weapon(WeaponType.ARROWS," Poison Arrows: "));
   skeleton1.setNumberOfArrows(30);

        System.out.println(skeleton.printInfo());
        System.out.println(skeleton1.printInfo());


    }
}