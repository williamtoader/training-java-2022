package com.company.curs3java;

public class Main {
    public static void main(String[] args) {
        Account a = new Account();
        a.deposit(150);
        a.deposit(100);
        // a.withdraw(400);
        a.linkToNationalId("12");
    }
}
