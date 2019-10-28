package IOOuterActive;

public class Player {

    //Attributes
    private String name;
    private Account account = new Account();
    private boolean turn;

    public Player(){
    }

    public boolean getTurn() {
        return turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    //Sets player's name via input
    public void setPName(String input){
        name = input;
    }

    //Returns the players name
    public String getPName(){
        return name;
    }

    //Prints a message asking the player to enter the desired name
    public void toStringEnterName(){

        System.out.print("Indtast spiller navn: ");
    }

    //Sets players account balance to the value of the input
    public void setPAccount(int amount){
        account.setMoney(amount);
    }

    //Returns current balance of the players account
    public int getPBalance(){

        return account.getMoneySum();
    }

    //Returns a string with a message regarding the current balance of the account
    public String toStringPBalance(){

        return account.toStringBalance(account.getMoneySum());
    }

    // Checks the value of the input and decides which field the player has landed on
    // The corresponding amount is either added or withdrawn from the players account
    public void fieldList(int sum){

        switch (sum){

            case 2:{
                System.out.println("<Tower>");
                System.out.println("Du klatre op til toppen af tårnet og finder en død rotte samt en skat til en værdi af 250");
                System.out.println(account.addMoney(250));         //Tower  +250
                System.out.println(account.toStringBalance(account.getMoneySum()) + "\n");
                break;
            }
            case 3:{
                System.out.println("<Crater>");
                System.out.println("Dit eksperiment har efterladt dig med en forkullet frisure, betal en frisør regning på 100");
                System.out.println(account.subtractMoney(100));     //Crater   -100
                System.out.println(account.toStringBalance(account.getMoneySum()) + "\n");
                break;
            }
            case 4:{
                System.out.println("<Palace gates>");
                System.out.println("Du hjælper med at forsvarer slotsporten og får 100 i bonus");
                System.out.println(account.addMoney(100));         //Palace gates  +100
                System.out.println(account.toStringBalance(account.getMoneySum()) + "\n");
                break;
            }
            case 5:{
                System.out.println("<Cold Desert>");
                System.out.println("Du er faret vild i en ørken og betaler 20 for en vej ud");
                System.out.println(account.subtractMoney(20));     //Cold Desert    -20
                System.out.println(account.toStringBalance(account.getMoneySum()) + "\n");
                break;
            }
            case 6:{
                System.out.println("<Walled city>");
                System.out.println("Du har hjulpet med at bygge bymuren og har tjent 180");
                System.out.println(account.addMoney(180));         //Walled city    +180
                System.out.println(account.toStringBalance(account.getMoneySum()) + "\n");
                break;
            }
            case 7: {
                System.out.println("<Monastery>");
                System.out.println("Klosteret tilbyder gratis ly for natten");
                System.out.println(account.addMoney(0));           //Monastery    0
                System.out.println(account.toStringBalance(account.getMoneySum()) + "\n");
                break;
            }
            case 8:{
                System.out.println("<Black cave>");
                System.out.println("Du snubler over en rotte og taber 70 guldklumper");
                System.out.println(account.subtractMoney(70));    //Black cave    -70
                System.out.println(account.toStringBalance(account.getMoneySum()) + "\n");
                break;
            }
            case 9:{
                System.out.println("<Huts in the mountain>");
                System.out.println("Der ligger en person og sover foran sin hytte og du har lange fingre. Put 60 guldklumper i lommen");
                System.out.println(account.addMoney(60));         // Huts in the mountain   +60
                System.out.println(account.toStringBalance(account.getMoneySum()) + "\n");
                break;
            }
            case 10: {
                System.out.println("<The Werewall> (Werewallwolf-wall)");
                System.out.println("Tro det eller ej, en mur lavet af varulve! Du mister en arm og 80 guldklumper, men tag en tur til"); //The Werewall (werewolf-wall  -80,
                System.out.println(account.subtractMoney(80));                  // men spilleren får en ekstra tur.
                System.out.println(account.toStringBalance(account.getMoneySum()) + "\n");
                break;
            }
            case 11: {
                System.out.println("<The pit>");
                System.out.println("Du knækker en tand på kernen i en lækker fersken, tag til tandlægen for 50 guldklumper");
                System.out.println(account.subtractMoney(50));     //The pit    -50
                System.out.println(account.toStringBalance(account.getMoneySum()) + "\n");
                break;
            }
            case 12: {
                System.out.println("<Goldmine>");
                System.out.println("Jackpot! 650 guldklumper! Du gik en tur på casino og trak i den enarmede, snup en bajer til din videre færd");
                System.out.println(account.addMoney(650));        //Goldmine     +650
                System.out.println(account.toStringBalance(account.getMoneySum()) + "\n");
                break;
            }
        }
    }


}



