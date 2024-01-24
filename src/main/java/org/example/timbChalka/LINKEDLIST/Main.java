package org.example.timbChalka.LINKEDLIST;

import java.util.ArrayList;
/*
created by Philip Nwodu for a learning purpose ONLY
*/

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Tim", 59.21);
        Customer anotherCustomer;
        anotherCustomer = customer;
        System.out.println(customer.getName());
        System.out.println(anotherCustomer.getName());
        anotherCustomer.setName("Philip");
        System.out.println(customer.getName());
        System.out.println(anotherCustomer.getName());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i+" ; "+intList.get(i));
        }
        System.out.println("==============================================");
        intList.add(1,2);
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i+" ; "+intList.get(i));
        }
    }
}
