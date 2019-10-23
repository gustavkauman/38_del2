package IOOuterActive;

import java.util.Scanner;

public class Player {


    //Atributes
    private String name;
    private int money;

    //Metoder
    public Player(){

    }

    //Skal uddybes?
    public void playGame(){

    }

    //Sets players name via input
    public void setPlayerName(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter player name: ");
        name = in.nextLine();

        in.close();
    }


    //Returns the current balance of the players money
    public int getMoneySum(){

        return money;
    }

    public void addMoney(){


    }

    public void subtractMoney(){

    }



}

