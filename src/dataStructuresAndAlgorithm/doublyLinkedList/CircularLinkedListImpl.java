package dataStructuresAndAlgorithm.doublyLinkedList;

import dataStructuresAndAlgorithm.singlyLinkedList.Node;

public class CircularLinkedListImpl<Integer> implements CircularLinkedList<java.lang.Integer> {
    private Node<Integer> tail = null;

    private int size =0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public java.lang.Integer first() {
        if(isEmpty()) return  null;
        return tail.getNext().getValue();
    }

    @Override
    public java.lang.Integer last() {
        if(isEmpty()) return  null;
        return tail.getValue();
    }

    @Override
    public void addFirst(int value) {
        if(size == 0){
            tail = new Node<>(value);
            tail.setNext(tail);
        }
        else{
            Node<Integer> newNode = new Node<>(value);
            tail.setNext(newNode);
        }
        size++;
    }

    @Override
    public void addLast(int value) {
        addFirst(value);
        tail =tail.getNext();
    }

    @Override
    public java.lang.Integer removeFirst() {
         if (isEmpty( )) return null;
         Node<Integer> head = tail.getNext( );
         if (head == tail) tail = null;
         else tail.setNext(head.getNext( ));
         size--;
         return head.getValue();
    }

    @Override
    public void rotate() {
        if(tail != null) tail =tail.getNext();
    }
}
