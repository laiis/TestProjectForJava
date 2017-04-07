package oo.cc;

/**
 * Created by laiis on 2017/4/6.
 */
public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    @Override
    public String currency() {
        return currency;
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
