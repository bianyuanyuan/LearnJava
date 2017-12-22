package com.test9;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

//upcasting to a Queue from a LinkedList
public class QueueDemo {
    public static void printQ(Queue queue) {
        while (queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }
        //System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random rand = new Random(47);
        for (int i = 0; i < 10; i++) {
            queue.offer(rand.nextInt(i + 10));
            printQ(queue);
        }
        Queue<Character> queue1 = new LinkedList<Character>();
        for (char c : "Brontosaurus".toCharArray()) {
            queue1.offer(c);
            printQ(queue1);
        }
    }
}
