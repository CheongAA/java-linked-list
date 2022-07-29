package org.example;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.add("a");
        linkedList.add("b");
        linkedList.add("c");
//        System.out.println(linkedList.get(-1));
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.get(2));
//        System.out.println(linkedList.get(3));
        System.out.println("size: " + linkedList.size());

        System.out.println("---------------");
        System.out.println("removed: " + linkedList.removeFirst());
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        System.out.println("size: " +linkedList.size());

//        System.out.println("---------------");
//        System.out.println("removed: " + linkedList.remove());
//        System.out.println(linkedList.get(0));
//        System.out.println(linkedList.get(1));
//        System.out.println("size: " +linkedList.size());

//        System.out.println("---------------");
//        linkedList.add(2,"D");
//        System.out.println(linkedList.get(-1));
//        System.out.println(linkedList.get(0));
//        System.out.println(linkedList.get(1));
//        System.out.println(linkedList.get(2));
//        System.out.println(linkedList.get(3));
//        System.out.println(linkedList.get(4));
//        System.out.println("size: " +linkedList.size());

//        System.out.println("---------------");
//        linkedList.addFirst("d");
//        System.out.println(linkedList.get(-1));
//        System.out.println(linkedList.get(0));
//        System.out.println(linkedList.get(1));
//        System.out.println(linkedList.get(2));
//        System.out.println(linkedList.get(3));
//        System.out.println("size: " +linkedList.size());
//
//        System.out.println("---------------");
//        linkedList.clear();
//        System.out.println(linkedList.get(0));
//        System.out.println("size: " +linkedList.size());

    }
}