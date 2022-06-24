package dataStructuresAndAlgorithm.singlyLinkedList;

public interface LinkedList <T>{

    int size();
    boolean isEmpty();
    T first();
    T last();
    void addFirst(int value);
    void addLast(int value);
    T removeFirst();
}
