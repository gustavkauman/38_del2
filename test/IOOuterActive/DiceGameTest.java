package IOOuterActive;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiceGameTest {

    @Test
    public void dicegame_initialization_sets_player_balance() {
        DiceGame dg = new DiceGame();
        Player player1 = new Player();
        Player player2 = new Player();

        dg.initializeGame(player1,player2);

        assertEquals(1000,player1.getPBalance());
        assertEquals(1000,player2.getPBalance());
    }

}