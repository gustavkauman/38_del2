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

    //Adds the value of the input to the players balance
    public void addMoney(int money){

        this.money += money;

    }

    //Subtracts the input from the players balance
    public void subtractMoney(int money){

        this.money -= money;

    }



}

