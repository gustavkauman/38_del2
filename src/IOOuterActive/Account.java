package IOOuterActive;

class Account {

    private Language language = new Language();
    private int money;


    Account() {

    }

    //Returns the current balance of money
    int getMoneySum() {
        return money;
    }

    //Sets the balance to the value of the input
    void setMoney(int amount) {
        this.money = amount;
    }

    //Adds the value of the input to the balance and returns a confirmation message
    String addMoney(int money) {
        this.money += money;
        language.moneyDeposit();
        return money + "$";
    }

    //Subtracts the value of the input from the balance and returns a confirmation message
    //The method also makes sure that the balance cannot be negative.
    String subtractMoney(int money) {

        if (this.money < money) {
            this.money = 0;
            language.insufficientFunds();
            return money + "$";
        } else {
            this.money -= money;
            language.moneyWithdrawal();
            return money + "$";
        }
    }

    //Returns a string with a message about the account balance
    int toStringBalance(int money) {
        language.balanceOut();
        return money;
    }

}
