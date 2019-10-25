package IOOuterActive;

public class DiceGame {
   Player player1 = new Player();
   Player player2 = new Player();
   Player player3 = new Player();

   //constructor
   public DiceGame(){

       //Contruktion of players

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
           String pname;
           if (player3 == player1)
               pname = "Spiller 1"; //Her kunne det være nice at have inputtet fra scanneren, men det gik ik. Vi vil have spillerens navn.
           else
               pname = "Spiller 2";

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

   }

}
