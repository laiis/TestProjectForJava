package oo.cc;

/**
 * Created by laiis on 2017/4/7.
 */
public class Money {

    protected int amount;
    protected String currency;

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money times(int multiple) {
        return new Money(amount * multiple, currency);
    }

    public String currency() {
        return currency;
    }

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

    @Override
    public String toString() {
        return amount + " , " + currency;
    }
}
