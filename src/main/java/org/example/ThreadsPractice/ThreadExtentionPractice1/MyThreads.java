package org.example.ThreadsPractice.ThreadExtentionPractice1;

public class MyThreads extends Thread{
    public  void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread "+ i);
            try {
                Thread.sleep(500); //Pause execution for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(e);
                throw new RuntimeException(e);
            }
        }
    }
}
