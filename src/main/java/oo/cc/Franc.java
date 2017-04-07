package oo.cc;

/**
 * Created by laiis on 2017/4/7.
 */
public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiple) {
        return new Franc(amount * multiple);
    }

    @Override
    public int hashCode() {
        return amount;
    }
}
