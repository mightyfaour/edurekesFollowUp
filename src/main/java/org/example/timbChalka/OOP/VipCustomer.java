package org.example.timbChalka.OOP;

public class VipCustomer {
    private String name;
    private int creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Don Ron",1000, "mails123@gmail.com");
    }

    public VipCustomer(String name, int creditLimit) {

        this(name, creditLimit, "email@mail.com");
    }

    public VipCustomer(String name, int creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return emailAddress;
    }
}
