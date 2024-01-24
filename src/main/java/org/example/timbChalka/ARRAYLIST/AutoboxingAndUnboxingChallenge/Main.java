package org.example.timbChalka.ARRAYLIST.AutoboxingAndUnboxingChallenge;

/*
created by Philip Nwodu for a learning purpose ONLY!
*/
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Zenith Bank of Africa");
        bank.addBranch("Surulere");
        bank.addCustomer("Surulere","Philip", 1000.00);
        bank.addCustomer("Surulere", "Bode", 200.00);
        bank.addCustomer("Surulere","Mike", 370.00 );

        System.out.println("New bank listed");
        bank.addBranch("Mushin");
        bank.addCustomer("Mushin", "Emmanuel", 150.54);

        bank.addCustomerTransaction("Surulere", "Philip", 456.89);
        bank.addCustomerTransaction("Surulere", "Philip", 26.39);
        bank.addCustomerTransaction("Surulere", "Bode", 666.12);

//        if false, the transaction will not show
        bank.listCustomers("Surulere", false);

    }
}
