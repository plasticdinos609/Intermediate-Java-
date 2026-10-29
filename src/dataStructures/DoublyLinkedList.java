package dataStructures;

import java.util.Iterator;

public class DoublyLinkedList<T extends Comparable<T>> implements Iterable<T> {
    private class Node implements Comparable<Node> {
        T data;
        Node prev;
        Node next;

        Node(T data) {
            this.data = data;
            prev = null;
            next = null;
        }

        public int compareTo(Node o) {
            return data.compareTo(o.data);
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void add(T element) {
        var temp = new Node(element);
        if (head == null) {
            head = temp;
        } else {
            tail.next = temp;
            temp.prev = tail;
        }
        tail = temp;
        size++;
    }

    public void addFront(T element) {
        var temp = new Node(element);
        if (head != null) {
            temp.next = head;
            head.prev = temp;
        }
        head = temp;
        size++;
    }

    public void insert(int index, T element) {
        Node current = head;
        for (int x = 0; x < index - 1; x++) {
            current = current.next;

        }
        current.next.prev = new Node(element);
        current.next = current.next.prev;
    }

    /** Inserts new node in sorted order */
    public void addSorted(T element) {
        if (head == null) {
            addFront(element);
        }
        Node current = head;
        while (current.next != null && current.prev != null) {
            if (current.data.compareTo(current.next.data) < 0 && current.data.compareTo(current.prev.data) > 0) {
                current.next.prev = new Node(element);
                current.next = current.next.prev;
            } else 
            current = current.next;
        }

    }

    public void remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        Node current = head;
        for (int x = 0; x < index - 1; x++) {
            current = current.next;

        }
        current.next = current.next.next;
        current.next.next.prev = current;
    }

    public T get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        Node current = head;
        for (int i = 0; i < index; i++)
            current = current.next;
        return current.data;
    }

    public void set(int index, T element) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

    }

    public void print() {
        for (Node current = head; current != null; current = current.next)
            System.out.print(current.data + " ");
        System.out.println();
    }

    public void printReverse() {
        for (Node current = tail; current != null; current = current.prev)
            System.out.print(current.data + " ");
        System.out.println();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void removeItem(T item) {
        Node current = tail;
        for (int x = 0; x < size; x++) {
            current = current.next;
            if (current.data == item) {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
        }
    }

    public T pop() {
        tail.next = tail;
        tail.next.prev = null;
        return null;
    }

    public Iterator<T> iterator() {
        return new Iterator<>() {
            private Node current = head;

            public boolean hasNext() {
                return current != null;
            }

            public T next() {
                T data = current.data;
                current = current.next;
                return data;
            }
        };
    }

}