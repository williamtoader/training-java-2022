package com.company.curs3java;

public class Account {

    private int accountNo;
    private double amount;
    private String nationalId;

    public Account() {
        amount = 0;
    }

    public void deposit(int amount) {
        this.amount += amount;
    }

    public void withdraw(int amount) throws NotEnoughMoneyException {
        if(this.amount < amount)
            throw new NotEnoughMoneyException("Saracie", new RuntimeException());
        else this.amount -= amount;
    }

    public void linkToNationalId(String nationalId) {
        if(InvalidNationalIdException.checkId(nationalId)){
            this.nationalId = nationalId;
        }
        else {
            throw new InvalidNationalIdException("Nu e ok!", new RuntimeException());
        }
    }
}
