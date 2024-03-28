public class Skeleton extends Boss {
    private int numberOfArrows;

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }
    public String printInfo(){
        return "Skeleton Damage: " + getDamage() + ", Skeleton Health: "+ getHealth() + ", Skeleton Weapon: " + getWeapon().getName()+ ", Type of Weapon: "+ getWeapon().getType()+ ", Number of Arrows: "+ getNumberOfArrows();
    }
}

