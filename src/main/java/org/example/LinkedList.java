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
        if(size == 0){
            first = newNode;
        }else {
            last.setNext(newNode);
        }
        last = newNode;
        size ++;
        return true;
    }

    @Override
    public void add(int index, String element) {
        if(!checkIndexValid(index)){
            throw new IndexOutOfBoundsException("index invalid");
        }

        if (index == 0) {
            addFirst(element);
            return;
        }

        Node head = first;
        for(int i = 0; i<size; i++){
            if(i  == index - 1) {
                Node newNode =  new Node(element);
                newNode.setNext(head.getNext());
                head.setNext(newNode);
                size ++;
                return;
            };
            head = head.getNext();
        }
    }

    @Override
    public void addFirst(String element) {
        Node newNode =  new Node(element);
        newNode.setNext(first);
        first = newNode;
        size ++;
    }

    @Override
    public void addLast(String element) {
        add(element);
    }

    @Override
    public String remove() {
        size --;
        Node newLast = getNode(size - 1);
        Node removedNode = newLast.getNext();
        newLast.setNext(null);
        last = newLast;

        return removedNode.getElement();
    }

    @Override
    public boolean remove(String element) {
        Node head = first;
        Node prevHead = null;
        for(int i = 0; i<=size; i++){
            if(head.getElement().equals(element)) {
                if(prevHead == null) {
                    first = head.getNext();
                }else {
                    prevHead.setNext(head.getNext());
                }
                size --;
                return true;
            };
            prevHead = head;
            head = head.getNext();
        }
        return false;
    }

    @Override
    public String removeFirst() {
        size --;
        Node newFirst = first.getNext();
        Node removedNode = first;
        first = newFirst;
        return removedNode.getElement();
    }

    @Override
    public String removeLast() {
        return remove();
    }

    @Override
    public int size() { return size; }

    @Override
    public String get(int index) {
        Node node = getNode(index);
        if(node == null) {
            throw new IndexOutOfBoundsException("index invalid");
        }
        return node.getElement();
    }


    @Override
    public void clear() {
        this.size = 0;
        this.first = null;
        this.last = null;
    }

    private boolean checkIndexValid(int index) {
        if(index >= size || index < 0 ) {
            return false;
        };
        return true;
    }

    private Node getNode(int index) {
        if(!checkIndexValid(index)){
            return null;
        }

        Node head = first;
        for(int i = 0; i<=size; i++){
            if(i == index) break;
            head = head.getNext();
        }
        return head;
    }
}
