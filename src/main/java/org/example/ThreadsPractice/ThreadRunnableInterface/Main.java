package org.example.ThreadsPractice.ThreadRunnableInterface;

public class Main {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread t1 = new Thread(runnable);

        t1.start(); // Start the thread, which will call the run() method

        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
                throw new RuntimeException(e);
            }
        }

    }
}
