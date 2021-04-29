package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {

    int hitPoints;
    int attackDamage;
    boolean hasArmor;

    public MilitaryUnit(int healthPoint, int attackDamage, boolean hasArmor) {
        this.hitPoints = healthPoint;
        this.attackDamage = attackDamage;
        this.hasArmor = hasArmor;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    abstract int doDamage();

    void sufferDamage(int damage) {
        if (hasArmor) {
            this.hitPoints -= (damage / 2);
        } else {
            this.hitPoints -= damage;
        }
    }
}
