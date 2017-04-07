package oo.cc;

/**
 * Created by laiis on 2017/4/7.
 */
public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public String currency() {
        return currency;
    }

    @Override
    public Money times(int multiple) {
        return Money.franc(amount * multiple);
    }

    @Override
    public int hashCode() {
        return amount;
    }
}
