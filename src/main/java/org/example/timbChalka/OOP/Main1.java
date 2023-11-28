package org.example.timbChalka.OOP;

public class Main1 {
    public static void main(String[] args) {
//        Car porsche = new Car();
//        porsche.setModel("Philip");
//        System.out.println("This model is "+ porsche.getModel() );
//        BankAccount danielAccount = new BankAccount();
//        System.out.println("Account name: "+ danielAccount.getCustomerName() + " with account number "+ danielAccount.getAccountNumber());
//
//        BankAccount philipAccount = new BankAccount(0011230, 1000.0, "Philip NEO", "mail@gmail.com", "08186082057");
//        System.out.println("Account name: "+ philipAccount.getCustomerName() + ", with account number "+ philipAccount.getAccountNumber());
//        System.out.println("Account name: "+ philipAccount.getCustomerName());
//        System.out.println(philipAccount.getAccountNumber());
//        System.out.println("$"+philipAccount.getBalance());
//        System.out.println(philipAccount.getEmail());
//        System.out.println(philipAccount.getPhoneNumber());
//        BankAccount valerieAccount = new BankAccount(0011230, 1000.0, "Valerie .O", "mail@gmail.com", "08186082057");
//        System.out.println(valerieAccount.getCustomerName());
//        System.out.println(valerieAccount.getAccountNumber());
//        System.out.println("$"+valerieAccount.getBalance());
//        System.out.println(valerieAccount.getEmail());
//        System.out.println(valerieAccount.getPhoneNumber());

        VipCustomer myCustomer = new VipCustomer();
        System.out.println("Customer name: "+myCustomer.getName()+" Credit limit: "+myCustomer.getCreditLimit()+" Email Address: "+myCustomer.getEmail());

        VipCustomer myCustomer1 = new VipCustomer("Donald Ron1", 2000);
        System.out.println("Customer name: "+myCustomer1.getName()+" Credit limit: "+myCustomer1.getCreditLimit()+" Email Address: "+myCustomer1.getEmail());

        VipCustomer myCustomer2 = new VipCustomer("DON Moore", 3000, "mails2me@gmail.com");
        System.out.println("Customer name: "+myCustomer2.getName()+" Credit limit: "+myCustomer2.getCreditLimit()+" Email Address: "+myCustomer2.getEmail());



    }
}
