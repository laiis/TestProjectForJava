package oo.cc;

/**
 * Created by laiis on 2017/4/6.
 */
public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    @Override
    public Money times(int multiple) {
        return new Dollar(amount * multiple);
    }

    @Override
    public int hashCode() {
        return amount;
    }
}
