package org.example.timbChalka.OOP.InheritanceCharllenge.Bank;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", 0.00);
//        account.accountNumber;
        account.balance = account.getBalance();
        System.out.println("Account number: " + account.accountNumber);
        System.out.println("Balance: " + account.balance);
        account.deposite(1000);
        System.out.println("Account number: " + account.accountNumber);
        System.out.println("Balance: $" + account.balance);
        System.out.println(account.withdraw(500));
        System.out.println("Account number: " + account.accountNumber + " Balance: " + account.balance);



    }
}
