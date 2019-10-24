package IOOuterActive;

public class Account {

    private int money;




    //Returns the current balance of money
    public int getMoneySum(){

        return money;
    }

    //Adds the value of the input to the balance
    public String addMoney(int money){

        this.money += money;
        return "Transaktionen er gennemført. Der er tilføjet " + money + "$ til din konto";
    }

    //Subtracts the value of the input from the balance
    public String subtractMoney(int money){

        this.money -= money;
        return "Transaktionen er gennemført. Der er hævet " + money + "$ fra din konto";
    }

}
