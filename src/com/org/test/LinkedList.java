package com.org.test;


import com.test7.Note;

public class LinkedList<T> {
    private static class Node<U> {//inner class
        U item;
        Node<U> next;

        Node() {
            item = null;
            next = null;
        }

        public Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }

    private Node<T> top = new Node<T>();

    public void push(T item) {
        top = new Node<T>(item, top);
    }

    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedList<String>ls=new LinkedList<String >();
        for(String s:"Phaser on stun!".split(" ")){
            ls.push(s);
        }
        String s;
        while((s=ls.pop())!=null){
            System.out.println(s);
        }
    }
}
