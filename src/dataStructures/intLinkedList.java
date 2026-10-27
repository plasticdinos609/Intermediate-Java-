package dataStructures;

import java.util.Iterator;

public class intLinkedList implements Iterable<Integer> {
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public int getdata() {
            return this.data;
        }
    }

    private Node head; // Root of the list

    public intLinkedList() {
        head = null;
    }

    public void addFront(int data) {
        var node = new Node(data);
        node.next = head;
        head = node;
    }

    public void addLast(int data) {
        var node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        var current = head;
        while (current.next != null)
            current = current.next;
        current.next = node;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private Node current = head;

            public boolean hasNext() {
                return current != null;
            }

            public Integer next() {
                int data = current.data;
                current = current.next;
                return data;
            }
        };
    }

    public int getCount() {
        int count = 0;
        Node current = head;
        while (current.next != null) {
            current = current.next;
            count++;
        }

        return count;
    }

    public boolean isEmpty() {

        if (head == null) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isThere(int n) {
        Node current = head;
        while (current.next != null) {
            if (current.getdata() == n) {
                return true;
            }
            current = current.next;

        }
        return false;
    }

    public int getFirst() {
        return head.getdata();
    }

    public int getLast() {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.getdata();
    }

    public int getSpot(int spot) {
        Node current = head;
        if (spot > getCount()) {
            return -1;
        } else {
            for (int x = 0; x < spot; x++) {
                current = current.next;
            }
            return current.getdata();
        }

    }

    public void removeLast() {

        if (head == null) {
            return;
        }
        var current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = null;

    }

    public int countLess10() {
        int count = 0;
        Node current = head;
        while (current.next != null) {
            if (current.getdata() < 10) {
                count++;
            }
            current = current.next;

        }

        return count;
    }

    public void removeSpot(int num) {
        Node current = head;
        {
            for (int x = 0; x < num; x++) {
                current = current.next;
            }
            current = null;
        }
    }

    public void clear() {
        for (int x = 0; x < getCount(); x++) {
            removeLast();
        }
    }

    public boolean checkForNum(int n) {
        return isThere(n);
    }

    public int getNum(int pos) {
        return getSpot(pos);
    }

    public double avg() {
        Node current = head;
        int size = getCount();
        int total = 0;
        while (current.next != null) {
            total += current.getdata();
            current = current.next;
        }
        double average = (double) total / size;
        return average;
    }

    public int min() {
        Node current = head;
        int minimum = max();
        while (current.next != null) {
            if (current.getdata() < minimum) {
                minimum = current.getdata();
            }
            current = current.next;
        }
        return minimum;
    }

    public int max() {
        Node current = head;
        int maximum = 0;
        while (current.next != null) {
            if (current.getdata() > maximum) {
                maximum = current.getdata();
            }
            current = current.next;
        }
        return maximum;
    }

    public int findSlotMaxFirst() {
        return getSpot(max());
    }

    public int findSlotMaxLast() {
        return getSpot(min());
    }

    public void sort() {
        int size = getCount();

        for (int x = 0; x < size; x++) {
            Node current = head;
            Node prevNode = head;

            while (current.next != null) {

                Node nextNode = current.next;
                if (current.data > nextNode.data) {
                    if (current == head) {
                        current.next = nextNode.next;
                        nextNode.next = current;
                        prevNode = nextNode;
                        head = nextNode;
                    } else {
                        current.next = nextNode.next;
                        nextNode.next = current;
                        prevNode.next = nextNode;
                        prevNode = nextNode;
                    }
                } else {
                    prevNode = current;
                    current = current.next;

                }
            }

        }
    }

    public int lose58() {
        Node current = head;
        int fiftyeight = 0;
        if (current.getdata() == 58) {
            current.next = head;
            fiftyeight++;
        }
        while (current.next != null) {
            if (current.next.getdata() == 58) {
                current.next = null;
                current.next = current.next.next;
                fiftyeight++;
            }
        }
        return fiftyeight;
    }

    public int getEvenCount() {
        int count = 0;
        Node current = head;
        while (current.next != null) {
            if (current.getdata() % 2 == 0) {
                count++;
            }

        }
        return count;
    }

    public void killOdds(){
        Node current = head;
        while (current.next != null) {
            if (current.next.getdata()%2!=0){
                current.next=current.next.next;
            }
        }
    }
}
