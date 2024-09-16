package org.example.ThreadsPractice.ThreadExtentionPractice1;

public class Main {
    public static void main(String[] args) {
        MyThreads ti = new MyThreads();
        ti.start(); //Start the thread, which will call the run() method

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
                throw new RuntimeException(e);
            }
        }
    }
}
