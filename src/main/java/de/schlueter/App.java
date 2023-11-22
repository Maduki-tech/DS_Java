package de.schlueter;

import de.schlueter.linkedlist.LinkedList;
import de.schlueter.linkedlist.stack.Stack;

public class App {
    private static int[] input = {2, 5, 3, 4, 8};

    public static void main(String[] args) {
        // Simple array example
        // array(input);
        //
        // // Simple Linked List example
        // LList(input);

        Stack(input);
    }

    private static void Stack(int[] input2) {
        Stack<Integer> stack = new Stack<Integer>(5);
        for (int input : input2) {
            stack.push(input);
        }
        stack.printAll();

        try {
			System.out.println(stack.pop()  + " Poped element");
			System.out.println(stack.pop()  + " Poped element");
			System.out.println(stack.pop()  + " Poped element");
		} catch (Exception e) {
			e.printStackTrace();
		}

        stack.printAll();


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
        System.out.println(linkedList.getByIndexs(2));
    }
}
