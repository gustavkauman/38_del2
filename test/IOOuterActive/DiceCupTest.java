package IOOuterActive;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiceCupTest {

    @Test
    public void dicecup_can_throw_dice() {
        DiceCup dc = new DiceCup();
        assertEquals(0, dc.getSum());
        dc.throwDice();
        int outcome = dc.getSum();
        assertTrue(outcome >= 2 && outcome <= 12);
    }
}