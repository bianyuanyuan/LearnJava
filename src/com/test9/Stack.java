package com.test9;
//making a stack from a LinkedList

import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> storge = new LinkedList<T>();

    public void push(T v) {
        storge.addFirst(v);
    }

    public T peek() {
        return storge.getFirst();
    }

    public T pop() {
        return storge.removeFirst();
    }

    public boolean empty() {
        return storge.isEmpty();
    }

    public String toString() {
        return storge.toString();
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();
        for (String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();//test
        Stack<Character> ch = new Stack<Character>();
        ch.push('U');
        ch.push('n');
        ch.push('c');
        ch.pop();
        ch.push('r');
        ch.push('e');
        ch.push('t');
        ch.pop();
        ch.pop();
        ch.push('a');
        ch.pop();
        while (!ch.empty()) {
            System.out.print(ch.pop() + " ");
        }
    }
}