package IOOuterActive;

public class Account {

    private int money;


    public Account(){

    }

    //Returns the current balance of money
    public int getMoneySum(){
        return money;
    }

    //Sets the balance to the value of the input
    public void setMoney(int amount){
        this.money = amount;
    }

    //Adds the value of the input to the balance and returns a confirmation message
    public String addMoney(int money){
        this.money += money;
        return "Transaktionen er gennemført. Der er tilføjet " + money + "$ til din konto";
    }

    //Subtracts the value of the input from the balance and returns a confirmation message
    //The method also makes sure that the balance cannot be negative.
    public String subtractMoney(int money){

        if(this.money < money) {
            this.money = 0;
            return "Transaktionen er gennemført. Der er hævet " + money + "$ fra din konto, " +
                    "men da du ikke har kassekredit, er din saldo sat til 0";
        }
        else {
            this.money -= money;
            return "Transaktionen er gennemført. Der er hævet " + money + "$ fra din konto";
        }
    }

    //Returns a string with a message about the account balance
    public String toStringBalance(int money){

        return "Nuværende saldo: " + money;
    }

}
