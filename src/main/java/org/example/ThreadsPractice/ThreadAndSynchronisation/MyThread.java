package org.example.ThreadsPractice.ThreadAndSynchronisation;

public class MyThread extends Thread{
    Counter counter;

    MyThread(Counter counter){ //constructor
        this.counter = counter;
    }


    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.incrementCount();
        }

    }
}
