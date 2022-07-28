package org.example;

public class Node {
    private String element;
    private Node next;

    Node (String element){
        this.element = element;
        this.next =  null;
    }

    public String getElement () {
        return element;
    }

    public Node getNext () {
        return next;
    }
    public void setNext (Node next) {
        this.next = next;
    }
}
