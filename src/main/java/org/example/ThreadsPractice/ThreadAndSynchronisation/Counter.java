package org.example.ThreadsPractice.ThreadAndSynchronisation;

public class Counter {
    int count = 0;

    public synchronized void incrementCount(){
        count++;
    }
}
