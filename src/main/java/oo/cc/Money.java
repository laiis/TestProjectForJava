package oo.cc;

/**
 * Created by laiis on 2017/4/7.
 */
public class Money {

    protected int amount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        return amount == money.amount;
    }

}
