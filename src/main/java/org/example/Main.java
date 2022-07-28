package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");

        System.out.println(linkedList.get(-1));
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.get(3));
    }
}