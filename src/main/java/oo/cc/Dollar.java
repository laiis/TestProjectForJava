package oo.cc;

/**
 * Created by laiis on 2017/4/6.
 */
public class Dollar {

    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiple) {
        return new Dollar(amount * multiple);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dollar dollar = (Dollar) o;

        return amount == dollar.amount;
    }

    @Override
    public int hashCode() {
        return amount;
    }
}
