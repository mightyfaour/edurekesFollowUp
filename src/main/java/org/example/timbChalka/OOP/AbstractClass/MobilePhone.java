package org.example.timbChalka.OOP.AbstractClass;

public class MobilePhone implements ITelephone{

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;

        System.out.println("Mobile phone powered up");
    }

    @Override
    public void dialUp(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing "+ phoneNumber +" on Desk-Phone");
        }else {
            System.out.println("Phone is switched off");
        }


    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Answering the mobile phone ");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Melody ring!");
        }else {
            isRinging = false;
            System.out.println("Mobile phone is off or number is different.");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
