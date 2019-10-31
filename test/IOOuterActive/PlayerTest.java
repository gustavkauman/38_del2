package IOOuterActive;

import IOOuterActive.Languages.Language;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class PlayerTest {

    @Before
    public void Before() throws FileNotFoundException {
        Language language = new Language();
        language.readFile();
    }

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
                assertEquals(p.getPBalance(), balanceBefore);
            }

        }

    }

    @Test
    public void t07_player_balance_can_be_accessed_and_changed_after_game() {
        DiceGame dg = new DiceGame();
        Player p1 = new Player(); Player p2 = new Player();

        dg.initializeGame(p1, p2);

        dg.playGame(p1, p2);

        assertTrue(p1.getPBalance() >= 0);
        assertTrue(p2.getPBalance() >= 0);

        p1.setPAccount(100);
        p2.setPAccount(100);

        assertEquals(100, p1.getPBalance());
        assertEquals(100, p2.getPBalance());
    }
}