public class Boss extends GameEntity {
    private Weapon weapon;

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public String printInfo(){
        return "Boss Damage: " + getDamage() + ", Boss Health: " + getHealth() + ", Boss Weapon: "+ weapon.getName() + ", Type of Weapon: " + weapon. getType();

    }
}
