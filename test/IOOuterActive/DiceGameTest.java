package IOOuterActive;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiceGameTest {

    @Test
    public void t04_dicegame_initialization_sets_player_balance() {
        DiceGame dg = new DiceGame();
        Player player1 = new Player();
        Player player2 = new Player();

        dg.initializeGame(player1,player2);

        assertEquals(1000,player1.getPBalance());
        assertEquals(1000,player2.getPBalance());
    }

    @Test
    public void t03_dicegame_can_switch_turn() {
        DiceGame dg = new DiceGame();
        Player p1 = new Player();
        Player p2 = new Player();

        dg.initializeGame(p1,p2);
        dg.switchTurn(p1,p2);
        assertTrue(p1.getTurn());
        dg.switchTurn(p1,p2);
        assertTrue(p2.getTurn());
    }
}