package org.example.timbChalka.OOP;

public class Account {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public Account(){
        this(56789, 2.50,"Defaul Name", "mails@gmail.com","07011763414" );
        System.out.println("Empty constructor called");
    }
    public Account(int accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
//
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Old balance:"+this.balance);
        System.out.println("Deposit of "+ depositAmount + " made. New balance is " + this.balance);
    }
    public void withdrawal(double withdrawalAmount){
        if (this.balance - withdrawalAmount < 0){
            System.out.println("Old balance before withdrawal :"+ this.balance);
            System.out.println("Only "+ this.balance + " available. Withdrawal not processed");
        }else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of "+ withdrawalAmount + " PROCESSED. Remaining balance is "+ this.balance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
