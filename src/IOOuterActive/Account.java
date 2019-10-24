package IOOuterActive;

public class Account {

    private int money;


    public Account(){

    }


    //Returns the current balance of money
    public int getMoneySum(){

        return money;
    }

    //Adds the value of the input to the balance and returns a confirmation message
    public String addMoney(int money){

        this.money += money;
        return "Transaktionen er gennemført. Der er tilføjet " + money + "$ til din konto";
    }

    //Subtracts the value of the input from the balance and returns a confirmation message
    //The method also makes sure that the balance cannot be negative.
    public String subtractMoney(int money){

        if(this.money < money)
            this.money = 0;
        else
        this.money -= money;

        return "Transaktionen er gennemført. Der er hævet " + money + "$ fra din konto";
    }

}
