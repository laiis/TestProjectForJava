package oo.cc;

/**
 * Created by laiis on 2017/4/7.
 */
public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    @Override
    public int hashCode() {
        return amount;
    }
}
