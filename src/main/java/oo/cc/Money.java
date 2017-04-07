package oo.cc;

/**
 * Created by laiis on 2017/4/7.
 */
public abstract class Money {

    protected int amount;

    public static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    public static Franc franc(int amount) {
        return new Franc(amount);
    }

    public abstract Money times(int multiple);

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        if (!(o instanceof Money)) {
            return false;
        }

        Money money = (Money) o;

        return amount == money.amount;
    }

}
