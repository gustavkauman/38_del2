package IOOuterActive;

import org.junit.Test;

import static org.junit.Assert.*;

public class DieTest {

    @Test
    public void roll() {
        Die d = new Die();
        int roll = d.roll();
        assertTrue(roll >= 1 && roll <= 6);
    }
}