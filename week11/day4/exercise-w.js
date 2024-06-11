/*Exercise: Design a class named BankAccount. It should have private 
fields for balance and accountNumber. Implement methods to deposit, withdraw, 
and check balance. Use getters and setters appropriately. Ensure that the balance 
can't be set directly or go negative. */


class BankAccount {
    #balance;
    #accountNumber;

    constructor(balance, accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

//deposit

//withdraw

//check balance
get balance(){
    return this.#balance;
}
}