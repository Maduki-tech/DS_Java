package de.schlueter;

import de.schlueter.linkedlist.LinkedList;

public class App {
    private static int[] input = {2, 5, 3, 4, 8};

    public static void main(String[] args) {
        // Simple array example
        array(input);

        // Simple Linked List example
        LList(input);
    }

    private static void array(int[] input) {
        Arrays arrays = new Arrays(input);
        arrays.print();
    }

    private static void LList(int[] input) {
        LinkedList linkedList = new LinkedList();

        for (int number : input) {
            linkedList.add(number);
        }
        System.out.println( linkedList.getByIndexs(2));
    }
}
