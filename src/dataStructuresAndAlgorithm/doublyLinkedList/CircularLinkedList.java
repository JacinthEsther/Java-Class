package dataStructuresAndAlgorithm.doublyLinkedList;

public interface CircularLinkedList<T> {

    int size();
    boolean isEmpty();
    T first();
    Integer last();
    void addFirst(int value);
    void addLast(int value);
    T removeFirst();
    void rotate();

}
