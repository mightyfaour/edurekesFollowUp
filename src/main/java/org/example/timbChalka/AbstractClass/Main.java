package org.example.timbChalka.AbstractClass;

public class Main {
    public static void main(String[] args) {
        ITelephone philPhone;
        philPhone = new DeskPhone(182057);
        philPhone.powerOn();
        philPhone.callPhone(123456);
        philPhone.answer();
        System.out.println("'-------------------------------------------'");

        philPhone = new MobilePhone(123456);
        philPhone.powerOn();
        philPhone.callPhone(123456);
        philPhone.answer();

    }
}
