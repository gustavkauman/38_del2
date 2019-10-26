package IOOuterActive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player();
        Player player2 = new Player();
//      Language language = new Language();
        Scanner in = new Scanner(System.in);

        // For furture language selection, this code will be uncommented
//      language.chooseLanguage();
        player1.toStringEnterName();
        player1.setPName(in.nextLine());
        player2.toStringEnterName();
        player2.setPName(in.nextLine());

        in.close();

        //kald på dice-game
        DiceGame diceGame = new DiceGame();
        diceGame.initializeGame(player1, player2);

        diceGame.playGame(player1, player2);


//        player1.fieldList(4);
//        player2.fieldList(2);
//        player1.fieldList(6);
//        player2.fieldList(5);
//        player1.fieldList(8);
//        player2.fieldList(12);
//        player1.fieldList(10);
//        player2.fieldList(9);


    }
}
