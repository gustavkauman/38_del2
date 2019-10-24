package IOOuterActive;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player player1 = new Player();
        Player player2 = new Player();
        Scanner in = new Scanner(System.in);
        player1.toStringEnterName();
        player1.setPName(in.nextLine());
        player1.setPAccount(0);
        player2.toStringEnterName();
        player2.setPName(in.nextLine());
        player2.setPAccount(0);
        in.close();

        player1.fieldList(4);

        player2.fieldList(2);










    }
}
