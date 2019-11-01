package IOOuterActive;

import IOOuterActive.Languages.Language;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        Player player1 = new Player();
        Player player2 = new Player();
        Language language = new Language();
        Scanner in = new Scanner(System.in);

        // For furture language selection, this code will be uncommented
        language.readFile();
        player1.toStringEnterName();
        player1.setPName(in.nextLine());
        player2.toStringEnterName();
        player2.setPName(in.nextLine());
        in.close();

        //kald på dice-game
        DiceGame diceGame = new DiceGame();
        diceGame.initializeGame(player1, player2);
        diceGame.playGame(player1, player2);
    }
}
