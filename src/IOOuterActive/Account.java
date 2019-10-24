package IOOuterActive;

public class Account {

    private int money;






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
