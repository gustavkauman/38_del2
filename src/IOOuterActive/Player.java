package IOOuterActive;

import java.util.Scanner;

public class Player {


    //Atributes
    private String name;
    private Account account = new Account();


    public Player(){

    }

    //Skal uddybes?
    public void playGame(){

    }


    //Sets players name via input
    public void setPName(String input){

        name = input;
        System.out.println("Dit navn er nu: " + name +"\n");
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
                System.out.println("Tower");
                System.out.println(account.addMoney(250));          //Tower  +250
            }
            break;
            case 3:{
                System.out.println("Crater");
                System.out.println(account.subtractMoney(100));     //Crater   -100
            }
            break;
            case 4:{
                System.out.println("Palace gates");
                System.out.println(account.addMoney(100));         //Palace gates  +100
            }
            break;
            case 5:{
                System.out.println("Cold Desert");
                System.out.println(account.subtractMoney(20));     //Cold Desert    -20
            }
            break;
            case 6:{
                System.out.println("Walled city");
                System.out.println(account.addMoney(180));         //Walled city    +180
            }
            break;
            case 7: {
                System.out.println("Monastery");
                System.out.println(account.addMoney(0));           //Monastery    0
            }
            break;
            case 8:{
                System.out.println("Black cave");
                System.out.println(account.subtractMoney(70));    //Black cave    -70
            }
            break;
            case 9:{
                System.out.println("Huts in the mountain");
                System.out.println(account.addMoney(60));         // Huts in the mountain   +60
            }
            break;
            case 10: {
                System.out.println("The werewall (werewallwolf-wall)");
                System.out.println(account.subtractMoney(60));               //The Werewall (werewolf-wall)        -80,
                                                                             // men spilleren får en ekstra tur.
            }
            break;
            case 11: {
                System.out.println("The pit");
                System.out.println(account.subtractMoney(50));     //The pit    -50
            }
            break;
            case 12: {
                System.out.println("Goldmine");
                System.out.println(account.addMoney(650));        //Goldmine     +650
            }
            break;
        }
    }








}



