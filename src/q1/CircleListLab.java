package q1;

import dataStructures.CircularLinkedList;

public class CircleListLab {
    public static void main(String[] args) {
        var list = new CircularLinkedList<Integer>();
        System.out.println(list.size());

        list.add(5);
        list.add(7);
        list.add(13);

        System.out.println(list.size());
        list.print();

        list.removeAt(1);
        list.print();

        try {
            list.removeAt(1000000000);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("No index");
         }


        for (var x : list)
            System.out.print(x + " ");
        System.out.println();
    }
}
