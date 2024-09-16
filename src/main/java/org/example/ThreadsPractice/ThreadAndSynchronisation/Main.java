package org.example.ThreadsPractice.ThreadAndSynchronisation;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

//        or
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            System.out.println(e);
//            throw new RuntimeException(e);
//        }
//        try {
//            t2.join();
//        } catch (InterruptedException e) {
//            System.out.println(e);
//            throw new RuntimeException(e);
//        }

        System.out.println("Count "+counter.count);
    }
}
