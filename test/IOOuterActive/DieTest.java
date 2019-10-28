package IOOuterActive;

import org.junit.Test;

import static org.junit.Assert.*;

public class DieTest {

    @Test
    public void t01_die_can_roll() {
        Die d = new Die();
        int roll = d.roll();
        assertTrue(roll >= 1 && roll <= 6);
    }

    @Test
    public void t02_die_is_statistically_correct() {
        Die d = new Die();
        int[] fallouts = new int[6];
        for (int i = 0; i <= 6000000; i++) {
            int roll = d.roll();
            switch (roll) {
                case 1: fallouts[0]++; break;
                case 2: fallouts[1]++; break;
                case 3: fallouts[2]++; break;
                case 4: fallouts[3]++; break;
                case 5: fallouts[4]++; break;
                case 6: fallouts[5]++; break;
            }
        }

        int delta = (int) (1000000 * 0.005);

        assertEquals(1000000,fallouts[0],delta);
        assertEquals(1000000,fallouts[1],delta);
        assertEquals(1000000,fallouts[2],delta);
        assertEquals(1000000,fallouts[3],delta);
        assertEquals(1000000,fallouts[4],delta);
        assertEquals(1000000,fallouts[5],delta);

    }
}