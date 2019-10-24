package IOOuterActive;

public class Account {

    private int money;




    //Returns the current balance of money
    public int getMoneySum(){

        return money;
    }

    //Adds the value of the input to the balance
    public void addMoney(int money){

        this.money += money;

    }

    //Subtracts the value of the input from the balance
    public void subtractMoney(int money){

        this.money -= money;

    }

}
