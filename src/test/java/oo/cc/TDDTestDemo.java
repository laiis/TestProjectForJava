package oo.cc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by laiis on 2017/4/6.
 */
public class TDDTestDemo {

    @Test
    public void testMultiplecation() {
        Money fiveDollar = Money.dollar(5);
        assertEquals(Money.dollar(10), fiveDollar.times(2));
        assertEquals(Money.dollar(15), fiveDollar.times(3));

        Money fiveFranc = Money.franc(5);
        assertEquals(Money.franc(10), fiveFranc.times(2));
        assertEquals(Money.franc(15), fiveFranc.times(3));
    }

    @Test
    public void testEquals() {
        Money fiveDollar = Money.dollar(5);
        Dollar newFiveDollar = Money.dollar(5);
        assertTrue(fiveDollar.equals(newFiveDollar));
        assertTrue(fiveDollar.equals(fiveDollar));

        Money fiveFranc = Money.franc(5);
        Franc newFiveFranc = Money.franc(5);
        assertTrue(fiveFranc.equals(newFiveFranc));
        assertTrue(fiveFranc.equals(fiveFranc));
    }

}
