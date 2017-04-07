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
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquals() {
        Dollar fiveDollar = new Dollar(5);
        Dollar newFiveDollar = new Dollar(5);
        assertTrue(fiveDollar.equals(newFiveDollar));
        assertTrue(fiveDollar.equals(fiveDollar));

        Franc fiveFranc = new Franc(5);
        Franc newFiveFranc = new Franc(5);
        assertTrue(fiveFranc.equals(newFiveFranc));
        assertTrue(fiveFranc.equals(fiveFranc));
    }

    @Test
    public void testFrancMultiplecation() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
}
