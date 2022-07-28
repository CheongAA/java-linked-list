package org.example;

public class LinkedList implements DataStructure {
    private int size;
    private Node first;
    private Node last;

    LinkedList() {
        this.size = 0;
        this.first = null;
        this.last = null;
    }

    @Override
    public boolean add(String element) {
        Node newNode = new Node(element);
        if(this.size == 0){
            this.first = newNode;
            this.last = newNode;
        }else {
            this.last.setNext(newNode);
            this.last = newNode;
        }
        this.size ++;
        return true;
    }

    @Override
    public void add(int index, String element) {

    }

    @Override
    public void addFirst(String element) {

    }

    @Override
    public void addLast(String element) {

    }

    @Override
    public String remove() {
        return null;
    }

    @Override
    public boolean remove(String element) {
        return false;
    }

    @Override
    public String removeFirst() {
        return null;
    }

    @Override
    public String removeList() {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String get(int index) {
        if(index >=size || index < 0 ) return null;

        Node node = first;
        for(int i = 0; i<=size; i++){
            if(i == index) break;
            node = node.getNext();
        }
        return node.getElement();
    }


    @Override
    public void clear() {

    }
}
