package oo.cc;

/**
 * Created by laiis on 2017/4/6.
 */
public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public Money times(int multiple) {
        return Money.dollar(amount * multiple);
    }

    @Override
    public int hashCode() {
        return amount;
    }
}
