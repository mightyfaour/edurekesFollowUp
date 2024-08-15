package org.example.timbChalka.OOP.InheritanceCharllenge.Bank;

public class BankAccount {
//    Fields or Instance variable
    protected String accountNumber;
    protected double balance;
//    Constructor
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

//    deposite mothod
    public void deposite(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
        }
        else {
            System.out.println("Insufficient funds");
        }
        return false;
    }
    public double getBalance() {
        return balance;
    }
}

class SavingAccount extends BankAccount {
    private double interestRate;

    public SavingAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
}
