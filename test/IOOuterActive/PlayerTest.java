package IOOuterActive;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void t05_player_each_field_has_influence_on_players_balance() {
        Player p = new Player();
        p.setPAccount(1000);

        for (int i = 2; i <= 12; i++) {

            int balanceBefore = p.getPBalance();

            p.fieldList(i);

            if (i != 7) {
                assertTrue(p.getPBalance() != balanceBefore);
            } else {
                assertTrue(p.getPBalance() == balanceBefore);
            }

        }

    }
}