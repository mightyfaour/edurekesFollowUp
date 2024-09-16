package org.example.Collections.QUEUE.PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<String> numbers = new PriorityQueue<>(Comparator.comparing(String::length));
        numbers.add("one");
        numbers.add("Two");
        numbers.add("Three");
        numbers.add("Four");
        numbers.add("Five");
//        numbers.offer(41);
//        numbers.offer(72);
//        numbers.offer(10);
//        numbers.offer(12);

        System.out.println(numbers);
    }
}
