package IOOuterActive;

public class Account {

    private int money;
    Language language = new Language();


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
        language.moneyDeposit();
        return money + "$";
    }

    //Subtracts the value of the input from the balance and returns a confirmation message
    //The method also makes sure that the balance cannot be negative.
    public String subtractMoney(int money){

        if(this.money < money) {
            this.money = 0;
            language.insufficientFunds();
            return money + "$";
        }
        else {
            this.money -= money;
            language.moneyWithdrawal();
            return money + "$";
        }
    }

    //Returns a string with a message about the account balance
    public int toStringBalance(int money){
        language.balanceOut();
        return money;
    }

}
