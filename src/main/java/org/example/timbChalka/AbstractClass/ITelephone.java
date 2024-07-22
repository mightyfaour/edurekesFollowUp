package org.example.timbChalka.AbstractClass;

public interface ITelephone {
    void powerOn();
    void dialUp(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
