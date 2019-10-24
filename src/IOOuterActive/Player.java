package IOOuterActive;

import java.util.Scanner;

public class Player {


    //Atributes
    private String name;

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

}

