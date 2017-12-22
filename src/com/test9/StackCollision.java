package com.test9;

public class StackCollision {
    public static void main(String[] args) {
        java.util.Stack<String> stack1 = new java.util.Stack<String>();
        for (String s : "My dog has fleas".split(" ")) {
            stack1.push(s);
        }
        while (!stack1.empty()) {
            System.out.print(stack1.pop() + " ");
        }
        System.out.println();
        com.test9.Stack<String> stack2 = new com.test9.Stack<String>();
        for (String s : "My dog has fleas".split(" ")) {
            stack2.push(s);
        }
        while (!stack2.empty()) {
            System.out.print(stack2.pop() + " ");
        }
    }
}
