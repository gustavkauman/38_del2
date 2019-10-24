package IOOuterActive;

public class Main {
    public static void main(String[] args) {
        // this is where the program starts

        //Kan du se det her?


        Account account = new Account();
        account.setMoney(1000);
        System.out.println(account.toStringBalance(account.getMoneySum()));
        System.out.println(account.subtractMoney(2000));
        System.out.println(account.toStringBalance(account.getMoneySum()));
        System.out.println(account.addMoney(1));
        System.out.println(account.toStringBalance(account.getMoneySum()));

        Player player1 = new Player();
        Player player2 = new Player();

        player1.setPlayerName();









    }
}
