package IOOuterActive;

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
            language.throwSum();
            System.out.println(sum);
            language.landedOn();
            System.out.println(sum);
            currentPlayer.fieldList(sum);

            if (sum != 10) {
                switchTurn(p1, p2);
            }
        }

        if (p1.getPBalance() >= 3000) {
            language.winner();
            System.out.println(p1.getPName() + " :-)");
        } else {
            language.winner();
            System.out.println(p2.getPName() + " :-)");
        }
    }


    //Contruktion of players
/*
       player1.setPAccount(1000);
       player2.setPAccount(1000);

       //player3 = player1;
       boolean turn = true;
       //While win-condition ikke er opfyldt, så kører spillet.
       while (player1.getPBalance() < 3000 && player2.getPBalance() < 3000){

           //Introducer en boolean/variabel som ændre hvilken spiller der kører det igennem
           if (turn == true){
               player3 = player1;

           }
           else{
               player3 = player2;
           }

           //1)  Roll dice for player x
           DiceCup diceCup = new DiceCup();
           diceCup.throwDice();
           diceCup.sumFace();
           int rollVal = diceCup.getSum(); // to terningers sum

           // name generator
           Player moamal = new Player();
           String pname;
           if (player3 == player1) {
               moamal.setPName("Moamal"); //Her kunne det være nice at have inputtet fra scanneren, men det gik ik. Vi vil have spillerens navn.
               pname = moamal.getPName();
           } else {
               moamal.setPName("Jaafar");
               pname = moamal.getPName();
           }

           System.out.println(pname);
           System.out.println("Du har slået: " + rollVal);

           //2)  Resolve result of dice and affect the points on the account
           System.out.println("Du er landet på nummer " + rollVal + " som er:" );
           player3.fieldList(rollVal);
           // player3.toString(RollVal);

           //3) after round, players swap and checks for extra turn
           if (turn == true && rollVal != 10){
               turn = false;
           }
           else if (turn == false && rollVal != 10){
               turn = true;
           }

           //4) Her er en tillykkemeddelelse
           if(player3.getPBalance()>3000){
               System.out.println("Tillykke "+ pname +" du har vundet :-)");
           }
       }
   }*/
}
