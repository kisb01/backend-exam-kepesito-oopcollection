package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {

    boolean firstHit;

    public HeavyCavalry() {
        super(150, 20, true);
        this.firstHit = true;
    }

    @Override
    int doDamage() {
        if (this.firstHit) {
            this.firstHit = false;
            return this.attackDamage * 3;
        } else {
            return this.attackDamage;
        }
    }
}