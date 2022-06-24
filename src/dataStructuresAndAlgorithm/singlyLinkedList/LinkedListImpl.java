package dataStructuresAndAlgorithm.singlyLinkedList;

public class LinkedListImpl<T> implements LinkedList<Integer> {
    private Node<Integer> head = null;
    private Node <Integer> tail = null;

    private int size;
    @Override
    public int size() {
        return  size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public Integer first() {
        if(isEmpty()) {
            return null;
        }
        return head.getValue();
    }

    @Override
    public Integer last() {
        if(isEmpty()) {
            return null;
        }
        return tail.getValue();
    }

    @Override
    public void addFirst(int value) {
        Node<Integer> newNode = new Node<>(value);
        if (!isEmpty()) {
            head.setNext(newNode);
        }
        head = newNode;
        tail= head;
        size++;
    }

    @Override
    public void addLast(int value) {
        Node<Integer> newNode = new Node<>(value);
        if (isEmpty()){
            head = newNode;
            tail=head;
        }
        else{
           tail.setNext(newNode);
           tail= newNode;
        }
        size++;
    }

    @Override
    public Integer removeFirst() {
        if(isEmpty()) return  null;

            int value = head.getValue();
            size--;
            return value;

    }
}
