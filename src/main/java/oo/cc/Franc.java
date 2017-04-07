package oo.cc;

/**
 * Created by laiis on 2017/4/7.
 */
public class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Franc times(int multiple) {
        return new Franc(amount * multiple);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Franc franc = (Franc) o;

        return amount == franc.amount;
    }

    @Override
    public int hashCode() {
        return amount;
    }
}
