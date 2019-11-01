package IOOuterActive;

import IOOuterActive.Languages.Language;

class DiceGame {

    //constructor
    DiceGame() {
    }

    void initializeGame(Player p1, Player p2) {
        p1.setPAccount(1000);
        p2.setPAccount(1000);
    }

    private void switchTurn(Player p1, Player p2) {
        if (p1.getTurn()) {
            p1.setTurn(false);
            p2.setTurn(true);
        } else {
            p2.setTurn(false);
            p1.setTurn(true);
        }
    }

    void playGame(Player p1, Player p2) {
        DiceCup diceCup = new DiceCup();
        Language language = new Language();
        while (p1.getPBalance() <= 3000 && p2.getPBalance() <= 3000) {
            Player currentPlayer;
            if (p1.getTurn()) {
                currentPlayer = p1;
            } else {
                currentPlayer = p2;
            }
            diceCup.throwDice();
            int sum = diceCup.getSum();
            System.out.println(currentPlayer.getPName());
            language.languageOutput(12);
            System.out.println(sum);
            language.languageOutput(13);
            System.out.println(sum);
            currentPlayer.fieldList(sum);
            if (sum != 10) {
                switchTurn(p1, p2);
            }
        }

        if (p1.getPBalance() >= 3000) {
            language.languageOutput(14);
            System.out.println(p1.getPName() + " :-)");
        } else {
            language.languageOutput(14);
            System.out.println(p2.getPName() + " :-)");
        }
    }
}
